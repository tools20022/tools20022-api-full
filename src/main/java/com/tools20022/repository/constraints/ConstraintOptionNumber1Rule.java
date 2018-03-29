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
 * For differentiation between options, the OptionNumber must be used (preferred
 * rather than the OptionType eg, in the case where two or more offers can be
 * described by the same corporate action option code). Therefore, the
 * OptionNumber value must be different for each option.
 */
public class ConstraintOptionNumber1Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption5
	 * CorporateActionOption5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumber1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType eg, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption5> forCorporateActionOption5 = new MMConstraint<CorporateActionOption5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumber1Rule";
			definition = "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType eg, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option.";
			owner_lazy = () -> CorporateActionOption5.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption5 obj) throws Exception {
			checkCorporateActionOption5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption13
	 * CorporateActionOption13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumber1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType eg, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption13> forCorporateActionOption13 = new MMConstraint<CorporateActionOption13>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumber1Rule";
			definition = "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType eg, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option.";
			owner_lazy = () -> CorporateActionOption13.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption13 obj) throws Exception {
			checkCorporateActionOption13(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption25
	 * CorporateActionOption25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumber1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType eg, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption25> forCorporateActionOption25 = new MMConstraint<CorporateActionOption25>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumber1Rule";
			definition = "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType eg, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option.";
			owner_lazy = () -> CorporateActionOption25.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption25 obj) throws Exception {
			checkCorporateActionOption25(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption30
	 * CorporateActionOption30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumber1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType eg, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption30> forCorporateActionOption30 = new MMConstraint<CorporateActionOption30>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumber1Rule";
			definition = "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType eg, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option.";
			owner_lazy = () -> CorporateActionOption30.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption30 obj) throws Exception {
			checkCorporateActionOption30(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption38
	 * CorporateActionOption38}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumber1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType eg, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption38> forCorporateActionOption38 = new MMConstraint<CorporateActionOption38>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumber1Rule";
			definition = "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType eg, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option.";
			owner_lazy = () -> CorporateActionOption38.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption38 obj) throws Exception {
			checkCorporateActionOption38(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption47
	 * CorporateActionOption47}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumber1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType eg, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption47> forCorporateActionOption47 = new MMConstraint<CorporateActionOption47>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumber1Rule";
			definition = "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType eg, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option.";
			owner_lazy = () -> CorporateActionOption47.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption47 obj) throws Exception {
			checkCorporateActionOption47(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption57
	 * CorporateActionOption57}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumber1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType eg, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionNumber1Rule#forCorporateActionOption103
	 * ConstraintOptionNumber1Rule.forCorporateActionOption103}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption57> forCorporateActionOption57 = new MMConstraint<CorporateActionOption57>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumber1Rule";
			definition = "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType eg, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOptionNumber1Rule.forCorporateActionOption103);
			owner_lazy = () -> CorporateActionOption57.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption57 obj) throws Exception {
			checkCorporateActionOption57(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption58
	 * CorporateActionOption58}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumber1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType eg, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption58> forCorporateActionOption58 = new MMConstraint<CorporateActionOption58>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumber1Rule";
			definition = "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType eg, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option.";
			owner_lazy = () -> CorporateActionOption58.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption58 obj) throws Exception {
			checkCorporateActionOption58(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption6
	 * CorporateActionOption6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumber1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType eg, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption6> forCorporateActionOption6 = new MMConstraint<CorporateActionOption6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumber1Rule";
			definition = "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType eg, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option.";
			owner_lazy = () -> CorporateActionOption6.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption6 obj) throws Exception {
			checkCorporateActionOption6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption21
	 * CorporateActionOption21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumber1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType eg, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption21> forCorporateActionOption21 = new MMConstraint<CorporateActionOption21>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumber1Rule";
			definition = "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType eg, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option.";
			owner_lazy = () -> CorporateActionOption21.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption21 obj) throws Exception {
			checkCorporateActionOption21(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption42
	 * CorporateActionOption42}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumber1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType eg, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionNumber1Rule#forCorporateActionOption120
	 * ConstraintOptionNumber1Rule.forCorporateActionOption120}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption42> forCorporateActionOption42 = new MMConstraint<CorporateActionOption42>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumber1Rule";
			definition = "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType eg, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOptionNumber1Rule.forCorporateActionOption120);
			owner_lazy = () -> CorporateActionOption42.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption42 obj) throws Exception {
			checkCorporateActionOption42(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption28
	 * CorporateActionOption28}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumber1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType eg, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption28> forCorporateActionOption28 = new MMConstraint<CorporateActionOption28>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumber1Rule";
			definition = "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType eg, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option.";
			owner_lazy = () -> CorporateActionOption28.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption28 obj) throws Exception {
			checkCorporateActionOption28(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption43
	 * CorporateActionOption43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumber1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType eg, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption43> forCorporateActionOption43 = new MMConstraint<CorporateActionOption43>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumber1Rule";
			definition = "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType eg, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option.";
			owner_lazy = () -> CorporateActionOption43.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption43 obj) throws Exception {
			checkCorporateActionOption43(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption7
	 * CorporateActionOption7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumber1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType eg, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption7> forCorporateActionOption7 = new MMConstraint<CorporateActionOption7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumber1Rule";
			definition = "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType eg, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option.";
			owner_lazy = () -> CorporateActionOption7.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption7 obj) throws Exception {
			checkCorporateActionOption7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption103
	 * CorporateActionOption103}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumber1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType eg, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionNumber1Rule#forCorporateActionOption118
	 * ConstraintOptionNumber1Rule.forCorporateActionOption118}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionNumber1Rule#forCorporateActionOption57
	 * ConstraintOptionNumber1Rule.forCorporateActionOption57}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption103> forCorporateActionOption103 = new MMConstraint<CorporateActionOption103>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumber1Rule";
			definition = "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType eg, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOptionNumber1Rule.forCorporateActionOption118);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOptionNumber1Rule.forCorporateActionOption57;
			owner_lazy = () -> CorporateActionOption103.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption103 obj) throws Exception {
			checkCorporateActionOption103(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption107
	 * CorporateActionOption107}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumber1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType eg, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption107> forCorporateActionOption107 = new MMConstraint<CorporateActionOption107>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumber1Rule";
			definition = "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType eg, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option.";
			owner_lazy = () -> CorporateActionOption107.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption107 obj) throws Exception {
			checkCorporateActionOption107(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption118
	 * CorporateActionOption118}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumber1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType, for example, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionNumber1Rule#forCorporateActionOption131
	 * ConstraintOptionNumber1Rule.forCorporateActionOption131}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionNumber1Rule#forCorporateActionOption103
	 * ConstraintOptionNumber1Rule.forCorporateActionOption103}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption118> forCorporateActionOption118 = new MMConstraint<CorporateActionOption118>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumber1Rule";
			definition = "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType, for example, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOptionNumber1Rule.forCorporateActionOption131);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOptionNumber1Rule.forCorporateActionOption103;
			owner_lazy = () -> CorporateActionOption118.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption118 obj) throws Exception {
			checkCorporateActionOption118(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption120
	 * CorporateActionOption120}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumber1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType for example in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionNumber1Rule#forCorporateActionOption42
	 * ConstraintOptionNumber1Rule.forCorporateActionOption42}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption120> forCorporateActionOption120 = new MMConstraint<CorporateActionOption120>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumber1Rule";
			definition = "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType for example in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOptionNumber1Rule.forCorporateActionOption42;
			owner_lazy = () -> CorporateActionOption120.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption120 obj) throws Exception {
			checkCorporateActionOption120(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption123
	 * CorporateActionOption123}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumber1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType, for example, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption123> forCorporateActionOption123 = new MMConstraint<CorporateActionOption123>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumber1Rule";
			definition = "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType, for example, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option.";
			owner_lazy = () -> CorporateActionOption123.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption123 obj) throws Exception {
			checkCorporateActionOption123(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption128
	 * CorporateActionOption128}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumber1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType for example in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption128> forCorporateActionOption128 = new MMConstraint<CorporateActionOption128>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumber1Rule";
			definition = "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType for example in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option.";
			owner_lazy = () -> CorporateActionOption128.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption128 obj) throws Exception {
			checkCorporateActionOption128(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption131
	 * CorporateActionOption131}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumber1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType, for example, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionNumber1Rule#forCorporateActionOption142
	 * ConstraintOptionNumber1Rule.forCorporateActionOption142}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionNumber1Rule#forCorporateActionOption118
	 * ConstraintOptionNumber1Rule.forCorporateActionOption118}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption131> forCorporateActionOption131 = new MMConstraint<CorporateActionOption131>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumber1Rule";
			definition = "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType, for example, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOptionNumber1Rule.forCorporateActionOption142);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOptionNumber1Rule.forCorporateActionOption118;
			owner_lazy = () -> CorporateActionOption131.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption131 obj) throws Exception {
			checkCorporateActionOption131(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption134
	 * CorporateActionOption134}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumber1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType, for example, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption134> forCorporateActionOption134 = new MMConstraint<CorporateActionOption134>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumber1Rule";
			definition = "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType, for example, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option.";
			owner_lazy = () -> CorporateActionOption134.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption134 obj) throws Exception {
			checkCorporateActionOption134(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption142
	 * CorporateActionOption142}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumber1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For differentiation between options, the OptionNumber rather than the OptionType must be used, for example, in the case where two or more offers can be described by the same corporate action option code. Therefore, the OptionNumber value must be different for each option."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionNumber1Rule#forCorporateActionOption131
	 * ConstraintOptionNumber1Rule.forCorporateActionOption131}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption142> forCorporateActionOption142 = new MMConstraint<CorporateActionOption142>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumber1Rule";
			definition = "For differentiation between options, the OptionNumber rather than the OptionType must be used, for example, in the case where two or more offers can be described by the same corporate action option code. Therefore, the OptionNumber value must be different for each option.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOptionNumber1Rule.forCorporateActionOption131;
			owner_lazy = () -> CorporateActionOption142.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption142 obj) throws Exception {
			checkCorporateActionOption142(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption146
	 * CorporateActionOption146}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumber1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For differentiation between options, the OptionNumber rather than the OptionType must be used, for example, in the case where two or more offers can be described by the same corporate action option code. Therefore, the OptionNumber value must be different for each option."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption146> forCorporateActionOption146 = new MMConstraint<CorporateActionOption146>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumber1Rule";
			definition = "For differentiation between options, the OptionNumber rather than the OptionType must be used, for example, in the case where two or more offers can be described by the same corporate action option code. Therefore, the OptionNumber value must be different for each option.";
			owner_lazy = () -> CorporateActionOption146.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption146 obj) throws Exception {
			checkCorporateActionOption146(obj);
		}
	};

	/**
	 * For differentiation between options, the OptionNumber must be used
	 * (preferred rather than the OptionType eg, in the case where two or more
	 * offers can be described by the same corporate action option code).
	 * Therefore, the OptionNumber value must be different for each option.
	 */
	public static void checkCorporateActionOption5(CorporateActionOption5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For differentiation between options, the OptionNumber must be used
	 * (preferred rather than the OptionType eg, in the case where two or more
	 * offers can be described by the same corporate action option code).
	 * Therefore, the OptionNumber value must be different for each option.
	 */
	public static void checkCorporateActionOption13(CorporateActionOption13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For differentiation between options, the OptionNumber must be used
	 * (preferred rather than the OptionType eg, in the case where two or more
	 * offers can be described by the same corporate action option code).
	 * Therefore, the OptionNumber value must be different for each option.
	 */
	public static void checkCorporateActionOption25(CorporateActionOption25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For differentiation between options, the OptionNumber must be used
	 * (preferred rather than the OptionType eg, in the case where two or more
	 * offers can be described by the same corporate action option code).
	 * Therefore, the OptionNumber value must be different for each option.
	 */
	public static void checkCorporateActionOption30(CorporateActionOption30 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For differentiation between options, the OptionNumber must be used
	 * (preferred rather than the OptionType eg, in the case where two or more
	 * offers can be described by the same corporate action option code).
	 * Therefore, the OptionNumber value must be different for each option.
	 */
	public static void checkCorporateActionOption38(CorporateActionOption38 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For differentiation between options, the OptionNumber must be used
	 * (preferred rather than the OptionType eg, in the case where two or more
	 * offers can be described by the same corporate action option code).
	 * Therefore, the OptionNumber value must be different for each option.
	 */
	public static void checkCorporateActionOption47(CorporateActionOption47 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For differentiation between options, the OptionNumber must be used
	 * (preferred rather than the OptionType eg, in the case where two or more
	 * offers can be described by the same corporate action option code).
	 * Therefore, the OptionNumber value must be different for each option.
	 */
	public static void checkCorporateActionOption57(CorporateActionOption57 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For differentiation between options, the OptionNumber must be used
	 * (preferred rather than the OptionType eg, in the case where two or more
	 * offers can be described by the same corporate action option code).
	 * Therefore, the OptionNumber value must be different for each option.
	 */
	public static void checkCorporateActionOption58(CorporateActionOption58 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For differentiation between options, the OptionNumber must be used
	 * (preferred rather than the OptionType eg, in the case where two or more
	 * offers can be described by the same corporate action option code).
	 * Therefore, the OptionNumber value must be different for each option.
	 */
	public static void checkCorporateActionOption6(CorporateActionOption6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For differentiation between options, the OptionNumber must be used
	 * (preferred rather than the OptionType eg, in the case where two or more
	 * offers can be described by the same corporate action option code).
	 * Therefore, the OptionNumber value must be different for each option.
	 */
	public static void checkCorporateActionOption21(CorporateActionOption21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For differentiation between options, the OptionNumber must be used
	 * (preferred rather than the OptionType eg, in the case where two or more
	 * offers can be described by the same corporate action option code).
	 * Therefore, the OptionNumber value must be different for each option.
	 */
	public static void checkCorporateActionOption42(CorporateActionOption42 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For differentiation between options, the OptionNumber must be used
	 * (preferred rather than the OptionType eg, in the case where two or more
	 * offers can be described by the same corporate action option code).
	 * Therefore, the OptionNumber value must be different for each option.
	 */
	public static void checkCorporateActionOption28(CorporateActionOption28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For differentiation between options, the OptionNumber must be used
	 * (preferred rather than the OptionType eg, in the case where two or more
	 * offers can be described by the same corporate action option code).
	 * Therefore, the OptionNumber value must be different for each option.
	 */
	public static void checkCorporateActionOption43(CorporateActionOption43 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For differentiation between options, the OptionNumber must be used
	 * (preferred rather than the OptionType eg, in the case where two or more
	 * offers can be described by the same corporate action option code).
	 * Therefore, the OptionNumber value must be different for each option.
	 */
	public static void checkCorporateActionOption7(CorporateActionOption7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For differentiation between options, the OptionNumber must be used
	 * (preferred rather than the OptionType eg, in the case where two or more
	 * offers can be described by the same corporate action option code).
	 * Therefore, the OptionNumber value must be different for each option.
	 */
	public static void checkCorporateActionOption103(CorporateActionOption103 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For differentiation between options, the OptionNumber must be used
	 * (preferred rather than the OptionType eg, in the case where two or more
	 * offers can be described by the same corporate action option code).
	 * Therefore, the OptionNumber value must be different for each option.
	 */
	public static void checkCorporateActionOption107(CorporateActionOption107 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For differentiation between options, the OptionNumber must be used
	 * (preferred rather than the OptionType, for example, in the case where two
	 * or more offers can be described by the same corporate action option
	 * code). Therefore, the OptionNumber value must be different for each
	 * option.
	 */
	public static void checkCorporateActionOption118(CorporateActionOption118 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For differentiation between options, the OptionNumber must be used
	 * (preferred rather than the OptionType for example in the case where two
	 * or more offers can be described by the same corporate action option
	 * code). Therefore, the OptionNumber value must be different for each
	 * option.
	 */
	public static void checkCorporateActionOption120(CorporateActionOption120 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For differentiation between options, the OptionNumber must be used
	 * (preferred rather than the OptionType, for example, in the case where two
	 * or more offers can be described by the same corporate action option
	 * code). Therefore, the OptionNumber value must be different for each
	 * option.
	 */
	public static void checkCorporateActionOption123(CorporateActionOption123 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For differentiation between options, the OptionNumber must be used
	 * (preferred rather than the OptionType for example in the case where two
	 * or more offers can be described by the same corporate action option
	 * code). Therefore, the OptionNumber value must be different for each
	 * option.
	 */
	public static void checkCorporateActionOption128(CorporateActionOption128 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For differentiation between options, the OptionNumber must be used
	 * (preferred rather than the OptionType, for example, in the case where two
	 * or more offers can be described by the same corporate action option
	 * code). Therefore, the OptionNumber value must be different for each
	 * option.
	 */
	public static void checkCorporateActionOption131(CorporateActionOption131 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For differentiation between options, the OptionNumber must be used
	 * (preferred rather than the OptionType, for example, in the case where two
	 * or more offers can be described by the same corporate action option
	 * code). Therefore, the OptionNumber value must be different for each
	 * option.
	 */
	public static void checkCorporateActionOption134(CorporateActionOption134 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For differentiation between options, the OptionNumber rather than the
	 * OptionType must be used, for example, in the case where two or more
	 * offers can be described by the same corporate action option code.
	 * Therefore, the OptionNumber value must be different for each option.
	 */
	public static void checkCorporateActionOption142(CorporateActionOption142 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For differentiation between options, the OptionNumber rather than the
	 * OptionType must be used, for example, in the case where two or more
	 * offers can be described by the same corporate action option code.
	 * Therefore, the OptionNumber value must be different for each option.
	 */
	public static void checkCorporateActionOption146(CorporateActionOption146 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}