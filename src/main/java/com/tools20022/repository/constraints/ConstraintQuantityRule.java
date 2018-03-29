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
 * If pre-agreed between account servicer and account owner, then Quantity will
 * be used to instruct the quantity of securities that should be partially
 * processed, for example, partially authorised.
 */
public class ConstraintQuantityRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation3
	 * AdditionalInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If pre-agreed between account servicer and account owner, then Quantity will be used to instruct the quantity of securities that should be partially processed, for example, partially authorised."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalInformation3> forAdditionalInformation3 = new MMConstraint<AdditionalInformation3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityRule";
			definition = "If pre-agreed between account servicer and account owner, then Quantity will be used to instruct the quantity of securities that should be partially processed, for example, partially authorised.";
			owner_lazy = () -> AdditionalInformation3.mmObject();
		}

		@Override
		public void executeValidator(AdditionalInformation3 obj) throws Exception {
			checkAdditionalInformation3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation4
	 * AdditionalInformation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If pre-agreed between account servicer and account owner, then Quantity will be used to instruct the quantity of securities that should be partially processed, for example, partially authorised."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalInformation4> forAdditionalInformation4 = new MMConstraint<AdditionalInformation4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityRule";
			definition = "If pre-agreed between account servicer and account owner, then Quantity will be used to instruct the quantity of securities that should be partially processed, for example, partially authorised.";
			owner_lazy = () -> AdditionalInformation4.mmObject();
		}

		@Override
		public void executeValidator(AdditionalInformation4 obj) throws Exception {
			checkAdditionalInformation4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation7
	 * AdditionalInformation7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If pre-agreed between account servicer and account owner, then Quantity will be used to instruct the quantity of securities that should be partially processed, for example, partially authorised."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintQuantityRule#forAdditionalInformation9
	 * ConstraintQuantityRule.forAdditionalInformation9}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalInformation7> forAdditionalInformation7 = new MMConstraint<AdditionalInformation7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityRule";
			definition = "If pre-agreed between account servicer and account owner, then Quantity will be used to instruct the quantity of securities that should be partially processed, for example, partially authorised.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintQuantityRule.forAdditionalInformation9);
			owner_lazy = () -> AdditionalInformation7.mmObject();
		}

		@Override
		public void executeValidator(AdditionalInformation7 obj) throws Exception {
			checkAdditionalInformation7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation8
	 * AdditionalInformation8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If pre-agreed between account servicer and account owner, then Quantity will be used to instruct the quantity of securities that should be partially processed, for example, partially authorised."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalInformation8> forAdditionalInformation8 = new MMConstraint<AdditionalInformation8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityRule";
			definition = "If pre-agreed between account servicer and account owner, then Quantity will be used to instruct the quantity of securities that should be partially processed, for example, partially authorised.";
			owner_lazy = () -> AdditionalInformation8.mmObject();
		}

		@Override
		public void executeValidator(AdditionalInformation8 obj) throws Exception {
			checkAdditionalInformation8(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation9
	 * AdditionalInformation9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If pre-agreed between account servicer and account owner, then Quantity will be used to instruct the quantity of securities that should be partially processed, for example, partially authorised."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintQuantityRule#forAdditionalInformation11
	 * ConstraintQuantityRule.forAdditionalInformation11}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintQuantityRule#forAdditionalInformation7
	 * ConstraintQuantityRule.forAdditionalInformation7}</li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalInformation9> forAdditionalInformation9 = new MMConstraint<AdditionalInformation9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityRule";
			definition = "If pre-agreed between account servicer and account owner, then Quantity will be used to instruct the quantity of securities that should be partially processed, for example, partially authorised.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintQuantityRule.forAdditionalInformation11);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintQuantityRule.forAdditionalInformation7;
			owner_lazy = () -> AdditionalInformation9.mmObject();
		}

		@Override
		public void executeValidator(AdditionalInformation9 obj) throws Exception {
			checkAdditionalInformation9(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation10
	 * AdditionalInformation10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If pre-agreed between account servicer and account owner, then Quantity will be used to instruct the quantity of securities that should be partially processed, for example, partially authorised."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalInformation10> forAdditionalInformation10 = new MMConstraint<AdditionalInformation10>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityRule";
			definition = "If pre-agreed between account servicer and account owner, then Quantity will be used to instruct the quantity of securities that should be partially processed, for example, partially authorised.";
			owner_lazy = () -> AdditionalInformation10.mmObject();
		}

		@Override
		public void executeValidator(AdditionalInformation10 obj) throws Exception {
			checkAdditionalInformation10(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation11
	 * AdditionalInformation11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If pre-agreed between account servicer and account owner, then Quantity will be used to instruct the quantity of securities that should be partially processed, for example, partially authorised."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintQuantityRule#forAdditionalInformation13
	 * ConstraintQuantityRule.forAdditionalInformation13}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintQuantityRule#forAdditionalInformation9
	 * ConstraintQuantityRule.forAdditionalInformation9}</li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalInformation11> forAdditionalInformation11 = new MMConstraint<AdditionalInformation11>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityRule";
			definition = "If pre-agreed between account servicer and account owner, then Quantity will be used to instruct the quantity of securities that should be partially processed, for example, partially authorised.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintQuantityRule.forAdditionalInformation13);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintQuantityRule.forAdditionalInformation9;
			owner_lazy = () -> AdditionalInformation11.mmObject();
		}

		@Override
		public void executeValidator(AdditionalInformation11 obj) throws Exception {
			checkAdditionalInformation11(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation12
	 * AdditionalInformation12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If pre-agreed between account servicer and account owner, then Quantity will be used to instruct the quantity of securities that should be partially processed, for example, partially authorised."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalInformation12> forAdditionalInformation12 = new MMConstraint<AdditionalInformation12>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityRule";
			definition = "If pre-agreed between account servicer and account owner, then Quantity will be used to instruct the quantity of securities that should be partially processed, for example, partially authorised.";
			owner_lazy = () -> AdditionalInformation12.mmObject();
		}

		@Override
		public void executeValidator(AdditionalInformation12 obj) throws Exception {
			checkAdditionalInformation12(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation13
	 * AdditionalInformation13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If pre-agreed between account servicer and account owner, then Quantity will be used to instruct the quantity of securities that should be partially processed, for example, partially authorised."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintQuantityRule#forAdditionalInformation11
	 * ConstraintQuantityRule.forAdditionalInformation11}</li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalInformation13> forAdditionalInformation13 = new MMConstraint<AdditionalInformation13>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityRule";
			definition = "If pre-agreed between account servicer and account owner, then Quantity will be used to instruct the quantity of securities that should be partially processed, for example, partially authorised.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintQuantityRule.forAdditionalInformation11;
			owner_lazy = () -> AdditionalInformation13.mmObject();
		}

		@Override
		public void executeValidator(AdditionalInformation13 obj) throws Exception {
			checkAdditionalInformation13(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation14
	 * AdditionalInformation14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If pre-agreed between account servicer and account owner, then Quantity will be used to instruct the quantity of securities that should be partially processed, for example, partially authorised."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalInformation14> forAdditionalInformation14 = new MMConstraint<AdditionalInformation14>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityRule";
			definition = "If pre-agreed between account servicer and account owner, then Quantity will be used to instruct the quantity of securities that should be partially processed, for example, partially authorised.";
			owner_lazy = () -> AdditionalInformation14.mmObject();
		}

		@Override
		public void executeValidator(AdditionalInformation14 obj) throws Exception {
			checkAdditionalInformation14(obj);
		}
	};

	/**
	 * If pre-agreed between account servicer and account owner, then Quantity
	 * will be used to instruct the quantity of securities that should be
	 * partially processed, for example, partially authorised.
	 */
	public static void checkAdditionalInformation3(AdditionalInformation3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If pre-agreed between account servicer and account owner, then Quantity
	 * will be used to instruct the quantity of securities that should be
	 * partially processed, for example, partially authorised.
	 */
	public static void checkAdditionalInformation4(AdditionalInformation4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If pre-agreed between account servicer and account owner, then Quantity
	 * will be used to instruct the quantity of securities that should be
	 * partially processed, for example, partially authorised.
	 */
	public static void checkAdditionalInformation7(AdditionalInformation7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If pre-agreed between account servicer and account owner, then Quantity
	 * will be used to instruct the quantity of securities that should be
	 * partially processed, for example, partially authorised.
	 */
	public static void checkAdditionalInformation8(AdditionalInformation8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If pre-agreed between account servicer and account owner, then Quantity
	 * will be used to instruct the quantity of securities that should be
	 * partially processed, for example, partially authorised.
	 */
	public static void checkAdditionalInformation9(AdditionalInformation9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If pre-agreed between account servicer and account owner, then Quantity
	 * will be used to instruct the quantity of securities that should be
	 * partially processed, for example, partially authorised.
	 */
	public static void checkAdditionalInformation10(AdditionalInformation10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If pre-agreed between account servicer and account owner, then Quantity
	 * will be used to instruct the quantity of securities that should be
	 * partially processed, for example, partially authorised.
	 */
	public static void checkAdditionalInformation11(AdditionalInformation11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If pre-agreed between account servicer and account owner, then Quantity
	 * will be used to instruct the quantity of securities that should be
	 * partially processed, for example, partially authorised.
	 */
	public static void checkAdditionalInformation12(AdditionalInformation12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If pre-agreed between account servicer and account owner, then Quantity
	 * will be used to instruct the quantity of securities that should be
	 * partially processed, for example, partially authorised.
	 */
	public static void checkAdditionalInformation13(AdditionalInformation13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If pre-agreed between account servicer and account owner, then Quantity
	 * will be used to instruct the quantity of securities that should be
	 * partially processed, for example, partially authorised.
	 */
	public static void checkAdditionalInformation14(AdditionalInformation14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}