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
import com.tools20022.repository.msg.*;
import java.util.Arrays;

/**
 * TransferConfirmationReference may each be repeated across multiple instances
 * of the TransferDetails component where the executing party allocates a common
 * reference to several transfers that are being confirmed in the same message.
 */
public class ConstraintSingleAndMultipleTransferConfirmationReferencesGuideline1 {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transfer18 Transfer18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleAndMultipleTransferConfirmationReferencesGuideline1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "TransferConfirmationReference may each be repeated across multiple instances of the TransferDetails component where the executing party allocates a common reference to several transfers that are being confirmed in the same message."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Transfer18> forTransfer18 = new MMConstraint<Transfer18>() {
		{
			validator = ConstraintSingleAndMultipleTransferConfirmationReferencesGuideline1::checkTransfer18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleAndMultipleTransferConfirmationReferencesGuideline1";
			definition = "TransferConfirmationReference may each be repeated across multiple instances of the TransferDetails component where the executing party allocates a common reference to several transfers that are being confirmed in the same message.";
			owner_lazy = () -> Transfer18.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transfer26 Transfer26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleAndMultipleTransferConfirmationReferencesGuideline1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "TransferConfirmationReference may each be repeated across multiple instances of the TransferDetails component where the executing party allocates a common reference to several transfers that are being confirmed in the same message."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSingleAndMultipleTransferConfirmationReferencesGuideline1#forTransfer29
	 * ConstraintSingleAndMultipleTransferConfirmationReferencesGuideline1.
	 * forTransfer29}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Transfer26> forTransfer26 = new MMConstraint<Transfer26>() {
		{
			validator = ConstraintSingleAndMultipleTransferConfirmationReferencesGuideline1::checkTransfer26;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleAndMultipleTransferConfirmationReferencesGuideline1";
			definition = "TransferConfirmationReference may each be repeated across multiple instances of the TransferDetails component where the executing party allocates a common reference to several transfers that are being confirmed in the same message.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSingleAndMultipleTransferConfirmationReferencesGuideline1.forTransfer29);
			owner_lazy = () -> Transfer26.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transfer13 Transfer13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleAndMultipleTransferConfirmationReferencesGuideline1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "TransferConfirmationReference may each be repeated across multiple instances of the TransferDetails component where the executing party allocates a common reference to several transfers that are being confirmed in the same message."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Transfer13> forTransfer13 = new MMConstraint<Transfer13>() {
		{
			validator = ConstraintSingleAndMultipleTransferConfirmationReferencesGuideline1::checkTransfer13;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleAndMultipleTransferConfirmationReferencesGuideline1";
			definition = "TransferConfirmationReference may each be repeated across multiple instances of the TransferDetails component where the executing party allocates a common reference to several transfers that are being confirmed in the same message.";
			owner_lazy = () -> Transfer13.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transfer23 Transfer23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleAndMultipleTransferConfirmationReferencesGuideline1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "TransferConfirmationReference may each be repeated across multiple instances of the TransferDetails component where the executing party allocates a common reference to several transfers that are being confirmed in the same message."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSingleAndMultipleTransferConfirmationReferencesGuideline1#forTransfer28
	 * ConstraintSingleAndMultipleTransferConfirmationReferencesGuideline1.
	 * forTransfer28}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Transfer23> forTransfer23 = new MMConstraint<Transfer23>() {
		{
			validator = ConstraintSingleAndMultipleTransferConfirmationReferencesGuideline1::checkTransfer23;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleAndMultipleTransferConfirmationReferencesGuideline1";
			definition = "TransferConfirmationReference may each be repeated across multiple instances of the TransferDetails component where the executing party allocates a common reference to several transfers that are being confirmed in the same message.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSingleAndMultipleTransferConfirmationReferencesGuideline1.forTransfer28);
			owner_lazy = () -> Transfer23.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transfer28 Transfer28}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleAndMultipleTransferConfirmationReferencesGuideline1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "TransferConfirmationReference may each be repeated across multiple instances of the TransferDetails component where the executing party allocates a common reference to several transfers that are being confirmed in the same message."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSingleAndMultipleTransferConfirmationReferencesGuideline1#forTransfer31
	 * ConstraintSingleAndMultipleTransferConfirmationReferencesGuideline1.
	 * forTransfer31}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSingleAndMultipleTransferConfirmationReferencesGuideline1#forTransfer23
	 * ConstraintSingleAndMultipleTransferConfirmationReferencesGuideline1.
	 * forTransfer23}</li>
	 * </ul>
	 */
	public static final MMConstraint<Transfer28> forTransfer28 = new MMConstraint<Transfer28>() {
		{
			validator = ConstraintSingleAndMultipleTransferConfirmationReferencesGuideline1::checkTransfer28;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleAndMultipleTransferConfirmationReferencesGuideline1";
			definition = "TransferConfirmationReference may each be repeated across multiple instances of the TransferDetails component where the executing party allocates a common reference to several transfers that are being confirmed in the same message.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSingleAndMultipleTransferConfirmationReferencesGuideline1.forTransfer31);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSingleAndMultipleTransferConfirmationReferencesGuideline1.forTransfer23;
			owner_lazy = () -> Transfer28.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transfer29 Transfer29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleAndMultipleTransferConfirmationReferencesGuideline1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "TransferConfirmationReference may each be repeated across multiple instances of the TransferDetails component where the executing party allocates a common reference to several transfers that are being confirmed in the same message."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSingleAndMultipleTransferConfirmationReferencesGuideline1#forTransfer33
	 * ConstraintSingleAndMultipleTransferConfirmationReferencesGuideline1.
	 * forTransfer33}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSingleAndMultipleTransferConfirmationReferencesGuideline1#forTransfer26
	 * ConstraintSingleAndMultipleTransferConfirmationReferencesGuideline1.
	 * forTransfer26}</li>
	 * </ul>
	 */
	public static final MMConstraint<Transfer29> forTransfer29 = new MMConstraint<Transfer29>() {
		{
			validator = ConstraintSingleAndMultipleTransferConfirmationReferencesGuideline1::checkTransfer29;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleAndMultipleTransferConfirmationReferencesGuideline1";
			definition = "TransferConfirmationReference may each be repeated across multiple instances of the TransferDetails component where the executing party allocates a common reference to several transfers that are being confirmed in the same message.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSingleAndMultipleTransferConfirmationReferencesGuideline1.forTransfer33);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSingleAndMultipleTransferConfirmationReferencesGuideline1.forTransfer26;
			owner_lazy = () -> Transfer29.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transfer31 Transfer31}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleAndMultipleTransferConfirmationReferencesGuideline1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "TransferConfirmationReference may each be repeated across multiple instances of the TransferDetails component where the executing party allocates a common reference to several transfers that are being confirmed in the same message."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSingleAndMultipleTransferConfirmationReferencesGuideline1#forTransfer28
	 * ConstraintSingleAndMultipleTransferConfirmationReferencesGuideline1.
	 * forTransfer28}</li>
	 * </ul>
	 */
	public static final MMConstraint<Transfer31> forTransfer31 = new MMConstraint<Transfer31>() {
		{
			validator = ConstraintSingleAndMultipleTransferConfirmationReferencesGuideline1::checkTransfer31;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleAndMultipleTransferConfirmationReferencesGuideline1";
			definition = "TransferConfirmationReference may each be repeated across multiple instances of the TransferDetails component where the executing party allocates a common reference to several transfers that are being confirmed in the same message.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSingleAndMultipleTransferConfirmationReferencesGuideline1.forTransfer28;
			owner_lazy = () -> Transfer31.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transfer33 Transfer33}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleAndMultipleTransferConfirmationReferencesGuideline1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "TransferConfirmationReference may each be repeated across multiple instances of the TransferDetails component where the executing party allocates a common reference to several transfers that are being confirmed in the same message."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSingleAndMultipleTransferConfirmationReferencesGuideline1#forTransfer29
	 * ConstraintSingleAndMultipleTransferConfirmationReferencesGuideline1.
	 * forTransfer29}</li>
	 * </ul>
	 */
	public static final MMConstraint<Transfer33> forTransfer33 = new MMConstraint<Transfer33>() {
		{
			validator = ConstraintSingleAndMultipleTransferConfirmationReferencesGuideline1::checkTransfer33;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleAndMultipleTransferConfirmationReferencesGuideline1";
			definition = "TransferConfirmationReference may each be repeated across multiple instances of the TransferDetails component where the executing party allocates a common reference to several transfers that are being confirmed in the same message.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSingleAndMultipleTransferConfirmationReferencesGuideline1.forTransfer29;
			owner_lazy = () -> Transfer33.mmObject();
		}
	};

	/**
	 * TransferConfirmationReference may each be repeated across multiple
	 * instances of the TransferDetails component where the executing party
	 * allocates a common reference to several transfers that are being
	 * confirmed in the same message.
	 */
	public static void checkTransfer18(Transfer18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * TransferConfirmationReference may each be repeated across multiple
	 * instances of the TransferDetails component where the executing party
	 * allocates a common reference to several transfers that are being
	 * confirmed in the same message.
	 */
	public static void checkTransfer26(Transfer26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * TransferConfirmationReference may each be repeated across multiple
	 * instances of the TransferDetails component where the executing party
	 * allocates a common reference to several transfers that are being
	 * confirmed in the same message.
	 */
	public static void checkTransfer13(Transfer13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * TransferConfirmationReference may each be repeated across multiple
	 * instances of the TransferDetails component where the executing party
	 * allocates a common reference to several transfers that are being
	 * confirmed in the same message.
	 */
	public static void checkTransfer23(Transfer23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * TransferConfirmationReference may each be repeated across multiple
	 * instances of the TransferDetails component where the executing party
	 * allocates a common reference to several transfers that are being
	 * confirmed in the same message.
	 */
	public static void checkTransfer28(Transfer28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * TransferConfirmationReference may each be repeated across multiple
	 * instances of the TransferDetails component where the executing party
	 * allocates a common reference to several transfers that are being
	 * confirmed in the same message.
	 */
	public static void checkTransfer29(Transfer29 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * TransferConfirmationReference may each be repeated across multiple
	 * instances of the TransferDetails component where the executing party
	 * allocates a common reference to several transfers that are being
	 * confirmed in the same message.
	 */
	public static void checkTransfer31(Transfer31 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * TransferConfirmationReference may each be repeated across multiple
	 * instances of the TransferDetails component where the executing party
	 * allocates a common reference to several transfers that are being
	 * confirmed in the same message.
	 */
	public static void checkTransfer33(Transfer33 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}