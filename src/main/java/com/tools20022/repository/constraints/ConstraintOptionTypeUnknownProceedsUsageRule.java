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
 * When used, the corporate action option code Unknown Proceeds should be
 * maintained throughout the full lifecycle of the event.
 */
public class ConstraintOptionTypeUnknownProceedsUsageRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption36
	 * CorporateActionOption36}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionTypeUnknownProceedsUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When used, the corporate action option code Unknown Proceeds should be maintained throughout the full lifecycle of the event."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption36> forCorporateActionOption36 = new MMConstraint<CorporateActionOption36>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionTypeUnknownProceedsUsageRule";
			definition = "When used, the corporate action option code Unknown Proceeds should be maintained throughout the full lifecycle of the event.";
			owner_lazy = () -> CorporateActionOption36.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption36 obj) throws Exception {
			checkCorporateActionOption36(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption45
	 * CorporateActionOption45}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionTypeUnknownProceedsUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When used, the corporate action option code Unknown Proceeds should be maintained throughout the full lifecycle of the event."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption45> forCorporateActionOption45 = new MMConstraint<CorporateActionOption45>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionTypeUnknownProceedsUsageRule";
			definition = "When used, the corporate action option code Unknown Proceeds should be maintained throughout the full lifecycle of the event.";
			owner_lazy = () -> CorporateActionOption45.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption45 obj) throws Exception {
			checkCorporateActionOption45(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption51
	 * CorporateActionOption51}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionTypeUnknownProceedsUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When used, the corporate action option code Unknown Proceeds should be maintained throughout the full lifecycle of the event."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionTypeUnknownProceedsUsageRule#forCorporateActionOption101
	 * ConstraintOptionTypeUnknownProceedsUsageRule.forCorporateActionOption101}
	 * </li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption51> forCorporateActionOption51 = new MMConstraint<CorporateActionOption51>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionTypeUnknownProceedsUsageRule";
			definition = "When used, the corporate action option code Unknown Proceeds should be maintained throughout the full lifecycle of the event.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOptionTypeUnknownProceedsUsageRule.forCorporateActionOption101);
			owner_lazy = () -> CorporateActionOption51.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption51 obj) throws Exception {
			checkCorporateActionOption51(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption56
	 * CorporateActionOption56}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionTypeUnknownProceedsUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When used, the corporate action option code Unknown Proceeds should be maintained throughout the full lifecycle of the event."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption56> forCorporateActionOption56 = new MMConstraint<CorporateActionOption56>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionTypeUnknownProceedsUsageRule";
			definition = "When used, the corporate action option code Unknown Proceeds should be maintained throughout the full lifecycle of the event.";
			owner_lazy = () -> CorporateActionOption56.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption56 obj) throws Exception {
			checkCorporateActionOption56(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption101
	 * CorporateActionOption101}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionTypeUnknownProceedsUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When used, the corporate action option code Unknown Proceeds should be maintained throughout the full lifecycle of the event."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionTypeUnknownProceedsUsageRule#forCorporateActionOption114
	 * ConstraintOptionTypeUnknownProceedsUsageRule.forCorporateActionOption114}
	 * </li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionTypeUnknownProceedsUsageRule#forCorporateActionOption51
	 * ConstraintOptionTypeUnknownProceedsUsageRule.forCorporateActionOption51}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption101> forCorporateActionOption101 = new MMConstraint<CorporateActionOption101>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionTypeUnknownProceedsUsageRule";
			definition = "When used, the corporate action option code Unknown Proceeds should be maintained throughout the full lifecycle of the event.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOptionTypeUnknownProceedsUsageRule.forCorporateActionOption114);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOptionTypeUnknownProceedsUsageRule.forCorporateActionOption51;
			owner_lazy = () -> CorporateActionOption101.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption101 obj) throws Exception {
			checkCorporateActionOption101(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption106
	 * CorporateActionOption106}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionTypeUnknownProceedsUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When used, the corporate action option code Unknown Proceeds should be maintained throughout the full lifecycle of the event."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption106> forCorporateActionOption106 = new MMConstraint<CorporateActionOption106>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionTypeUnknownProceedsUsageRule";
			definition = "When used, the corporate action option code Unknown Proceeds should be maintained throughout the full lifecycle of the event.";
			owner_lazy = () -> CorporateActionOption106.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption106 obj) throws Exception {
			checkCorporateActionOption106(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114
	 * CorporateActionOption114}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionTypeUnknownProceedsUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When used, the corporate action option code Unknown Proceeds should be maintained throughout the full lifecycle of the event."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionTypeUnknownProceedsUsageRule#forCorporateActionOption130
	 * ConstraintOptionTypeUnknownProceedsUsageRule.forCorporateActionOption130}
	 * </li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionTypeUnknownProceedsUsageRule#forCorporateActionOption101
	 * ConstraintOptionTypeUnknownProceedsUsageRule.forCorporateActionOption101}
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption114> forCorporateActionOption114 = new MMConstraint<CorporateActionOption114>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionTypeUnknownProceedsUsageRule";
			definition = "When used, the corporate action option code Unknown Proceeds should be maintained throughout the full lifecycle of the event.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOptionTypeUnknownProceedsUsageRule.forCorporateActionOption130);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOptionTypeUnknownProceedsUsageRule.forCorporateActionOption101;
			owner_lazy = () -> CorporateActionOption114.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption114 obj) throws Exception {
			checkCorporateActionOption114(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption127
	 * CorporateActionOption127}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionTypeUnknownProceedsUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When used, the corporate action option code Unknown Proceeds should be maintained throughout the full lifecycle of the event."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption127> forCorporateActionOption127 = new MMConstraint<CorporateActionOption127>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionTypeUnknownProceedsUsageRule";
			definition = "When used, the corporate action option code Unknown Proceeds should be maintained throughout the full lifecycle of the event.";
			owner_lazy = () -> CorporateActionOption127.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption127 obj) throws Exception {
			checkCorporateActionOption127(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130
	 * CorporateActionOption130}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionTypeUnknownProceedsUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When used, the corporate action option code Unknown Proceeds should be maintained throughout the full lifecycle of the event."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionTypeUnknownProceedsUsageRule#forCorporateActionOption138
	 * ConstraintOptionTypeUnknownProceedsUsageRule.forCorporateActionOption138}
	 * </li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionTypeUnknownProceedsUsageRule#forCorporateActionOption114
	 * ConstraintOptionTypeUnknownProceedsUsageRule.forCorporateActionOption114}
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption130> forCorporateActionOption130 = new MMConstraint<CorporateActionOption130>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionTypeUnknownProceedsUsageRule";
			definition = "When used, the corporate action option code Unknown Proceeds should be maintained throughout the full lifecycle of the event.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOptionTypeUnknownProceedsUsageRule.forCorporateActionOption138);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOptionTypeUnknownProceedsUsageRule.forCorporateActionOption114;
			owner_lazy = () -> CorporateActionOption130.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption130 obj) throws Exception {
			checkCorporateActionOption130(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption133
	 * CorporateActionOption133}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionTypeUnknownProceedsUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When used, the corporate action option code Unknown Proceeds should be maintained throughout the full lifecycle of the event."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption133> forCorporateActionOption133 = new MMConstraint<CorporateActionOption133>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionTypeUnknownProceedsUsageRule";
			definition = "When used, the corporate action option code Unknown Proceeds should be maintained throughout the full lifecycle of the event.";
			owner_lazy = () -> CorporateActionOption133.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption133 obj) throws Exception {
			checkCorporateActionOption133(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption138
	 * CorporateActionOption138}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionTypeUnknownProceedsUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When used, the corporate action option code PRUN (Unknown Proceeds) should be maintained throughout the full lifecycle of the event."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionTypeUnknownProceedsUsageRule#forCorporateActionOption130
	 * ConstraintOptionTypeUnknownProceedsUsageRule.forCorporateActionOption130}
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption138> forCorporateActionOption138 = new MMConstraint<CorporateActionOption138>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionTypeUnknownProceedsUsageRule";
			definition = "When used, the corporate action option code PRUN (Unknown Proceeds) should be maintained throughout the full lifecycle of the event.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOptionTypeUnknownProceedsUsageRule.forCorporateActionOption130;
			owner_lazy = () -> CorporateActionOption138.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption138 obj) throws Exception {
			checkCorporateActionOption138(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption150
	 * CorporateActionOption150}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionTypeUnknownProceedsUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When used, the corporate action option code PRUN (Unknown Proceeds) should be maintained throughout the full lifecycle of the event."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption150> forCorporateActionOption150 = new MMConstraint<CorporateActionOption150>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionTypeUnknownProceedsUsageRule";
			definition = "When used, the corporate action option code PRUN (Unknown Proceeds) should be maintained throughout the full lifecycle of the event.";
			owner_lazy = () -> CorporateActionOption150.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption150 obj) throws Exception {
			checkCorporateActionOption150(obj);
		}
	};

	/**
	 * When used, the corporate action option code Unknown Proceeds should be
	 * maintained throughout the full lifecycle of the event.
	 */
	public static void checkCorporateActionOption36(CorporateActionOption36 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When used, the corporate action option code Unknown Proceeds should be
	 * maintained throughout the full lifecycle of the event.
	 */
	public static void checkCorporateActionOption45(CorporateActionOption45 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When used, the corporate action option code Unknown Proceeds should be
	 * maintained throughout the full lifecycle of the event.
	 */
	public static void checkCorporateActionOption51(CorporateActionOption51 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When used, the corporate action option code Unknown Proceeds should be
	 * maintained throughout the full lifecycle of the event.
	 */
	public static void checkCorporateActionOption56(CorporateActionOption56 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When used, the corporate action option code Unknown Proceeds should be
	 * maintained throughout the full lifecycle of the event.
	 */
	public static void checkCorporateActionOption101(CorporateActionOption101 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When used, the corporate action option code Unknown Proceeds should be
	 * maintained throughout the full lifecycle of the event.
	 */
	public static void checkCorporateActionOption106(CorporateActionOption106 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When used, the corporate action option code Unknown Proceeds should be
	 * maintained throughout the full lifecycle of the event.
	 */
	public static void checkCorporateActionOption114(CorporateActionOption114 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When used, the corporate action option code Unknown Proceeds should be
	 * maintained throughout the full lifecycle of the event.
	 */
	public static void checkCorporateActionOption127(CorporateActionOption127 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When used, the corporate action option code Unknown Proceeds should be
	 * maintained throughout the full lifecycle of the event.
	 */
	public static void checkCorporateActionOption130(CorporateActionOption130 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When used, the corporate action option code Unknown Proceeds should be
	 * maintained throughout the full lifecycle of the event.
	 */
	public static void checkCorporateActionOption133(CorporateActionOption133 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When used, the corporate action option code PRUN (Unknown Proceeds)
	 * should be maintained throughout the full lifecycle of the event.
	 */
	public static void checkCorporateActionOption138(CorporateActionOption138 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When used, the corporate action option code PRUN (Unknown Proceeds)
	 * should be maintained throughout the full lifecycle of the event.
	 */
	public static void checkCorporateActionOption150(CorporateActionOption150 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}