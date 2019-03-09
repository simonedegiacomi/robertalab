package de.fhg.iais.roberta.visitor.hardware.actor;

import de.fhg.iais.roberta.syntax.action.communication.*;
import de.fhg.iais.roberta.syntax.action.communication.CommunicationReceiveAction;
import de.fhg.iais.roberta.visitor.hardware.IHardwareVisitor;

public interface ICommunicationVisitor<V> extends IHardwareVisitor<V> {

    /**
     * visit a {@link CommunicationReceiveAction}.
     *
     * @param bluetoothReceiveActionbluetoothReceiveAction to be visited
     */
    V visitCommunicationReceiveAction(CommunicationReceiveAction<V> communicationReceiveAction);

    /**
     * visit a {@link BluetoothConnectAction}.
     *
     * @param bluetoothConnectAction to be visited
     */
    V visitBluetoothConnectAction(BluetoothConnectAction<V> bluetoothConnectAction);

    /**
     * visit a {@link CommunicationSendAction}.
     *
     * @param communicationSendAction to be visited
     */
    V visitCommunicationSendAction(CommunicationSendAction<V> communicationSendAction);

    /**
     * visit a {@link BluetoothWaitForConnectionAction}.
     *
     * @param bluetoothWaitForConnection to be visited
     */
    V visitBluetoothWaitForConnectionAction(BluetoothWaitForConnectionAction<V> bluetoothWaitForConnection);

    /**
     * visit a {@link BluetoothCheckConnectAction}.
     *
     * @param bluetoothCheckConnectAction to be visited
     */
    V visitBluetoothCheckConnectAction(BluetoothCheckConnectAction<V> bluetoothCheckConnectAction);

}