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
import com.tools20022.repository.area.setr.*;
import com.tools20022.repository.choice.LinkedMessage4Choice;
import com.tools20022.repository.msg.*;
import java.util.Arrays;

/**
 * OtherReference should be used to reference an order cancellation 'message'
 * sent in a proprietary way or used for a system reference. If OtherReference
 * is present, OtherReference/MessageName must contain 'fax' or 'phone' or
 * 'email', etc.
 */
public class ConstraintOtherReferenceGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV03
	 * OrderCancellationStatusReportV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReferenceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "OtherReference should be used to reference an order cancellation 'message' sent in a proprietary way or used for a system reference. If OtherReference is present, OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<OrderCancellationStatusReportV03> for_setr_OrderCancellationStatusReportV03 = new MMConstraint<OrderCancellationStatusReportV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReferenceGuideline";
			definition = "OtherReference should be used to reference an order cancellation 'message' sent in a proprietary way or used for a system reference. If OtherReference is present, OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc.";
			owner_lazy = () -> OrderCancellationStatusReportV03.mmObject();
		}

		@Override
		public void executeValidator(OrderCancellationStatusReportV03 obj) throws Exception {
			check_setr_OrderCancellationStatusReportV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.OrderConfirmationStatusReportV01
	 * OrderConfirmationStatusReportV01}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReferenceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "OtherReference should be used to reference an order confirmation, order confirmation cancellation or order confirmation amendment 'message' sent in a proprietary way or used for a system reference. If OtherReference is present, OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<OrderConfirmationStatusReportV01> for_setr_OrderConfirmationStatusReportV01 = new MMConstraint<OrderConfirmationStatusReportV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReferenceGuideline";
			definition = "OtherReference should be used to reference an order confirmation, order confirmation cancellation or order confirmation amendment 'message' sent in a proprietary way or used for a system reference. If OtherReference is present, OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc.";
			owner_lazy = () -> OrderConfirmationStatusReportV01.mmObject();
		}

		@Override
		public void executeValidator(OrderConfirmationStatusReportV01 obj) throws Exception {
			check_setr_OrderConfirmationStatusReportV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderConfirmationStatusReportV02
	 * RequestForOrderConfirmationStatusReportV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReferenceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "RequestDetails/Reference/OtherReference should be used to reference an order instruction or cancellation 'message' sent in a proprietary way or used for a system reference. If RequestDetails/Reference/OtherReference is present, RequestDetails/Reference/OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RequestForOrderConfirmationStatusReportV02> for_setr_RequestForOrderConfirmationStatusReportV02 = new MMConstraint<RequestForOrderConfirmationStatusReportV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReferenceGuideline";
			definition = "RequestDetails/Reference/OtherReference should be used to reference an order instruction or cancellation 'message' sent in a proprietary way or used for a system reference. If RequestDetails/Reference/OtherReference is present, RequestDetails/Reference/OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc.";
			owner_lazy = () -> RequestForOrderConfirmationStatusReportV02.mmObject();
		}

		@Override
		public void executeValidator(RequestForOrderConfirmationStatusReportV02 obj) throws Exception {
			check_setr_RequestForOrderConfirmationStatusReportV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference4
	 * MessageAndBusinessReference4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReferenceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "OtherReference should be used to reference an order instruction or cancellation 'message' sent in a proprietary way or used for a system reference. If OtherReference is present, OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<MessageAndBusinessReference4> forMessageAndBusinessReference4 = new MMConstraint<MessageAndBusinessReference4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReferenceGuideline";
			definition = "OtherReference should be used to reference an order instruction or cancellation 'message' sent in a proprietary way or used for a system reference. If OtherReference is present, OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc.";
			owner_lazy = () -> MessageAndBusinessReference4.mmObject();
		}

		@Override
		public void executeValidator(MessageAndBusinessReference4 obj) throws Exception {
			checkMessageAndBusinessReference4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference2
	 * AccountManagementMessageReference2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReferenceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "LinkedReference/OtherReference should be used for an account opening or an account modification instruction sent by proprietary way or for system references. \r\nIf LinkedReference/OtherReference is present, LinkedReference/OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherReferenceGuideline#forAccountManagementMessageReference3
	 * ConstraintOtherReferenceGuideline.forAccountManagementMessageReference3}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherReferenceGuideline#forAccountManagementMessageReference1
	 * ConstraintOtherReferenceGuideline.forAccountManagementMessageReference1}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountManagementMessageReference2> forAccountManagementMessageReference2 = new MMConstraint<AccountManagementMessageReference2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReferenceGuideline";
			definition = "LinkedReference/OtherReference should be used for an account opening or an account modification instruction sent by proprietary way or for system references. \r\nIf LinkedReference/OtherReference is present, LinkedReference/OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOtherReferenceGuideline.forAccountManagementMessageReference3);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOtherReferenceGuideline.forAccountManagementMessageReference1;
			owner_lazy = () -> AccountManagementMessageReference2.mmObject();
		}

		@Override
		public void executeValidator(AccountManagementMessageReference2 obj) throws Exception {
			checkAccountManagementMessageReference2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV02
	 * OrderInstructionStatusReportV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReferenceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "OtherReference should be used for orders sent by proprietary way or for system references. \nIf OtherReference is present, OtherReference/MessageName must contain 'fax' or 'phone' or 'email'."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<OrderInstructionStatusReportV02> for_setr_OrderInstructionStatusReportV02 = new MMConstraint<OrderInstructionStatusReportV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReferenceGuideline";
			definition = "OtherReference should be used for orders sent by proprietary way or for system references. \nIf OtherReference is present, OtherReference/MessageName must contain 'fax' or 'phone' or 'email'.";
			owner_lazy = () -> OrderInstructionStatusReportV02.mmObject();
		}

		@Override
		public void executeValidator(OrderInstructionStatusReportV02 obj) throws Exception {
			check_setr_OrderInstructionStatusReportV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference1
	 * AccountManagementMessageReference1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReferenceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "OtherReference should be used for an account opening or an account modification instruction sent by proprietary way or for system references. \nIf OtherReference is present, OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherReferenceGuideline#forAccountManagementMessageReference2
	 * ConstraintOtherReferenceGuideline.forAccountManagementMessageReference2}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountManagementMessageReference1> forAccountManagementMessageReference1 = new MMConstraint<AccountManagementMessageReference1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReferenceGuideline";
			definition = "OtherReference should be used for an account opening or an account modification instruction sent by proprietary way or for system references. \nIf OtherReference is present, OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOtherReferenceGuideline.forAccountManagementMessageReference2);
			owner_lazy = () -> AccountManagementMessageReference1.mmObject();
		}

		@Override
		public void executeValidator(AccountManagementMessageReference1 obj) throws Exception {
			checkAccountManagementMessageReference1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference5
	 * MessageAndBusinessReference5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReferenceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "OtherReference should be used to reference an order confirmation, order confirmation cancellation or order confirmation amendment 'message' sent in a proprietary way or used for a system reference. If OtherReference is present, OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<MessageAndBusinessReference5> forMessageAndBusinessReference5 = new MMConstraint<MessageAndBusinessReference5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReferenceGuideline";
			definition = "OtherReference should be used to reference an order confirmation, order confirmation cancellation or order confirmation amendment 'message' sent in a proprietary way or used for a system reference. If OtherReference is present, OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc.";
			owner_lazy = () -> MessageAndBusinessReference5.mmObject();
		}

		@Override
		public void executeValidator(MessageAndBusinessReference5 obj) throws Exception {
			checkMessageAndBusinessReference5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.LinkedMessage4Choice
	 * LinkedMessage4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReferenceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "OtherReference should be used for an account opening or an account modification instruction sent in a proprietary way or for system references. \r\nIf OtherReference is present, OtherReference/MessageName must contain, for example, 'fax' or 'phone' or 'email'."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<LinkedMessage4Choice> forLinkedMessage4Choice = new MMConstraint<LinkedMessage4Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReferenceGuideline";
			definition = "OtherReference should be used for an account opening or an account modification instruction sent in a proprietary way or for system references. \r\nIf OtherReference is present, OtherReference/MessageName must contain, for example, 'fax' or 'phone' or 'email'.";
			owner_lazy = () -> LinkedMessage4Choice.mmObject();
		}

		@Override
		public void executeValidator(LinkedMessage4Choice obj) throws Exception {
			checkLinkedMessage4Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.OrderConfirmationStatusReportV02
	 * OrderConfirmationStatusReportV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReferenceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "OtherReference should be used to reference an order confirmation cancellation 'message' sent in a proprietary way or used for a system reference. If OtherReference is present, OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<OrderConfirmationStatusReportV02> for_setr_OrderConfirmationStatusReportV02 = new MMConstraint<OrderConfirmationStatusReportV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReferenceGuideline";
			definition = "OtherReference should be used to reference an order confirmation cancellation 'message' sent in a proprietary way or used for a system reference. If OtherReference is present, OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc.";
			owner_lazy = () -> OrderConfirmationStatusReportV02.mmObject();
		}

		@Override
		public void executeValidator(OrderConfirmationStatusReportV02 obj) throws Exception {
			check_setr_OrderConfirmationStatusReportV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderStatusReportV04
	 * RequestForOrderStatusReportV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReferenceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "RequestDetails/Reference/OtherReference should be used to reference an order instruction or cancellation 'message' sent in a proprietary way or used for a system reference. If RequestDetails/Reference/OtherReference is present, RequestDetails/Reference/OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RequestForOrderStatusReportV04> for_setr_RequestForOrderStatusReportV04 = new MMConstraint<RequestForOrderStatusReportV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReferenceGuideline";
			definition = "RequestDetails/Reference/OtherReference should be used to reference an order instruction or cancellation 'message' sent in a proprietary way or used for a system reference. If RequestDetails/Reference/OtherReference is present, RequestDetails/Reference/OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc.";
			owner_lazy = () -> RequestForOrderStatusReportV04.mmObject();
		}

		@Override
		public void executeValidator(RequestForOrderStatusReportV04 obj) throws Exception {
			check_setr_RequestForOrderStatusReportV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference3
	 * AccountManagementMessageReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReferenceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "LinkedReference/OtherReference should be used for an account opening or an account modification instruction sent by proprietary way or for system references. \r\nIf LinkedReference/OtherReference is present, LinkedReference/OtherReference/MessageName must contain, for example, 'fax' or 'phone' or 'email'."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherReferenceGuideline#forAccountManagementMessageReference2
	 * ConstraintOtherReferenceGuideline.forAccountManagementMessageReference2}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountManagementMessageReference3> forAccountManagementMessageReference3 = new MMConstraint<AccountManagementMessageReference3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReferenceGuideline";
			definition = "LinkedReference/OtherReference should be used for an account opening or an account modification instruction sent by proprietary way or for system references. \r\nIf LinkedReference/OtherReference is present, LinkedReference/OtherReference/MessageName must contain, for example, 'fax' or 'phone' or 'email'.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOtherReferenceGuideline.forAccountManagementMessageReference2;
			owner_lazy = () -> AccountManagementMessageReference3.mmObject();
		}

		@Override
		public void executeValidator(AccountManagementMessageReference3 obj) throws Exception {
			checkAccountManagementMessageReference3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference
	 * AccountManagementMessageReference}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReferenceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "OtherReference should be used for an account opening or an account modification instruction sent by proprietary way or for system references. \nIf OtherReference is present, OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountManagementMessageReference> forAccountManagementMessageReference = new MMConstraint<AccountManagementMessageReference>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReferenceGuideline";
			definition = "OtherReference should be used for an account opening or an account modification instruction sent by proprietary way or for system references. \nIf OtherReference is present, OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc.";
			owner_lazy = () -> AccountManagementMessageReference.mmObject();
		}

		@Override
		public void executeValidator(AccountManagementMessageReference obj) throws Exception {
			checkAccountManagementMessageReference(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV04
	 * OrderCancellationStatusReportV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReferenceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "OtherReference should be used to reference an order cancellation 'message' sent in a proprietary way or used for a system reference. If OtherReference is present, OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<OrderCancellationStatusReportV04> for_setr_OrderCancellationStatusReportV04 = new MMConstraint<OrderCancellationStatusReportV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReferenceGuideline";
			definition = "OtherReference should be used to reference an order cancellation 'message' sent in a proprietary way or used for a system reference. If OtherReference is present, OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc.";
			owner_lazy = () -> OrderCancellationStatusReportV04.mmObject();
		}

		@Override
		public void executeValidator(OrderCancellationStatusReportV04 obj) throws Exception {
			check_setr_OrderCancellationStatusReportV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference2
	 * MessageAndBusinessReference2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReferenceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "OtherReference should be used for orders sent by proprietary way or for system references. \nIf OtherReference is present, OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<MessageAndBusinessReference2> forMessageAndBusinessReference2 = new MMConstraint<MessageAndBusinessReference2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReferenceGuideline";
			definition = "OtherReference should be used for orders sent by proprietary way or for system references. \nIf OtherReference is present, OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc.";
			owner_lazy = () -> MessageAndBusinessReference2.mmObject();
		}

		@Override
		public void executeValidator(MessageAndBusinessReference2 obj) throws Exception {
			checkMessageAndBusinessReference2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV03
	 * OrderInstructionStatusReportV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReferenceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "OtherReference should be used to reference an order instruction or cancellation 'message' sent in a proprietary way or used for a system reference. If OtherReference is present, OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherReferenceGuideline#for_setr_OrderInstructionStatusReportV04
	 * ConstraintOtherReferenceGuideline.
	 * for_setr_OrderInstructionStatusReportV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OrderInstructionStatusReportV03> for_setr_OrderInstructionStatusReportV03 = new MMConstraint<OrderInstructionStatusReportV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReferenceGuideline";
			definition = "OtherReference should be used to reference an order instruction or cancellation 'message' sent in a proprietary way or used for a system reference. If OtherReference is present, OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOtherReferenceGuideline.for_setr_OrderInstructionStatusReportV04);
			owner_lazy = () -> OrderInstructionStatusReportV03.mmObject();
		}

		@Override
		public void executeValidator(OrderInstructionStatusReportV03 obj) throws Exception {
			check_setr_OrderInstructionStatusReportV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV04
	 * OrderInstructionStatusReportV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReferenceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference/OtherReference should be used to reference an order instruction sent in a proprietary way or used for a system reference. If Reference/OtherReference is present, Reference/OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherReferenceGuideline#for_setr_OrderInstructionStatusReportV03
	 * ConstraintOtherReferenceGuideline.
	 * for_setr_OrderInstructionStatusReportV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<OrderInstructionStatusReportV04> for_setr_OrderInstructionStatusReportV04 = new MMConstraint<OrderInstructionStatusReportV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReferenceGuideline";
			definition = "Reference/OtherReference should be used to reference an order instruction sent in a proprietary way or used for a system reference. If Reference/OtherReference is present, Reference/OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOtherReferenceGuideline.for_setr_OrderInstructionStatusReportV03;
			owner_lazy = () -> OrderInstructionStatusReportV04.mmObject();
		}

		@Override
		public void executeValidator(OrderInstructionStatusReportV04 obj) throws Exception {
			check_setr_OrderInstructionStatusReportV04(obj);
		}
	};

	/**
	 * OtherReference should be used to reference an order cancellation
	 * 'message' sent in a proprietary way or used for a system reference. If
	 * OtherReference is present, OtherReference/MessageName must contain 'fax'
	 * or 'phone' or 'email', etc.
	 */
	public static void check_setr_OrderCancellationStatusReportV03(OrderCancellationStatusReportV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * OtherReference should be used to reference an order confirmation, order
	 * confirmation cancellation or order confirmation amendment 'message' sent
	 * in a proprietary way or used for a system reference. If OtherReference is
	 * present, OtherReference/MessageName must contain 'fax' or 'phone' or
	 * 'email', etc.
	 */
	public static void check_setr_OrderConfirmationStatusReportV01(OrderConfirmationStatusReportV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * RequestDetails/Reference/OtherReference should be used to reference an
	 * order instruction or cancellation 'message' sent in a proprietary way or
	 * used for a system reference. If RequestDetails/Reference/OtherReference
	 * is present, RequestDetails/Reference/OtherReference/MessageName must
	 * contain 'fax' or 'phone' or 'email', etc.
	 */
	public static void check_setr_RequestForOrderConfirmationStatusReportV02(RequestForOrderConfirmationStatusReportV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * OtherReference should be used to reference an order instruction or
	 * cancellation 'message' sent in a proprietary way or used for a system
	 * reference. If OtherReference is present, OtherReference/MessageName must
	 * contain 'fax' or 'phone' or 'email', etc.
	 */
	public static void checkMessageAndBusinessReference4(MessageAndBusinessReference4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * LinkedReference/OtherReference should be used for an account opening or
	 * an account modification instruction sent by proprietary way or for system
	 * references. <br>
	 * If LinkedReference/OtherReference is present,
	 * LinkedReference/OtherReference/MessageName must contain 'fax' or 'phone'
	 * or 'email', etc.
	 */
	public static void checkAccountManagementMessageReference2(AccountManagementMessageReference2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * OtherReference should be used for orders sent by proprietary way or for
	 * system references. If OtherReference is present,
	 * OtherReference/MessageName must contain 'fax' or 'phone' or 'email'.
	 */
	public static void check_setr_OrderInstructionStatusReportV02(OrderInstructionStatusReportV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * OtherReference should be used for an account opening or an account
	 * modification instruction sent by proprietary way or for system
	 * references. If OtherReference is present, OtherReference/MessageName must
	 * contain 'fax' or 'phone' or 'email', etc.
	 */
	public static void checkAccountManagementMessageReference1(AccountManagementMessageReference1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * OtherReference should be used to reference an order confirmation, order
	 * confirmation cancellation or order confirmation amendment 'message' sent
	 * in a proprietary way or used for a system reference. If OtherReference is
	 * present, OtherReference/MessageName must contain 'fax' or 'phone' or
	 * 'email', etc.
	 */
	public static void checkMessageAndBusinessReference5(MessageAndBusinessReference5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * OtherReference should be used for an account opening or an account
	 * modification instruction sent in a proprietary way or for system
	 * references. <br>
	 * If OtherReference is present, OtherReference/MessageName must contain,
	 * for example, 'fax' or 'phone' or 'email'.
	 */
	public static void checkLinkedMessage4Choice(LinkedMessage4Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * OtherReference should be used to reference an order confirmation
	 * cancellation 'message' sent in a proprietary way or used for a system
	 * reference. If OtherReference is present, OtherReference/MessageName must
	 * contain 'fax' or 'phone' or 'email', etc.
	 */
	public static void check_setr_OrderConfirmationStatusReportV02(OrderConfirmationStatusReportV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * RequestDetails/Reference/OtherReference should be used to reference an
	 * order instruction or cancellation 'message' sent in a proprietary way or
	 * used for a system reference. If RequestDetails/Reference/OtherReference
	 * is present, RequestDetails/Reference/OtherReference/MessageName must
	 * contain 'fax' or 'phone' or 'email', etc.
	 */
	public static void check_setr_RequestForOrderStatusReportV04(RequestForOrderStatusReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * LinkedReference/OtherReference should be used for an account opening or
	 * an account modification instruction sent by proprietary way or for system
	 * references. <br>
	 * If LinkedReference/OtherReference is present,
	 * LinkedReference/OtherReference/MessageName must contain, for example,
	 * 'fax' or 'phone' or 'email'.
	 */
	public static void checkAccountManagementMessageReference3(AccountManagementMessageReference3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * OtherReference should be used for an account opening or an account
	 * modification instruction sent by proprietary way or for system
	 * references. If OtherReference is present, OtherReference/MessageName must
	 * contain 'fax' or 'phone' or 'email', etc.
	 */
	public static void checkAccountManagementMessageReference(AccountManagementMessageReference obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * OtherReference should be used to reference an order cancellation
	 * 'message' sent in a proprietary way or used for a system reference. If
	 * OtherReference is present, OtherReference/MessageName must contain 'fax'
	 * or 'phone' or 'email', etc.
	 */
	public static void check_setr_OrderCancellationStatusReportV04(OrderCancellationStatusReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * OtherReference should be used for orders sent by proprietary way or for
	 * system references. If OtherReference is present,
	 * OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc.
	 */
	public static void checkMessageAndBusinessReference2(MessageAndBusinessReference2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * OtherReference should be used to reference an order instruction or
	 * cancellation 'message' sent in a proprietary way or used for a system
	 * reference. If OtherReference is present, OtherReference/MessageName must
	 * contain 'fax' or 'phone' or 'email', etc.
	 */
	public static void check_setr_OrderInstructionStatusReportV03(OrderInstructionStatusReportV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Reference/OtherReference should be used to reference an order instruction
	 * sent in a proprietary way or used for a system reference. If
	 * Reference/OtherReference is present, Reference/OtherReference/MessageName
	 * must contain 'fax' or 'phone' or 'email', etc.
	 */
	public static void check_setr_OrderInstructionStatusReportV04(OrderInstructionStatusReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}