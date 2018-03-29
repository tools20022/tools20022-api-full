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
 * Effective date is to be used in events where there is no concept of
 * entitlement, for instance Name Change (CHAN) or Place of Incorporation
 * (PLAC), and in events where there is a sense of eligibility but with a legal
 * obligation, for instance Merger (MRGR).
 */
public class ConstraintEffectiveDateRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1
	 * CorporateActionDate1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Effective date is to be used in events where there is no concept of entitlement, for instance Name Change (CHAN) or Place of Incorporation (PLAC), and in events where there is a sense of eligibility but with a legal obligation, for instance Merger (MRGR)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionDate1> forCorporateActionDate1 = new MMConstraint<CorporateActionDate1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveDateRule";
			definition = "Effective date is to be used in events where there is no concept of entitlement, for instance Name Change (CHAN) or Place of Incorporation (PLAC), and in events where there is a sense of eligibility but with a legal obligation, for instance Merger (MRGR).";
			owner_lazy = () -> CorporateActionDate1.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionDate1 obj) throws Exception {
			checkCorporateActionDate1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13
	 * CorporateActionDate13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Effective date is to be used in events where there is no concept of entitlement, for instance Name Change (CHAN) or Place of Incorporation (PLAC), and in events where there is a sense of eligibility but with a legal obligation, for instance Merger (MRGR)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionDate13> forCorporateActionDate13 = new MMConstraint<CorporateActionDate13>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveDateRule";
			definition = "Effective date is to be used in events where there is no concept of entitlement, for instance Name Change (CHAN) or Place of Incorporation (PLAC), and in events where there is a sense of eligibility but with a legal obligation, for instance Merger (MRGR).";
			owner_lazy = () -> CorporateActionDate13.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionDate13 obj) throws Exception {
			checkCorporateActionDate13(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14
	 * CorporateActionDate14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Effective date is to be used in events where there is no concept of entitlement, for instance Name Change (CHAN) or Place of Incorporation (PLAC), and in events where there is a sense of eligibility but with a legal obligation, for instance Merger (MRGR)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionDate14> forCorporateActionDate14 = new MMConstraint<CorporateActionDate14>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveDateRule";
			definition = "Effective date is to be used in events where there is no concept of entitlement, for instance Name Change (CHAN) or Place of Incorporation (PLAC), and in events where there is a sense of eligibility but with a legal obligation, for instance Merger (MRGR).";
			owner_lazy = () -> CorporateActionDate14.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionDate14 obj) throws Exception {
			checkCorporateActionDate14(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21
	 * CorporateActionDate21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Effective date is to be used in events where there is no concept of entitlement, for instance Name Change (CHAN) or Place of Incorporation (PLAC), and in events where there is a sense of eligibility but with a legal obligation, for instance Merger (MRGR)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionDate21> forCorporateActionDate21 = new MMConstraint<CorporateActionDate21>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveDateRule";
			definition = "Effective date is to be used in events where there is no concept of entitlement, for instance Name Change (CHAN) or Place of Incorporation (PLAC), and in events where there is a sense of eligibility but with a legal obligation, for instance Merger (MRGR).";
			owner_lazy = () -> CorporateActionDate21.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionDate21 obj) throws Exception {
			checkCorporateActionDate21(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22
	 * CorporateActionDate22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Effective date is to be used in events where there is no concept of entitlement, for instance Name Change (CHAN) or Place of Incorporation (PLAC), and in events where there is a sense of eligibility but with a legal obligation, for instance Merger (MRGR)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionDate22> forCorporateActionDate22 = new MMConstraint<CorporateActionDate22>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveDateRule";
			definition = "Effective date is to be used in events where there is no concept of entitlement, for instance Name Change (CHAN) or Place of Incorporation (PLAC), and in events where there is a sense of eligibility but with a legal obligation, for instance Merger (MRGR).";
			owner_lazy = () -> CorporateActionDate22.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionDate22 obj) throws Exception {
			checkCorporateActionDate22(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25
	 * CorporateActionDate25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Effective date is to be used in events where there is no concept of entitlement, for instance Name Change (CHAN) or Place of Incorporation (PLAC), and in events where there is a sense of eligibility but with a legal obligation, for instance Merger (MRGR)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionDate25> forCorporateActionDate25 = new MMConstraint<CorporateActionDate25>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveDateRule";
			definition = "Effective date is to be used in events where there is no concept of entitlement, for instance Name Change (CHAN) or Place of Incorporation (PLAC), and in events where there is a sense of eligibility but with a legal obligation, for instance Merger (MRGR).";
			owner_lazy = () -> CorporateActionDate25.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionDate25 obj) throws Exception {
			checkCorporateActionDate25(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27
	 * CorporateActionDate27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Effective date is to be used in events where there is no concept of entitlement, for instance Name Change (CHAN) or Place of Incorporation (PLAC), and in events where there is a sense of eligibility but with a legal obligation, for instance Merger (MRGR)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEffectiveDateRule#forCorporateActionDate44
	 * ConstraintEffectiveDateRule.forCorporateActionDate44}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionDate27> forCorporateActionDate27 = new MMConstraint<CorporateActionDate27>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveDateRule";
			definition = "Effective date is to be used in events where there is no concept of entitlement, for instance Name Change (CHAN) or Place of Incorporation (PLAC), and in events where there is a sense of eligibility but with a legal obligation, for instance Merger (MRGR).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEffectiveDateRule.forCorporateActionDate44);
			owner_lazy = () -> CorporateActionDate27.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionDate27 obj) throws Exception {
			checkCorporateActionDate27(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28
	 * CorporateActionDate28}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Effective date is to be used in events where there is no concept of entitlement, for instance Name Change (CHAN) or Place of Incorporation (PLAC), and in events where there is a sense of eligibility but with a legal obligation, for instance Merger (MRGR)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionDate28> forCorporateActionDate28 = new MMConstraint<CorporateActionDate28>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveDateRule";
			definition = "Effective date is to be used in events where there is no concept of entitlement, for instance Name Change (CHAN) or Place of Incorporation (PLAC), and in events where there is a sense of eligibility but with a legal obligation, for instance Merger (MRGR).";
			owner_lazy = () -> CorporateActionDate28.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionDate28 obj) throws Exception {
			checkCorporateActionDate28(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44
	 * CorporateActionDate44}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Effective date is to be used in events where there is no concept of entitlement, for instance Name Change (CHAN) or Place of Incorporation (PLAC), and in events where there is a sense of eligibility but with a legal obligation, for instance Merger (MRGR)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEffectiveDateRule#forCorporateActionDate61
	 * ConstraintEffectiveDateRule.forCorporateActionDate61}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEffectiveDateRule#forCorporateActionDate27
	 * ConstraintEffectiveDateRule.forCorporateActionDate27}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionDate44> forCorporateActionDate44 = new MMConstraint<CorporateActionDate44>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveDateRule";
			definition = "Effective date is to be used in events where there is no concept of entitlement, for instance Name Change (CHAN) or Place of Incorporation (PLAC), and in events where there is a sense of eligibility but with a legal obligation, for instance Merger (MRGR).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEffectiveDateRule.forCorporateActionDate61);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEffectiveDateRule.forCorporateActionDate27;
			owner_lazy = () -> CorporateActionDate44.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionDate44 obj) throws Exception {
			checkCorporateActionDate44(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58
	 * CorporateActionDate58}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Effective date is to be used in events where there is no concept of entitlement, for instance Name Change (CHAN) or Place of Incorporation (PLAC), and in events where there is a sense of eligibility but with a legal obligation, for instance Merger (MRGR)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionDate58> forCorporateActionDate58 = new MMConstraint<CorporateActionDate58>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveDateRule";
			definition = "Effective date is to be used in events where there is no concept of entitlement, for instance Name Change (CHAN) or Place of Incorporation (PLAC), and in events where there is a sense of eligibility but with a legal obligation, for instance Merger (MRGR).";
			owner_lazy = () -> CorporateActionDate58.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionDate58 obj) throws Exception {
			checkCorporateActionDate58(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61
	 * CorporateActionDate61}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Effective date is to be used in events where there is no concept of entitlement, for example Name Change (CHAN) or Place of Incorporation (PLAC), and in events where there is a sense of eligibility but with a legal obligation, for example Merger (MRGR)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEffectiveDateRule#forCorporateActionDate44
	 * ConstraintEffectiveDateRule.forCorporateActionDate44}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionDate61> forCorporateActionDate61 = new MMConstraint<CorporateActionDate61>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveDateRule";
			definition = "Effective date is to be used in events where there is no concept of entitlement, for example Name Change (CHAN) or Place of Incorporation (PLAC), and in events where there is a sense of eligibility but with a legal obligation, for example Merger (MRGR).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEffectiveDateRule.forCorporateActionDate44;
			owner_lazy = () -> CorporateActionDate61.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionDate61 obj) throws Exception {
			checkCorporateActionDate61(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74
	 * CorporateActionDate74}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Effective date is to be used in events where there is no concept of entitlement, for example Name Change (CHAN) or Place of Incorporation (PLAC), and in events where there is a sense of eligibility but with a legal obligation, for example Merger (MRGR)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionDate74> forCorporateActionDate74 = new MMConstraint<CorporateActionDate74>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveDateRule";
			definition = "Effective date is to be used in events where there is no concept of entitlement, for example Name Change (CHAN) or Place of Incorporation (PLAC), and in events where there is a sense of eligibility but with a legal obligation, for example Merger (MRGR).";
			owner_lazy = () -> CorporateActionDate74.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionDate74 obj) throws Exception {
			checkCorporateActionDate74(obj);
		}
	};

	/**
	 * Effective date is to be used in events where there is no concept of
	 * entitlement, for instance Name Change (CHAN) or Place of Incorporation
	 * (PLAC), and in events where there is a sense of eligibility but with a
	 * legal obligation, for instance Merger (MRGR).
	 */
	public static void checkCorporateActionDate1(CorporateActionDate1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Effective date is to be used in events where there is no concept of
	 * entitlement, for instance Name Change (CHAN) or Place of Incorporation
	 * (PLAC), and in events where there is a sense of eligibility but with a
	 * legal obligation, for instance Merger (MRGR).
	 */
	public static void checkCorporateActionDate13(CorporateActionDate13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Effective date is to be used in events where there is no concept of
	 * entitlement, for instance Name Change (CHAN) or Place of Incorporation
	 * (PLAC), and in events where there is a sense of eligibility but with a
	 * legal obligation, for instance Merger (MRGR).
	 */
	public static void checkCorporateActionDate14(CorporateActionDate14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Effective date is to be used in events where there is no concept of
	 * entitlement, for instance Name Change (CHAN) or Place of Incorporation
	 * (PLAC), and in events where there is a sense of eligibility but with a
	 * legal obligation, for instance Merger (MRGR).
	 */
	public static void checkCorporateActionDate21(CorporateActionDate21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Effective date is to be used in events where there is no concept of
	 * entitlement, for instance Name Change (CHAN) or Place of Incorporation
	 * (PLAC), and in events where there is a sense of eligibility but with a
	 * legal obligation, for instance Merger (MRGR).
	 */
	public static void checkCorporateActionDate22(CorporateActionDate22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Effective date is to be used in events where there is no concept of
	 * entitlement, for instance Name Change (CHAN) or Place of Incorporation
	 * (PLAC), and in events where there is a sense of eligibility but with a
	 * legal obligation, for instance Merger (MRGR).
	 */
	public static void checkCorporateActionDate25(CorporateActionDate25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Effective date is to be used in events where there is no concept of
	 * entitlement, for instance Name Change (CHAN) or Place of Incorporation
	 * (PLAC), and in events where there is a sense of eligibility but with a
	 * legal obligation, for instance Merger (MRGR).
	 */
	public static void checkCorporateActionDate27(CorporateActionDate27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Effective date is to be used in events where there is no concept of
	 * entitlement, for instance Name Change (CHAN) or Place of Incorporation
	 * (PLAC), and in events where there is a sense of eligibility but with a
	 * legal obligation, for instance Merger (MRGR).
	 */
	public static void checkCorporateActionDate28(CorporateActionDate28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Effective date is to be used in events where there is no concept of
	 * entitlement, for instance Name Change (CHAN) or Place of Incorporation
	 * (PLAC), and in events where there is a sense of eligibility but with a
	 * legal obligation, for instance Merger (MRGR).
	 */
	public static void checkCorporateActionDate44(CorporateActionDate44 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Effective date is to be used in events where there is no concept of
	 * entitlement, for instance Name Change (CHAN) or Place of Incorporation
	 * (PLAC), and in events where there is a sense of eligibility but with a
	 * legal obligation, for instance Merger (MRGR).
	 */
	public static void checkCorporateActionDate58(CorporateActionDate58 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Effective date is to be used in events where there is no concept of
	 * entitlement, for example Name Change (CHAN) or Place of Incorporation
	 * (PLAC), and in events where there is a sense of eligibility but with a
	 * legal obligation, for example Merger (MRGR).
	 */
	public static void checkCorporateActionDate61(CorporateActionDate61 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Effective date is to be used in events where there is no concept of
	 * entitlement, for example Name Change (CHAN) or Place of Incorporation
	 * (PLAC), and in events where there is a sense of eligibility but with a
	 * legal obligation, for example Merger (MRGR).
	 */
	public static void checkCorporateActionDate74(CorporateActionDate74 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}