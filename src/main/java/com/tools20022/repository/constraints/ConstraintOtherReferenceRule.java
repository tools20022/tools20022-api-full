/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.constraints;

import com.tools20022.core.repo.NotImplementedConstraintException;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.sese.*;
import com.tools20022.repository.msg.MessageAndBusinessReference1;
import com.tools20022.repository.msg.MessageAndBusinessReference6;
import com.tools20022.repository.msg.MessageAndBusinessReference7;
import com.tools20022.repository.msg.MessageAndBusinessReference8;
import java.util.Arrays;

/**
 * Reference/OtherReference should be used to reference a transfer instruction
 * or a transfer cancellation request 'message' sent in a proprietary way or
 * used for a system reference. If Reference/OtherReference is present,
 * Reference/OtherReference/MessageName must contain 'fax' or 'phone' or
 * 'email', etc.
 */
public class ConstraintOtherReferenceRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV05
	 * TransferInstructionStatusReportV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference/OtherReference should be used to reference a transfer instruction or a transfer cancellation request 'message' sent in a proprietary way or used for a system reference. If Reference/OtherReference is present, Reference/OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherReferenceRule#forTransferInstructionStatusReportV04
	 * ConstraintOtherReferenceRule.forTransferInstructionStatusReportV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferInstructionStatusReportV05> forTransferInstructionStatusReportV05 = new MMConstraint<TransferInstructionStatusReportV05>() {
		{
			validator = ConstraintOtherReferenceRule::checkTransferInstructionStatusReportV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReferenceRule";
			definition = "Reference/OtherReference should be used to reference a transfer instruction or a transfer cancellation request 'message' sent in a proprietary way or used for a system reference. If Reference/OtherReference is present, Reference/OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOtherReferenceRule.forTransferInstructionStatusReportV04;
			owner_lazy = () -> TransferInstructionStatusReportV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV05
	 * TransferCancellationStatusReportV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference/OtherReference should be used to reference a  transfer cancellation request 'message' sent in a proprietary way or used for a system reference. If Reference/OtherReference is present, References/OtherReference/MessageName must contain, for example, 'fax' or 'phone' or 'email'."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherReferenceRule#forTransferCancellationStatusReportV04
	 * ConstraintOtherReferenceRule.forTransferCancellationStatusReportV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferCancellationStatusReportV05> forTransferCancellationStatusReportV05 = new MMConstraint<TransferCancellationStatusReportV05>() {
		{
			validator = ConstraintOtherReferenceRule::checkTransferCancellationStatusReportV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReferenceRule";
			definition = "Reference/OtherReference should be used to reference a  transfer cancellation request 'message' sent in a proprietary way or used for a system reference. If Reference/OtherReference is present, References/OtherReference/MessageName must contain, for example, 'fax' or 'phone' or 'email'.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOtherReferenceRule.forTransferCancellationStatusReportV04;
			owner_lazy = () -> TransferCancellationStatusReportV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV04
	 * TransferInstructionStatusReportV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference/OtherReference should be used to reference a transfer instruction or a transfer cancellation request 'message' sent in a proprietary way or used for a system reference. If Reference/OtherReference is present, Reference/OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherReferenceRule#forTransferInstructionStatusReportV05
	 * ConstraintOtherReferenceRule.forTransferInstructionStatusReportV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherReferenceRule#forTransferInstructionStatusReportV03
	 * ConstraintOtherReferenceRule.forTransferInstructionStatusReportV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferInstructionStatusReportV04> forTransferInstructionStatusReportV04 = new MMConstraint<TransferInstructionStatusReportV04>() {
		{
			validator = ConstraintOtherReferenceRule::checkTransferInstructionStatusReportV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReferenceRule";
			definition = "Reference/OtherReference should be used to reference a transfer instruction or a transfer cancellation request 'message' sent in a proprietary way or used for a system reference. If Reference/OtherReference is present, Reference/OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOtherReferenceRule.forTransferInstructionStatusReportV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOtherReferenceRule.forTransferInstructionStatusReportV03;
			owner_lazy = () -> TransferInstructionStatusReportV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV04
	 * TransferCancellationStatusReportV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference/OtherReference should be used to reference a  transfer cancellation request 'message' sent in a proprietary way or used for a system reference. If Reference/OtherReference is present, References/OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherReferenceRule#forTransferCancellationStatusReportV05
	 * ConstraintOtherReferenceRule.forTransferCancellationStatusReportV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherReferenceRule#forTransferCancellationStatusReportV03
	 * ConstraintOtherReferenceRule.forTransferCancellationStatusReportV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferCancellationStatusReportV04> forTransferCancellationStatusReportV04 = new MMConstraint<TransferCancellationStatusReportV04>() {
		{
			validator = ConstraintOtherReferenceRule::checkTransferCancellationStatusReportV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReferenceRule";
			definition = "Reference/OtherReference should be used to reference a  transfer cancellation request 'message' sent in a proprietary way or used for a system reference. If Reference/OtherReference is present, References/OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOtherReferenceRule.forTransferCancellationStatusReportV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOtherReferenceRule.forTransferCancellationStatusReportV03;
			owner_lazy = () -> TransferCancellationStatusReportV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV02
	 * TransferCancellationStatusReportV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "OtherReference should be used to reference a  transfer cancellation request 'message' sent in a proprietary way or used for a system reference. If OtherReference is present, OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransferCancellationStatusReportV02> forTransferCancellationStatusReportV02 = new MMConstraint<TransferCancellationStatusReportV02>() {
		{
			validator = ConstraintOtherReferenceRule::checkTransferCancellationStatusReportV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReferenceRule";
			definition = "OtherReference should be used to reference a  transfer cancellation request 'message' sent in a proprietary way or used for a system reference. If OtherReference is present, OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc.";
			owner_lazy = () -> TransferCancellationStatusReportV02.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV03
	 * TransferCancellationStatusReportV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "OtherReference should be used to reference a  transfer cancellation request 'message' sent in a proprietary way or used for a system reference. If OtherReference is present, OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherReferenceRule#forTransferCancellationStatusReportV04
	 * ConstraintOtherReferenceRule.forTransferCancellationStatusReportV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransferCancellationStatusReportV03> forTransferCancellationStatusReportV03 = new MMConstraint<TransferCancellationStatusReportV03>() {
		{
			validator = ConstraintOtherReferenceRule::checkTransferCancellationStatusReportV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReferenceRule";
			definition = "OtherReference should be used to reference a  transfer cancellation request 'message' sent in a proprietary way or used for a system reference. If OtherReference is present, OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOtherReferenceRule.forTransferCancellationStatusReportV04);
			owner_lazy = () -> TransferCancellationStatusReportV03.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV02
	 * TransferInstructionStatusReportV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "OtherReference should be used to reference a transfer instruction or a transfer cancellation request 'message' sent in a proprietary way or used for a system reference. If OtherReference is present, OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransferInstructionStatusReportV02> forTransferInstructionStatusReportV02 = new MMConstraint<TransferInstructionStatusReportV02>() {
		{
			validator = ConstraintOtherReferenceRule::checkTransferInstructionStatusReportV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReferenceRule";
			definition = "OtherReference should be used to reference a transfer instruction or a transfer cancellation request 'message' sent in a proprietary way or used for a system reference. If OtherReference is present, OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc.";
			owner_lazy = () -> TransferInstructionStatusReportV02.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV03
	 * TransferInstructionStatusReportV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "OtherReference should be used to reference a transfer instruction or a transfer cancellation request 'message' sent in a proprietary way or used for a system reference. If OtherReference is present, OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherReferenceRule#forTransferInstructionStatusReportV04
	 * ConstraintOtherReferenceRule.forTransferInstructionStatusReportV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransferInstructionStatusReportV03> forTransferInstructionStatusReportV03 = new MMConstraint<TransferInstructionStatusReportV03>() {
		{
			validator = ConstraintOtherReferenceRule::checkTransferInstructionStatusReportV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReferenceRule";
			definition = "OtherReference should be used to reference a transfer instruction or a transfer cancellation request 'message' sent in a proprietary way or used for a system reference. If OtherReference is present, OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOtherReferenceRule.forTransferInstructionStatusReportV04);
			owner_lazy = () -> TransferInstructionStatusReportV03.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference1
	 * MessageAndBusinessReference1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "OtherReference should be used for transfers sent by proprietary way or for system references. \nIf OtherReference is present, OtherReference/MessageName must contain 'fax' or 'phone' or 'email', for example."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MessageAndBusinessReference1> forMessageAndBusinessReference1 = new MMConstraint<MessageAndBusinessReference1>() {
		{
			validator = ConstraintOtherReferenceRule::checkMessageAndBusinessReference1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReferenceRule";
			definition = "OtherReference should be used for transfers sent by proprietary way or for system references. \nIf OtherReference is present, OtherReference/MessageName must contain 'fax' or 'phone' or 'email', for example.";
			owner_lazy = () -> MessageAndBusinessReference1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference6
	 * MessageAndBusinessReference6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "OtherReference should be used to reference a transfer instruction or a transfer cancellation request 'message' sent in a proprietary way or used for a system reference. If OtherReference is present, OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherReferenceRule#forMessageAndBusinessReference7
	 * ConstraintOtherReferenceRule.forMessageAndBusinessReference7}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MessageAndBusinessReference6> forMessageAndBusinessReference6 = new MMConstraint<MessageAndBusinessReference6>() {
		{
			validator = ConstraintOtherReferenceRule::checkMessageAndBusinessReference6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReferenceRule";
			definition = "OtherReference should be used to reference a transfer instruction or a transfer cancellation request 'message' sent in a proprietary way or used for a system reference. If OtherReference is present, OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOtherReferenceRule.forMessageAndBusinessReference7);
			owner_lazy = () -> MessageAndBusinessReference6.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference7
	 * MessageAndBusinessReference7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference/OtherReference should be used to reference a transfer instruction or a transfer cancellation request 'message' sent in a proprietary way or used for a system reference. If Reference/OtherReference is present, Reference/OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherReferenceRule#forMessageAndBusinessReference8
	 * ConstraintOtherReferenceRule.forMessageAndBusinessReference8}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherReferenceRule#forMessageAndBusinessReference6
	 * ConstraintOtherReferenceRule.forMessageAndBusinessReference6}</li>
	 * </ul>
	 */
	public static final MMConstraint<MessageAndBusinessReference7> forMessageAndBusinessReference7 = new MMConstraint<MessageAndBusinessReference7>() {
		{
			validator = ConstraintOtherReferenceRule::checkMessageAndBusinessReference7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReferenceRule";
			definition = "Reference/OtherReference should be used to reference a transfer instruction or a transfer cancellation request 'message' sent in a proprietary way or used for a system reference. If Reference/OtherReference is present, Reference/OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOtherReferenceRule.forMessageAndBusinessReference8);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOtherReferenceRule.forMessageAndBusinessReference6;
			owner_lazy = () -> MessageAndBusinessReference7.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference8
	 * MessageAndBusinessReference8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference/OtherReference should be used to reference a transfer instruction or a transfer cancellation request 'message' sent in a proprietary way or used for a system reference. If Reference/OtherReference is present, Reference/OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherReferenceRule#forMessageAndBusinessReference7
	 * ConstraintOtherReferenceRule.forMessageAndBusinessReference7}</li>
	 * </ul>
	 */
	public static final MMConstraint<MessageAndBusinessReference8> forMessageAndBusinessReference8 = new MMConstraint<MessageAndBusinessReference8>() {
		{
			validator = ConstraintOtherReferenceRule::checkMessageAndBusinessReference8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReferenceRule";
			definition = "Reference/OtherReference should be used to reference a transfer instruction or a transfer cancellation request 'message' sent in a proprietary way or used for a system reference. If Reference/OtherReference is present, Reference/OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOtherReferenceRule.forMessageAndBusinessReference7;
			owner_lazy = () -> MessageAndBusinessReference8.mmObject();
		}
	};

	/**
	 * Reference/OtherReference should be used to reference a transfer
	 * instruction or a transfer cancellation request 'message' sent in a
	 * proprietary way or used for a system reference. If
	 * Reference/OtherReference is present, Reference/OtherReference/MessageName
	 * must contain 'fax' or 'phone' or 'email', etc.
	 */
	public static void checkTransferInstructionStatusReportV05(TransferInstructionStatusReportV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Reference/OtherReference should be used to reference a transfer
	 * cancellation request 'message' sent in a proprietary way or used for a
	 * system reference. If Reference/OtherReference is present,
	 * References/OtherReference/MessageName must contain, for example, 'fax' or
	 * 'phone' or 'email'.
	 */
	public static void checkTransferCancellationStatusReportV05(TransferCancellationStatusReportV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Reference/OtherReference should be used to reference a transfer
	 * instruction or a transfer cancellation request 'message' sent in a
	 * proprietary way or used for a system reference. If
	 * Reference/OtherReference is present, Reference/OtherReference/MessageName
	 * must contain 'fax' or 'phone' or 'email', etc.
	 */
	public static void checkTransferInstructionStatusReportV04(TransferInstructionStatusReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Reference/OtherReference should be used to reference a transfer
	 * cancellation request 'message' sent in a proprietary way or used for a
	 * system reference. If Reference/OtherReference is present,
	 * References/OtherReference/MessageName must contain 'fax' or 'phone' or
	 * 'email', etc.
	 */
	public static void checkTransferCancellationStatusReportV04(TransferCancellationStatusReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * OtherReference should be used to reference a transfer cancellation
	 * request 'message' sent in a proprietary way or used for a system
	 * reference. If OtherReference is present, OtherReference/MessageName must
	 * contain 'fax' or 'phone' or 'email', etc.
	 */
	public static void checkTransferCancellationStatusReportV02(TransferCancellationStatusReportV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * OtherReference should be used to reference a transfer cancellation
	 * request 'message' sent in a proprietary way or used for a system
	 * reference. If OtherReference is present, OtherReference/MessageName must
	 * contain 'fax' or 'phone' or 'email', etc.
	 */
	public static void checkTransferCancellationStatusReportV03(TransferCancellationStatusReportV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * OtherReference should be used to reference a transfer instruction or a
	 * transfer cancellation request 'message' sent in a proprietary way or used
	 * for a system reference. If OtherReference is present,
	 * OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc.
	 */
	public static void checkTransferInstructionStatusReportV02(TransferInstructionStatusReportV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * OtherReference should be used to reference a transfer instruction or a
	 * transfer cancellation request 'message' sent in a proprietary way or used
	 * for a system reference. If OtherReference is present,
	 * OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc.
	 */
	public static void checkTransferInstructionStatusReportV03(TransferInstructionStatusReportV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * OtherReference should be used for transfers sent by proprietary way or
	 * for system references. If OtherReference is present,
	 * OtherReference/MessageName must contain 'fax' or 'phone' or 'email', for
	 * example.
	 */
	public static void checkMessageAndBusinessReference1(MessageAndBusinessReference1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * OtherReference should be used to reference a transfer instruction or a
	 * transfer cancellation request 'message' sent in a proprietary way or used
	 * for a system reference. If OtherReference is present,
	 * OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc.
	 */
	public static void checkMessageAndBusinessReference6(MessageAndBusinessReference6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Reference/OtherReference should be used to reference a transfer
	 * instruction or a transfer cancellation request 'message' sent in a
	 * proprietary way or used for a system reference. If
	 * Reference/OtherReference is present, Reference/OtherReference/MessageName
	 * must contain 'fax' or 'phone' or 'email', etc.
	 */
	public static void checkMessageAndBusinessReference7(MessageAndBusinessReference7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Reference/OtherReference should be used to reference a transfer
	 * instruction or a transfer cancellation request 'message' sent in a
	 * proprietary way or used for a system reference. If
	 * Reference/OtherReference is present, Reference/OtherReference/MessageName
	 * must contain 'fax' or 'phone' or 'email', etc.
	 */
	public static void checkMessageAndBusinessReference8(MessageAndBusinessReference8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}