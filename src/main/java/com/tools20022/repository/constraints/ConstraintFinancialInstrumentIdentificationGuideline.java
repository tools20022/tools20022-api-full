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
 * It is recommended that ISIN be used in Identification.
 */
public class ConstraintFinancialInstrumentIdentificationGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument16
	 * FinancialInstrument16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "It is recommended that ISIN be used in Identification."</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument16> forFinancialInstrument16 = new MMConstraint<FinancialInstrument16>() {
		{
			validator = ConstraintFinancialInstrumentIdentificationGuideline::checkFinancialInstrument16;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Identification.";
			owner_lazy = () -> FinancialInstrument16.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument20
	 * FinancialInstrument20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "It is recommended that ISIN be used in Identification."</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument20> forFinancialInstrument20 = new MMConstraint<FinancialInstrument20>() {
		{
			validator = ConstraintFinancialInstrumentIdentificationGuideline::checkFinancialInstrument20;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Identification.";
			owner_lazy = () -> FinancialInstrument20.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument17
	 * FinancialInstrument17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that ISIN be used in Identification\\SecurityIdentification3Choice"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument17> forFinancialInstrument17 = new MMConstraint<FinancialInstrument17>() {
		{
			validator = ConstraintFinancialInstrumentIdentificationGuideline::checkFinancialInstrument17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Identification\\SecurityIdentification3Choice";
			owner_lazy = () -> FinancialInstrument17.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument6
	 * FinancialInstrument6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that ISIN be used in Identification\\SecurityIdentification1Choice"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument6> forFinancialInstrument6 = new MMConstraint<FinancialInstrument6>() {
		{
			validator = ConstraintFinancialInstrumentIdentificationGuideline::checkFinancialInstrument6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Identification\\SecurityIdentification1Choice";
			owner_lazy = () -> FinancialInstrument6.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument10
	 * FinancialInstrument10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that ISIN be used in Identification\\SecurityIdentification3Choice"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline#forFinancialInstrument45
	 * ConstraintFinancialInstrumentIdentificationGuideline.
	 * forFinancialInstrument45}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIdentificationGuideline#forFinancialInstrument57
	 * ConstraintIdentificationGuideline.forFinancialInstrument57}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument10> forFinancialInstrument10 = new MMConstraint<FinancialInstrument10>() {
		{
			validator = ConstraintFinancialInstrumentIdentificationGuideline::checkFinancialInstrument10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Identification\\SecurityIdentification3Choice";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument45,
					com.tools20022.repository.constraints.ConstraintIdentificationGuideline.forFinancialInstrument57);
			owner_lazy = () -> FinancialInstrument10.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument29
	 * FinancialInstrument29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that ISIN be used in Identification\\SecurityIdentification3Choice"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline#forFinancialInstrument51
	 * ConstraintFinancialInstrumentIdentificationGuideline.
	 * forFinancialInstrument51}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument29> forFinancialInstrument29 = new MMConstraint<FinancialInstrument29>() {
		{
			validator = ConstraintFinancialInstrumentIdentificationGuideline::checkFinancialInstrument29;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Identification\\SecurityIdentification3Choice";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument51);
			owner_lazy = () -> FinancialInstrument29.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument7
	 * FinancialInstrument7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that ISIN be used in Identification\\SecurityIdentification2Choice."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument7> forFinancialInstrument7 = new MMConstraint<FinancialInstrument7>() {
		{
			validator = ConstraintFinancialInstrumentIdentificationGuideline::checkFinancialInstrument7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Identification\\SecurityIdentification2Choice.";
			owner_lazy = () -> FinancialInstrument7.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument12
	 * FinancialInstrument12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that ISIN be used in Assets\\SecurityIdentification3Choice."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument12> forFinancialInstrument12 = new MMConstraint<FinancialInstrument12>() {
		{
			validator = ConstraintFinancialInstrumentIdentificationGuideline::checkFinancialInstrument12;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Assets\\SecurityIdentification3Choice.";
			owner_lazy = () -> FinancialInstrument12.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument26
	 * FinancialInstrument26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that ISIN be used in Assets\\SecurityIdentification3Choice."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument26> forFinancialInstrument26 = new MMConstraint<FinancialInstrument26>() {
		{
			validator = ConstraintFinancialInstrumentIdentificationGuideline::checkFinancialInstrument26;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Assets\\SecurityIdentification3Choice.";
			owner_lazy = () -> FinancialInstrument26.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument30
	 * FinancialInstrument30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that ISIN be used in Assets\\SecurityIdentification3Choice."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline#forFinancialInstrument37
	 * ConstraintFinancialInstrumentIdentificationGuideline.
	 * forFinancialInstrument37}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument30> forFinancialInstrument30 = new MMConstraint<FinancialInstrument30>() {
		{
			validator = ConstraintFinancialInstrumentIdentificationGuideline::checkFinancialInstrument30;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Assets\\SecurityIdentification3Choice.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument37);
			owner_lazy = () -> FinancialInstrument30.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument11
	 * FinancialInstrument11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that ISIN be used in Assets\\SecurityIdentification3Choice."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument11> forFinancialInstrument11 = new MMConstraint<FinancialInstrument11>() {
		{
			validator = ConstraintFinancialInstrumentIdentificationGuideline::checkFinancialInstrument11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Assets\\SecurityIdentification3Choice.";
			owner_lazy = () -> FinancialInstrument11.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument25
	 * FinancialInstrument25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that ISIN be used in Assets\\SecurityIdentification3Choice."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument25> forFinancialInstrument25 = new MMConstraint<FinancialInstrument25>() {
		{
			validator = ConstraintFinancialInstrumentIdentificationGuideline::checkFinancialInstrument25;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Assets\\SecurityIdentification3Choice.";
			owner_lazy = () -> FinancialInstrument25.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument27
	 * FinancialInstrument27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that ISIN be used in Assets\\SecurityIdentification3Choice."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline#forFinancialInstrument36
	 * ConstraintFinancialInstrumentIdentificationGuideline.
	 * forFinancialInstrument36}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument27> forFinancialInstrument27 = new MMConstraint<FinancialInstrument27>() {
		{
			validator = ConstraintFinancialInstrumentIdentificationGuideline::checkFinancialInstrument27;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Assets\\SecurityIdentification3Choice.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument36);
			owner_lazy = () -> FinancialInstrument27.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument32
	 * FinancialInstrument32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that ISIN be used in Assets\\SecurityIdentification3Choice."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument32> forFinancialInstrument32 = new MMConstraint<FinancialInstrument32>() {
		{
			validator = ConstraintFinancialInstrumentIdentificationGuideline::checkFinancialInstrument32;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Assets\\SecurityIdentification3Choice.";
			owner_lazy = () -> FinancialInstrument32.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument24
	 * FinancialInstrument24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that ISIN be used in Assets\\SecurityIdentification3Choice."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument24> forFinancialInstrument24 = new MMConstraint<FinancialInstrument24>() {
		{
			validator = ConstraintFinancialInstrumentIdentificationGuideline::checkFinancialInstrument24;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Assets\\SecurityIdentification3Choice.";
			owner_lazy = () -> FinancialInstrument24.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument33
	 * FinancialInstrument33}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that ISIN be used in Assets\\SecurityIdentification3Choice."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline#forFinancialInstrument35
	 * ConstraintFinancialInstrumentIdentificationGuideline.
	 * forFinancialInstrument35}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument33> forFinancialInstrument33 = new MMConstraint<FinancialInstrument33>() {
		{
			validator = ConstraintFinancialInstrumentIdentificationGuideline::checkFinancialInstrument33;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Assets\\SecurityIdentification3Choice.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument35);
			owner_lazy = () -> FinancialInstrument33.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument23
	 * FinancialInstrument23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that ISIN be used in Assets\\SecurityIdentification3Choice."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument23> forFinancialInstrument23 = new MMConstraint<FinancialInstrument23>() {
		{
			validator = ConstraintFinancialInstrumentIdentificationGuideline::checkFinancialInstrument23;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Assets\\SecurityIdentification3Choice.";
			owner_lazy = () -> FinancialInstrument23.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument31
	 * FinancialInstrument31}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that ISIN be used in Assets\\SecurityIdentification3Choice."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline#forFinancialInstrument34
	 * ConstraintFinancialInstrumentIdentificationGuideline.
	 * forFinancialInstrument34}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument31> forFinancialInstrument31 = new MMConstraint<FinancialInstrument31>() {
		{
			validator = ConstraintFinancialInstrumentIdentificationGuideline::checkFinancialInstrument31;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Assets\\SecurityIdentification3Choice.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument34);
			owner_lazy = () -> FinancialInstrument31.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument3
	 * FinancialInstrument3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that ISIN be used in Identification\\SecurityIdentification1Choice"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument3> forFinancialInstrument3 = new MMConstraint<FinancialInstrument3>() {
		{
			validator = ConstraintFinancialInstrumentIdentificationGuideline::checkFinancialInstrument3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Identification\\SecurityIdentification1Choice";
			owner_lazy = () -> FinancialInstrument3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument5
	 * FinancialInstrument5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that ISIN be used in Identification\\SecurityIdentification1Choice"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument5> forFinancialInstrument5 = new MMConstraint<FinancialInstrument5>() {
		{
			validator = ConstraintFinancialInstrumentIdentificationGuideline::checkFinancialInstrument5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Identification\\SecurityIdentification1Choice";
			owner_lazy = () -> FinancialInstrument5.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument8
	 * FinancialInstrument8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that ISIN be used in Identification\\SecurityIdentification3Choice"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument8> forFinancialInstrument8 = new MMConstraint<FinancialInstrument8>() {
		{
			validator = ConstraintFinancialInstrumentIdentificationGuideline::checkFinancialInstrument8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Identification\\SecurityIdentification3Choice";
			owner_lazy = () -> FinancialInstrument8.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument13
	 * FinancialInstrument13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that ISIN be used in Identification\\SecurityIdentification3Choice"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument13> forFinancialInstrument13 = new MMConstraint<FinancialInstrument13>() {
		{
			validator = ConstraintFinancialInstrumentIdentificationGuideline::checkFinancialInstrument13;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Identification\\SecurityIdentification3Choice";
			owner_lazy = () -> FinancialInstrument13.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument9
	 * FinancialInstrument9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that ISIN be used in Identification\\SecurityIdentification3Choice"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument9> forFinancialInstrument9 = new MMConstraint<FinancialInstrument9>() {
		{
			validator = ConstraintFinancialInstrumentIdentificationGuideline::checkFinancialInstrument9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Identification\\SecurityIdentification3Choice";
			owner_lazy = () -> FinancialInstrument9.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument14
	 * FinancialInstrument14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that ISIN be used in Identification or in UnderlyingInstrumentIdentification.\nIf Identification/ISIN is not present, then Identification/InstrumentDescription/ClassificationType  or InstrumentDescription/ClassificationType should be present.\nIf UnderlyingInstrumentIdentification is present but UnderlyingInstrumentIdentification/ISIN is not present, then UnderlyingInstrumentIdentification/InstrumentDescription/ClassificationType  or InstrumentDescription/ClassificationType should be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument14> forFinancialInstrument14 = new MMConstraint<FinancialInstrument14>() {
		{
			validator = ConstraintFinancialInstrumentIdentificationGuideline::checkFinancialInstrument14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Identification or in UnderlyingInstrumentIdentification.\nIf Identification/ISIN is not present, then Identification/InstrumentDescription/ClassificationType  or InstrumentDescription/ClassificationType should be present.\nIf UnderlyingInstrumentIdentification is present but UnderlyingInstrumentIdentification/ISIN is not present, then UnderlyingInstrumentIdentification/InstrumentDescription/ClassificationType  or InstrumentDescription/ClassificationType should be present.";
			owner_lazy = () -> FinancialInstrument14.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument15
	 * FinancialInstrument15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that ISIN be used in Identification or in UnderlyingInstrumentIdentification.\nIf Identification/ISIN is not present, then Identification/InstrumentDescription/ClassificationType  or InstrumentDescription/ClassificationType should be present.\nIf UnderlyingInstrumentIdentification is present but UnderlyingInstrumentIdentification/ISIN is not present, then UnderlyingInstrumentIdentification/InstrumentDescription/ClassificationType  or InstrumentDescription/ClassificationType should be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument15> forFinancialInstrument15 = new MMConstraint<FinancialInstrument15>() {
		{
			validator = ConstraintFinancialInstrumentIdentificationGuideline::checkFinancialInstrument15;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Identification or in UnderlyingInstrumentIdentification.\nIf Identification/ISIN is not present, then Identification/InstrumentDescription/ClassificationType  or InstrumentDescription/ClassificationType should be present.\nIf UnderlyingInstrumentIdentification is present but UnderlyingInstrumentIdentification/ISIN is not present, then UnderlyingInstrumentIdentification/InstrumentDescription/ClassificationType  or InstrumentDescription/ClassificationType should be present.";
			owner_lazy = () -> FinancialInstrument15.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument18
	 * FinancialInstrument18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that ISIN be used in Identification\\SecurityID."</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument18> forFinancialInstrument18 = new MMConstraint<FinancialInstrument18>() {
		{
			validator = ConstraintFinancialInstrumentIdentificationGuideline::checkFinancialInstrument18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Identification\\SecurityID.";
			owner_lazy = () -> FinancialInstrument18.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument19
	 * FinancialInstrument19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that ISIN be used in Identification\\SecurityIdentification3Choice"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument19> forFinancialInstrument19 = new MMConstraint<FinancialInstrument19>() {
		{
			validator = ConstraintFinancialInstrumentIdentificationGuideline::checkFinancialInstrument19;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Identification\\SecurityIdentification3Choice";
			owner_lazy = () -> FinancialInstrument19.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument37
	 * FinancialInstrument37}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that ISIN be used in Assets\\SecurityIdentification3Choice."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline#forFinancialInstrument47
	 * ConstraintFinancialInstrumentIdentificationGuideline.
	 * forFinancialInstrument47}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline#forFinancialInstrument30
	 * ConstraintFinancialInstrumentIdentificationGuideline.
	 * forFinancialInstrument30}</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument37> forFinancialInstrument37 = new MMConstraint<FinancialInstrument37>() {
		{
			validator = ConstraintFinancialInstrumentIdentificationGuideline::checkFinancialInstrument37;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Assets\\SecurityIdentification3Choice.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument47);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument30;
			owner_lazy = () -> FinancialInstrument37.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument35
	 * FinancialInstrument35}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that ISIN be used in Assets\\SecurityIdentification3Choice."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline#forFinancialInstrument40
	 * ConstraintFinancialInstrumentIdentificationGuideline.
	 * forFinancialInstrument40}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline#forFinancialInstrument33
	 * ConstraintFinancialInstrumentIdentificationGuideline.
	 * forFinancialInstrument33}</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument35> forFinancialInstrument35 = new MMConstraint<FinancialInstrument35>() {
		{
			validator = ConstraintFinancialInstrumentIdentificationGuideline::checkFinancialInstrument35;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Assets\\SecurityIdentification3Choice.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument40);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument33;
			owner_lazy = () -> FinancialInstrument35.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument34
	 * FinancialInstrument34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that ISIN be used in Assets\\SecurityIdentification3Choice."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline#forFinancialInstrument39
	 * ConstraintFinancialInstrumentIdentificationGuideline.
	 * forFinancialInstrument39}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline#forFinancialInstrument31
	 * ConstraintFinancialInstrumentIdentificationGuideline.
	 * forFinancialInstrument31}</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument34> forFinancialInstrument34 = new MMConstraint<FinancialInstrument34>() {
		{
			validator = ConstraintFinancialInstrumentIdentificationGuideline::checkFinancialInstrument34;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Assets\\SecurityIdentification3Choice.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument39);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument31;
			owner_lazy = () -> FinancialInstrument34.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument36
	 * FinancialInstrument36}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that ISIN be used in Assets\\SecurityIdentification3Choice."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline#forFinancialInstrument50
	 * ConstraintFinancialInstrumentIdentificationGuideline.
	 * forFinancialInstrument50}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline#forFinancialInstrument27
	 * ConstraintFinancialInstrumentIdentificationGuideline.
	 * forFinancialInstrument27}</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument36> forFinancialInstrument36 = new MMConstraint<FinancialInstrument36>() {
		{
			validator = ConstraintFinancialInstrumentIdentificationGuideline::checkFinancialInstrument36;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Assets\\SecurityIdentification3Choice.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument50);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument27;
			owner_lazy = () -> FinancialInstrument36.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument40
	 * FinancialInstrument40}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that ISIN be used in Assets\\SecurityIdentification3Choice."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline#forFinancialInstrument48
	 * ConstraintFinancialInstrumentIdentificationGuideline.
	 * forFinancialInstrument48}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline#forFinancialInstrument35
	 * ConstraintFinancialInstrumentIdentificationGuideline.
	 * forFinancialInstrument35}</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument40> forFinancialInstrument40 = new MMConstraint<FinancialInstrument40>() {
		{
			validator = ConstraintFinancialInstrumentIdentificationGuideline::checkFinancialInstrument40;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Assets\\SecurityIdentification3Choice.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument48);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument35;
			owner_lazy = () -> FinancialInstrument40.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument39
	 * FinancialInstrument39}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that ISIN be used in Assets\\SecurityIdentification3Choice."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline#forFinancialInstrument46
	 * ConstraintFinancialInstrumentIdentificationGuideline.
	 * forFinancialInstrument46}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline#forFinancialInstrument34
	 * ConstraintFinancialInstrumentIdentificationGuideline.
	 * forFinancialInstrument34}</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument39> forFinancialInstrument39 = new MMConstraint<FinancialInstrument39>() {
		{
			validator = ConstraintFinancialInstrumentIdentificationGuideline::checkFinancialInstrument39;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Assets\\SecurityIdentification3Choice.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument46);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument34;
			owner_lazy = () -> FinancialInstrument39.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument51
	 * FinancialInstrument51}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "It is recommended that ISIN be used in Identification."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIdentificationGuideline#forFinancialInstrument56
	 * ConstraintIdentificationGuideline.forFinancialInstrument56}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline#forFinancialInstrument29
	 * ConstraintFinancialInstrumentIdentificationGuideline.
	 * forFinancialInstrument29}</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument51> forFinancialInstrument51 = new MMConstraint<FinancialInstrument51>() {
		{
			validator = ConstraintFinancialInstrumentIdentificationGuideline::checkFinancialInstrument51;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Identification.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIdentificationGuideline.forFinancialInstrument56);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument29;
			owner_lazy = () -> FinancialInstrument51.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument50
	 * FinancialInstrument50}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "It is recommended that ISIN be used in Identification."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline#forFinancialInstrument36
	 * ConstraintFinancialInstrumentIdentificationGuideline.
	 * forFinancialInstrument36}</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument50> forFinancialInstrument50 = new MMConstraint<FinancialInstrument50>() {
		{
			validator = ConstraintFinancialInstrumentIdentificationGuideline::checkFinancialInstrument50;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Identification.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument36;
			owner_lazy = () -> FinancialInstrument50.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument45
	 * FinancialInstrument45}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "It is recommended that ISIN be used in Identification."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline#forFinancialInstrument49
	 * ConstraintFinancialInstrumentIdentificationGuideline.
	 * forFinancialInstrument49}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIdentificationGuideline#forFinancialInstrument55
	 * ConstraintIdentificationGuideline.forFinancialInstrument55}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline#forFinancialInstrument10
	 * ConstraintFinancialInstrumentIdentificationGuideline.
	 * forFinancialInstrument10}</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument45> forFinancialInstrument45 = new MMConstraint<FinancialInstrument45>() {
		{
			validator = ConstraintFinancialInstrumentIdentificationGuideline::checkFinancialInstrument45;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Identification.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument49,
					com.tools20022.repository.constraints.ConstraintIdentificationGuideline.forFinancialInstrument55);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument10;
			owner_lazy = () -> FinancialInstrument45.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument49
	 * FinancialInstrument49}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "It is recommended that ISIN be used in Identification."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline#forFinancialInstrument45
	 * ConstraintFinancialInstrumentIdentificationGuideline.
	 * forFinancialInstrument45}</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument49> forFinancialInstrument49 = new MMConstraint<FinancialInstrument49>() {
		{
			validator = ConstraintFinancialInstrumentIdentificationGuideline::checkFinancialInstrument49;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Identification.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument45;
			owner_lazy = () -> FinancialInstrument49.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument48
	 * FinancialInstrument48}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "It is recommended that ISIN be used in Identification."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline#forFinancialInstrument40
	 * ConstraintFinancialInstrumentIdentificationGuideline.
	 * forFinancialInstrument40}</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument48> forFinancialInstrument48 = new MMConstraint<FinancialInstrument48>() {
		{
			validator = ConstraintFinancialInstrumentIdentificationGuideline::checkFinancialInstrument48;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Identification.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument40;
			owner_lazy = () -> FinancialInstrument48.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument47
	 * FinancialInstrument47}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "It is recommended that ISIN be used in Identification."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline#forFinancialInstrument37
	 * ConstraintFinancialInstrumentIdentificationGuideline.
	 * forFinancialInstrument37}</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument47> forFinancialInstrument47 = new MMConstraint<FinancialInstrument47>() {
		{
			validator = ConstraintFinancialInstrumentIdentificationGuideline::checkFinancialInstrument47;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Identification.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument37;
			owner_lazy = () -> FinancialInstrument47.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument46
	 * FinancialInstrument46}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "It is recommended that ISIN be used in Identification."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline#forFinancialInstrument39
	 * ConstraintFinancialInstrumentIdentificationGuideline.
	 * forFinancialInstrument39}</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument46> forFinancialInstrument46 = new MMConstraint<FinancialInstrument46>() {
		{
			validator = ConstraintFinancialInstrumentIdentificationGuideline::checkFinancialInstrument46;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Identification.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument39;
			owner_lazy = () -> FinancialInstrument46.mmObject();
		}
	};

	/**
	 * It is recommended that ISIN be used in Identification.
	 */
	public static void checkFinancialInstrument16(FinancialInstrument16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that ISIN be used in Identification.
	 */
	public static void checkFinancialInstrument20(FinancialInstrument20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that ISIN be used in
	 * Identification\SecurityIdentification3Choice
	 */
	public static void checkFinancialInstrument17(FinancialInstrument17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that ISIN be used in
	 * Identification\SecurityIdentification1Choice
	 */
	public static void checkFinancialInstrument6(FinancialInstrument6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that ISIN be used in
	 * Identification\SecurityIdentification3Choice
	 */
	public static void checkFinancialInstrument10(FinancialInstrument10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that ISIN be used in
	 * Identification\SecurityIdentification3Choice
	 */
	public static void checkFinancialInstrument29(FinancialInstrument29 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that ISIN be used in
	 * Identification\SecurityIdentification2Choice.
	 */
	public static void checkFinancialInstrument7(FinancialInstrument7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that ISIN be used in
	 * Assets\SecurityIdentification3Choice.
	 */
	public static void checkFinancialInstrument12(FinancialInstrument12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that ISIN be used in
	 * Assets\SecurityIdentification3Choice.
	 */
	public static void checkFinancialInstrument26(FinancialInstrument26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that ISIN be used in
	 * Assets\SecurityIdentification3Choice.
	 */
	public static void checkFinancialInstrument30(FinancialInstrument30 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that ISIN be used in
	 * Assets\SecurityIdentification3Choice.
	 */
	public static void checkFinancialInstrument11(FinancialInstrument11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that ISIN be used in
	 * Assets\SecurityIdentification3Choice.
	 */
	public static void checkFinancialInstrument25(FinancialInstrument25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that ISIN be used in
	 * Assets\SecurityIdentification3Choice.
	 */
	public static void checkFinancialInstrument27(FinancialInstrument27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that ISIN be used in
	 * Assets\SecurityIdentification3Choice.
	 */
	public static void checkFinancialInstrument32(FinancialInstrument32 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that ISIN be used in
	 * Assets\SecurityIdentification3Choice.
	 */
	public static void checkFinancialInstrument24(FinancialInstrument24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that ISIN be used in
	 * Assets\SecurityIdentification3Choice.
	 */
	public static void checkFinancialInstrument33(FinancialInstrument33 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that ISIN be used in
	 * Assets\SecurityIdentification3Choice.
	 */
	public static void checkFinancialInstrument23(FinancialInstrument23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that ISIN be used in
	 * Assets\SecurityIdentification3Choice.
	 */
	public static void checkFinancialInstrument31(FinancialInstrument31 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that ISIN be used in
	 * Identification\SecurityIdentification1Choice
	 */
	public static void checkFinancialInstrument3(FinancialInstrument3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that ISIN be used in
	 * Identification\SecurityIdentification1Choice
	 */
	public static void checkFinancialInstrument5(FinancialInstrument5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that ISIN be used in
	 * Identification\SecurityIdentification3Choice
	 */
	public static void checkFinancialInstrument8(FinancialInstrument8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that ISIN be used in
	 * Identification\SecurityIdentification3Choice
	 */
	public static void checkFinancialInstrument13(FinancialInstrument13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that ISIN be used in
	 * Identification\SecurityIdentification3Choice
	 */
	public static void checkFinancialInstrument9(FinancialInstrument9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that ISIN be used in Identification or in
	 * UnderlyingInstrumentIdentification. If Identification/ISIN is not
	 * present, then Identification/InstrumentDescription/ClassificationType or
	 * InstrumentDescription/ClassificationType should be present. If
	 * UnderlyingInstrumentIdentification is present but
	 * UnderlyingInstrumentIdentification/ISIN is not present, then
	 * UnderlyingInstrumentIdentification
	 * /InstrumentDescription/ClassificationType or
	 * InstrumentDescription/ClassificationType should be present.
	 */
	public static void checkFinancialInstrument14(FinancialInstrument14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that ISIN be used in Identification or in
	 * UnderlyingInstrumentIdentification. If Identification/ISIN is not
	 * present, then Identification/InstrumentDescription/ClassificationType or
	 * InstrumentDescription/ClassificationType should be present. If
	 * UnderlyingInstrumentIdentification is present but
	 * UnderlyingInstrumentIdentification/ISIN is not present, then
	 * UnderlyingInstrumentIdentification
	 * /InstrumentDescription/ClassificationType or
	 * InstrumentDescription/ClassificationType should be present.
	 */
	public static void checkFinancialInstrument15(FinancialInstrument15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that ISIN be used in Identification\SecurityID.
	 */
	public static void checkFinancialInstrument18(FinancialInstrument18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that ISIN be used in
	 * Identification\SecurityIdentification3Choice
	 */
	public static void checkFinancialInstrument19(FinancialInstrument19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that ISIN be used in
	 * Assets\SecurityIdentification3Choice.
	 */
	public static void checkFinancialInstrument37(FinancialInstrument37 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that ISIN be used in
	 * Assets\SecurityIdentification3Choice.
	 */
	public static void checkFinancialInstrument35(FinancialInstrument35 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that ISIN be used in
	 * Assets\SecurityIdentification3Choice.
	 */
	public static void checkFinancialInstrument34(FinancialInstrument34 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that ISIN be used in
	 * Assets\SecurityIdentification3Choice.
	 */
	public static void checkFinancialInstrument36(FinancialInstrument36 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that ISIN be used in
	 * Assets\SecurityIdentification3Choice.
	 */
	public static void checkFinancialInstrument40(FinancialInstrument40 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that ISIN be used in
	 * Assets\SecurityIdentification3Choice.
	 */
	public static void checkFinancialInstrument39(FinancialInstrument39 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that ISIN be used in Identification.
	 */
	public static void checkFinancialInstrument51(FinancialInstrument51 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that ISIN be used in Identification.
	 */
	public static void checkFinancialInstrument50(FinancialInstrument50 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that ISIN be used in Identification.
	 */
	public static void checkFinancialInstrument45(FinancialInstrument45 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that ISIN be used in Identification.
	 */
	public static void checkFinancialInstrument49(FinancialInstrument49 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that ISIN be used in Identification.
	 */
	public static void checkFinancialInstrument48(FinancialInstrument48 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that ISIN be used in Identification.
	 */
	public static void checkFinancialInstrument47(FinancialInstrument47 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that ISIN be used in Identification.
	 */
	public static void checkFinancialInstrument46(FinancialInstrument46 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}