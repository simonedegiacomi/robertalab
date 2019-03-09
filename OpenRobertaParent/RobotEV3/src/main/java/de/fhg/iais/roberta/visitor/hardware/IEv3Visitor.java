package de.fhg.iais.roberta.visitor.hardware;

import de.fhg.iais.roberta.syntax.action.ev3.ShowPictureAction;
import de.fhg.iais.roberta.visitor.hardware.actor.IActors4AutonomousDriveRobots;
import de.fhg.iais.roberta.visitor.hardware.actor.ICommunicationVisitor;
import de.fhg.iais.roberta.visitor.hardware.actor.ISpeechVisitor;
import de.fhg.iais.roberta.visitor.hardware.sensor.ISensorVisitor;

public interface IEv3Visitor<V> extends IActors4AutonomousDriveRobots<V>, ICommunicationVisitor<V>, ISpeechVisitor<V>, ISensorVisitor<V> {
    V visitShowPictureAction(ShowPictureAction<V> showPictureAction);
}
