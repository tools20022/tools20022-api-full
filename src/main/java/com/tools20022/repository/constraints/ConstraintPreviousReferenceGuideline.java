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
import com.tools20022.repository.area.setr.RequestForOrderConfirmationStatusReportV02;
import com.tools20022.repository.area.setr.RequestForOrderStatusReportV04;
import com.tools20022.repository.choice.LinkedMessage4Choice;
import com.tools20022.repository.msg.*;
import java.util.Arrays;

/**
 * If RequestDetails/Reference/PreviousReference/MessageName is present, it must
 * contain 502 or must start with setr.047, setr.049, setr.051, setr.053, or
 * setr.055 and RequestDetails/Reference/PreviousReference/Reference must
 * contain the reference of a message in this list.
 */
public class ConstraintPreviousReferenceGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderConfirmationStatusReportV02
	 * RequestForOrderConfirmationStatusReportV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousReferenceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If RequestDetails/Reference/PreviousReference/MessageName is present, it must contain 502 or must start with setr.047, setr.049, setr.051, setr.053, or setr.055 and RequestDetails/Reference/PreviousReference/Reference must contain the reference of a message in this list."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RequestForOrderConfirmationStatusReportV02> for_setr_RequestForOrderConfirmationStatusReportV02 = new MMConstraint<RequestForOrderConfirmationStatusReportV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReferenceGuideline";
			definition = "If RequestDetails/Reference/PreviousReference/MessageName is present, it must contain 502 or must start with setr.047, setr.049, setr.051, setr.053, or setr.055 and RequestDetails/Reference/PreviousReference/Reference must contain the reference of a message in this list.";
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousReferenceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PreviousReference/MessageName is present, it must contain 502 or must start with setr.001, setr.002, setr.004, setr.005, setr.007, setr.008, setr.010, setr.011, setr.013 or setr.014 and PreviousReference/Reference must contain the reference of a message in this list."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MessageAndBusinessReference4> forMessageAndBusinessReference4 = new MMConstraint<MessageAndBusinessReference4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReferenceGuideline";
			definition = "If PreviousReference/MessageName is present, it must contain 502 or must start with setr.001, setr.002, setr.004, setr.005, setr.007, setr.008, setr.010, setr.011, setr.013 or setr.014 and PreviousReference/Reference must contain the reference of a message in this list.";
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousReferenceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LinkedReference/PreviousReference/MessageName is present, it must start with acmt.001 or acmt.003 and Reference must contain the business reference of a message in this list."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPreviousReferenceGuideline#forAccountManagementMessageReference3
	 * ConstraintPreviousReferenceGuideline.
	 * forAccountManagementMessageReference3}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPreviousReferenceGuideline#forAccountManagementMessageReference1
	 * ConstraintPreviousReferenceGuideline.
	 * forAccountManagementMessageReference1}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountManagementMessageReference2> forAccountManagementMessageReference2 = new MMConstraint<AccountManagementMessageReference2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReferenceGuideline";
			definition = "If LinkedReference/PreviousReference/MessageName is present, it must start with acmt.001 or acmt.003 and Reference must contain the business reference of a message in this list.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPreviousReferenceGuideline.forAccountManagementMessageReference3);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPreviousReferenceGuideline.forAccountManagementMessageReference1;
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
	 * {@linkplain com.tools20022.repository.msg.AccountManagementMessageReference1
	 * AccountManagementMessageReference1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousReferenceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PreviousReference/MessageName is present, it must start with acmt.001 or acmt.003 and Reference must contain the business reference of a message in this list."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPreviousReferenceGuideline#forAccountManagementMessageReference2
	 * ConstraintPreviousReferenceGuideline.
	 * forAccountManagementMessageReference2}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountManagementMessageReference1> forAccountManagementMessageReference1 = new MMConstraint<AccountManagementMessageReference1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReferenceGuideline";
			definition = "If PreviousReference/MessageName is present, it must start with acmt.001 or acmt.003 and Reference must contain the business reference of a message in this list.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPreviousReferenceGuideline.forAccountManagementMessageReference2);
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousReferenceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PreviousReference/MessageName is present, it must contain 515 or must start with setr.003, setr.006, setr.009, setr.012, setr.015, setr.047, setr.048, setr.049, setr.050, setr.051, setr.052, setr.053, setr.054, setr.055 or setr.056 and PreviousReference/Reference must contain the reference of a message in this list."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MessageAndBusinessReference5> forMessageAndBusinessReference5 = new MMConstraint<MessageAndBusinessReference5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReferenceGuideline";
			definition = "If PreviousReference/MessageName is present, it must contain 515 or must start with setr.003, setr.006, setr.009, setr.012, setr.015, setr.047, setr.048, setr.049, setr.050, setr.051, setr.052, setr.053, setr.054, setr.055 or setr.056 and PreviousReference/Reference must contain the reference of a message in this list.";
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousReferenceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PreviousReference/MessageName is present, it must start with acmt.001 or acmt.003 and PreviousReference/Reference must contain the business reference of a message."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<LinkedMessage4Choice> forLinkedMessage4Choice = new MMConstraint<LinkedMessage4Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReferenceGuideline";
			definition = "If PreviousReference/MessageName is present, it must start with acmt.001 or acmt.003 and PreviousReference/Reference must contain the business reference of a message.";
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
	 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderStatusReportV04
	 * RequestForOrderStatusReportV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousReferenceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If RequestDetails/Reference/PreviousReference/MessageName is present, it must contain 502 or must start with setr.001, setr.002, setr.004, setr.005, setr.007, setr.008, setr.010, setr.011, setr.013 or setr.014 and RequestDetails/Reference/PreviousReference/Reference must contain the reference of a message in this list."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RequestForOrderStatusReportV04> for_setr_RequestForOrderStatusReportV04 = new MMConstraint<RequestForOrderStatusReportV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReferenceGuideline";
			definition = "If RequestDetails/Reference/PreviousReference/MessageName is present, it must contain 502 or must start with setr.001, setr.002, setr.004, setr.005, setr.007, setr.008, setr.010, setr.011, setr.013 or setr.014 and RequestDetails/Reference/PreviousReference/Reference must contain the reference of a message in this list.";
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousReferenceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LinkedReference/PreviousReference/MessageName is present, it must start with acmt.001 or acmt.003 and Reference must contain the business reference of a message in this list."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPreviousReferenceGuideline#forAccountManagementMessageReference2
	 * ConstraintPreviousReferenceGuideline.
	 * forAccountManagementMessageReference2}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountManagementMessageReference3> forAccountManagementMessageReference3 = new MMConstraint<AccountManagementMessageReference3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReferenceGuideline";
			definition = "If LinkedReference/PreviousReference/MessageName is present, it must start with acmt.001 or acmt.003 and Reference must contain the business reference of a message in this list.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPreviousReferenceGuideline.forAccountManagementMessageReference2;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousReferenceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PreviousReference/MessageName is present, it must start with acmt.001 or acmt.003 and Reference must contain the business reference of a message in this list."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountManagementMessageReference> forAccountManagementMessageReference = new MMConstraint<AccountManagementMessageReference>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReferenceGuideline";
			definition = "If PreviousReference/MessageName is present, it must start with acmt.001 or acmt.003 and Reference must contain the business reference of a message in this list.";
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
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference2
	 * MessageAndBusinessReference2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousReferenceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PreviousReference/MessageName is present, it must contain 502 or must start with setr.001 or setr.002 or setr.004 or setr.005 or setr.007 or setr.008 or setr.010 or setr.011 or setr.013 or setr.014 and Reference must contain the business reference of a message in this list."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MessageAndBusinessReference2> forMessageAndBusinessReference2 = new MMConstraint<MessageAndBusinessReference2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReferenceGuideline";
			definition = "If PreviousReference/MessageName is present, it must contain 502 or must start with setr.001 or setr.002 or setr.004 or setr.005 or setr.007 or setr.008 or setr.010 or setr.011 or setr.013 or setr.014 and Reference must contain the business reference of a message in this list.";
			owner_lazy = () -> MessageAndBusinessReference2.mmObject();
		}

		@Override
		public void executeValidator(MessageAndBusinessReference2 obj) throws Exception {
			checkMessageAndBusinessReference2(obj);
		}
	};

	/**
	 * If RequestDetails/Reference/PreviousReference/MessageName is present, it
	 * must contain 502 or must start with setr.047, setr.049, setr.051,
	 * setr.053, or setr.055 and
	 * RequestDetails/Reference/PreviousReference/Reference must contain the
	 * reference of a message in this list.
	 */
	public static void check_setr_RequestForOrderConfirmationStatusReportV02(RequestForOrderConfirmationStatusReportV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PreviousReference/MessageName is present, it must contain 502 or must
	 * start with setr.001, setr.002, setr.004, setr.005, setr.007, setr.008,
	 * setr.010, setr.011, setr.013 or setr.014 and PreviousReference/Reference
	 * must contain the reference of a message in this list.
	 */
	public static void checkMessageAndBusinessReference4(MessageAndBusinessReference4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LinkedReference/PreviousReference/MessageName is present, it must
	 * start with acmt.001 or acmt.003 and Reference must contain the business
	 * reference of a message in this list.
	 */
	public static void checkAccountManagementMessageReference2(AccountManagementMessageReference2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PreviousReference/MessageName is present, it must start with acmt.001
	 * or acmt.003 and Reference must contain the business reference of a
	 * message in this list.
	 */
	public static void checkAccountManagementMessageReference1(AccountManagementMessageReference1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PreviousReference/MessageName is present, it must contain 515 or must
	 * start with setr.003, setr.006, setr.009, setr.012, setr.015, setr.047,
	 * setr.048, setr.049, setr.050, setr.051, setr.052, setr.053, setr.054,
	 * setr.055 or setr.056 and PreviousReference/Reference must contain the
	 * reference of a message in this list.
	 */
	public static void checkMessageAndBusinessReference5(MessageAndBusinessReference5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PreviousReference/MessageName is present, it must start with acmt.001
	 * or acmt.003 and PreviousReference/Reference must contain the business
	 * reference of a message.
	 */
	public static void checkLinkedMessage4Choice(LinkedMessage4Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If RequestDetails/Reference/PreviousReference/MessageName is present, it
	 * must contain 502 or must start with setr.001, setr.002, setr.004,
	 * setr.005, setr.007, setr.008, setr.010, setr.011, setr.013 or setr.014
	 * and RequestDetails/Reference/PreviousReference/Reference must contain the
	 * reference of a message in this list.
	 */
	public static void check_setr_RequestForOrderStatusReportV04(RequestForOrderStatusReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LinkedReference/PreviousReference/MessageName is present, it must
	 * start with acmt.001 or acmt.003 and Reference must contain the business
	 * reference of a message in this list.
	 */
	public static void checkAccountManagementMessageReference3(AccountManagementMessageReference3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PreviousReference/MessageName is present, it must start with acmt.001
	 * or acmt.003 and Reference must contain the business reference of a
	 * message in this list.
	 */
	public static void checkAccountManagementMessageReference(AccountManagementMessageReference obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PreviousReference/MessageName is present, it must contain 502 or must
	 * start with setr.001 or setr.002 or setr.004 or setr.005 or setr.007 or
	 * setr.008 or setr.010 or setr.011 or setr.013 or setr.014 and Reference
	 * must contain the business reference of a message in this list.
	 */
	public static void checkMessageAndBusinessReference2(MessageAndBusinessReference2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}