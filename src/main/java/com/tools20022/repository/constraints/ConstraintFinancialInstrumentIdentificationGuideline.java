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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Identification.";
			owner_lazy = () -> FinancialInstrument16.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrument16 obj) throws Exception {
			checkFinancialInstrument16(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Identification.";
			owner_lazy = () -> FinancialInstrument20.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrument20 obj) throws Exception {
			checkFinancialInstrument20(obj);
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
	 * "It is recommended that ISIN be used in Identification\\SecurityIdentification3Choice."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument17> forFinancialInstrument17 = new MMConstraint<FinancialInstrument17>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Identification\\SecurityIdentification3Choice.";
			owner_lazy = () -> FinancialInstrument17.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrument17 obj) throws Exception {
			checkFinancialInstrument17(obj);
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
	 * "It is recommended that ISIN be used in Identification\\SecurityIdentification1Choice."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument6> forFinancialInstrument6 = new MMConstraint<FinancialInstrument6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Identification\\SecurityIdentification1Choice.";
			owner_lazy = () -> FinancialInstrument6.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrument6 obj) throws Exception {
			checkFinancialInstrument6(obj);
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
	 * "It is recommended that ISIN be used in Identification\\SecurityIdentification3Choice."
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Identification\\SecurityIdentification3Choice.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument45,
					com.tools20022.repository.constraints.ConstraintIdentificationGuideline.forFinancialInstrument57);
			owner_lazy = () -> FinancialInstrument10.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrument10 obj) throws Exception {
			checkFinancialInstrument10(obj);
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
	 * "It is recommended that ISIN be used in Identification\\SecurityIdentification3Choice."
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Identification\\SecurityIdentification3Choice.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument51);
			owner_lazy = () -> FinancialInstrument29.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrument29 obj) throws Exception {
			checkFinancialInstrument29(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Identification\\SecurityIdentification2Choice.";
			owner_lazy = () -> FinancialInstrument7.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrument7 obj) throws Exception {
			checkFinancialInstrument7(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Assets\\SecurityIdentification3Choice.";
			owner_lazy = () -> FinancialInstrument12.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrument12 obj) throws Exception {
			checkFinancialInstrument12(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Assets\\SecurityIdentification3Choice.";
			owner_lazy = () -> FinancialInstrument26.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrument26 obj) throws Exception {
			checkFinancialInstrument26(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Assets\\SecurityIdentification3Choice.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument37);
			owner_lazy = () -> FinancialInstrument30.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrument30 obj) throws Exception {
			checkFinancialInstrument30(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Assets\\SecurityIdentification3Choice.";
			owner_lazy = () -> FinancialInstrument11.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrument11 obj) throws Exception {
			checkFinancialInstrument11(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Assets\\SecurityIdentification3Choice.";
			owner_lazy = () -> FinancialInstrument25.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrument25 obj) throws Exception {
			checkFinancialInstrument25(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Assets\\SecurityIdentification3Choice.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument36);
			owner_lazy = () -> FinancialInstrument27.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrument27 obj) throws Exception {
			checkFinancialInstrument27(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Assets\\SecurityIdentification3Choice.";
			owner_lazy = () -> FinancialInstrument32.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrument32 obj) throws Exception {
			checkFinancialInstrument32(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Assets\\SecurityIdentification3Choice.";
			owner_lazy = () -> FinancialInstrument24.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrument24 obj) throws Exception {
			checkFinancialInstrument24(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Assets\\SecurityIdentification3Choice.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument35);
			owner_lazy = () -> FinancialInstrument33.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrument33 obj) throws Exception {
			checkFinancialInstrument33(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Assets\\SecurityIdentification3Choice.";
			owner_lazy = () -> FinancialInstrument23.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrument23 obj) throws Exception {
			checkFinancialInstrument23(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Assets\\SecurityIdentification3Choice.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument34);
			owner_lazy = () -> FinancialInstrument31.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrument31 obj) throws Exception {
			checkFinancialInstrument31(obj);
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
	 * "It is recommended that ISIN be used in Identification\\SecurityIdentification1Choice."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument3> forFinancialInstrument3 = new MMConstraint<FinancialInstrument3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Identification\\SecurityIdentification1Choice.";
			owner_lazy = () -> FinancialInstrument3.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrument3 obj) throws Exception {
			checkFinancialInstrument3(obj);
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
	 * "It is recommended that ISIN be used in Identification\\SecurityIdentification1Choice."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument5> forFinancialInstrument5 = new MMConstraint<FinancialInstrument5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Identification\\SecurityIdentification1Choice.";
			owner_lazy = () -> FinancialInstrument5.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrument5 obj) throws Exception {
			checkFinancialInstrument5(obj);
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
	 * "It is recommended that ISIN be used in Identification\\SecurityIdentification3Choice."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument8> forFinancialInstrument8 = new MMConstraint<FinancialInstrument8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Identification\\SecurityIdentification3Choice.";
			owner_lazy = () -> FinancialInstrument8.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrument8 obj) throws Exception {
			checkFinancialInstrument8(obj);
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
	 * "It is recommended that ISIN be used in Identification\\SecurityIdentification3Choice."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument13> forFinancialInstrument13 = new MMConstraint<FinancialInstrument13>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Identification\\SecurityIdentification3Choice.";
			owner_lazy = () -> FinancialInstrument13.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrument13 obj) throws Exception {
			checkFinancialInstrument13(obj);
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
	 * "It is recommended that ISIN be used in Identification\\SecurityIdentification3Choice."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument9> forFinancialInstrument9 = new MMConstraint<FinancialInstrument9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Identification\\SecurityIdentification3Choice.";
			owner_lazy = () -> FinancialInstrument9.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrument9 obj) throws Exception {
			checkFinancialInstrument9(obj);
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
	 * "It is recommended that ISIN be used in Identification or in UnderlyingInstrumentIdentification.\nIf Identification/ISIN is not present, then Identification/InstrumentDescription/ClassificationType or InstrumentDescription/ClassificationType should be present.\nIf UnderlyingInstrumentIdentification is present but UnderlyingInstrumentIdentification/ISIN is not present, then UnderlyingInstrumentIdentification/InstrumentDescription/ClassificationType or InstrumentDescription/ClassificationType should be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument14> forFinancialInstrument14 = new MMConstraint<FinancialInstrument14>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Identification or in UnderlyingInstrumentIdentification.\nIf Identification/ISIN is not present, then Identification/InstrumentDescription/ClassificationType or InstrumentDescription/ClassificationType should be present.\nIf UnderlyingInstrumentIdentification is present but UnderlyingInstrumentIdentification/ISIN is not present, then UnderlyingInstrumentIdentification/InstrumentDescription/ClassificationType or InstrumentDescription/ClassificationType should be present.";
			owner_lazy = () -> FinancialInstrument14.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrument14 obj) throws Exception {
			checkFinancialInstrument14(obj);
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
	 * "It is recommended that ISIN be used in Identification or in UnderlyingInstrumentIdentification.\nIf Identification/ISIN is not present, then Identification/InstrumentDescription/ClassificationType or InstrumentDescription/ClassificationType should be present.\nIf UnderlyingInstrumentIdentification is present but UnderlyingInstrumentIdentification/ISIN is not present, then UnderlyingInstrumentIdentification/InstrumentDescription/ClassificationType or InstrumentDescription/ClassificationType should be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument15> forFinancialInstrument15 = new MMConstraint<FinancialInstrument15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Identification or in UnderlyingInstrumentIdentification.\nIf Identification/ISIN is not present, then Identification/InstrumentDescription/ClassificationType or InstrumentDescription/ClassificationType should be present.\nIf UnderlyingInstrumentIdentification is present but UnderlyingInstrumentIdentification/ISIN is not present, then UnderlyingInstrumentIdentification/InstrumentDescription/ClassificationType or InstrumentDescription/ClassificationType should be present.";
			owner_lazy = () -> FinancialInstrument15.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrument15 obj) throws Exception {
			checkFinancialInstrument15(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Identification\\SecurityID.";
			owner_lazy = () -> FinancialInstrument18.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrument18 obj) throws Exception {
			checkFinancialInstrument18(obj);
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
	 * "It is recommended that ISIN be used in Identification\\SecurityIdentification3Choice."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument19> forFinancialInstrument19 = new MMConstraint<FinancialInstrument19>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Identification\\SecurityIdentification3Choice.";
			owner_lazy = () -> FinancialInstrument19.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrument19 obj) throws Exception {
			checkFinancialInstrument19(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Assets\\SecurityIdentification3Choice.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument47);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument30;
			owner_lazy = () -> FinancialInstrument37.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrument37 obj) throws Exception {
			checkFinancialInstrument37(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Assets\\SecurityIdentification3Choice.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument40);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument33;
			owner_lazy = () -> FinancialInstrument35.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrument35 obj) throws Exception {
			checkFinancialInstrument35(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Assets\\SecurityIdentification3Choice.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument39);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument31;
			owner_lazy = () -> FinancialInstrument34.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrument34 obj) throws Exception {
			checkFinancialInstrument34(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Assets\\SecurityIdentification3Choice.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument50);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument27;
			owner_lazy = () -> FinancialInstrument36.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrument36 obj) throws Exception {
			checkFinancialInstrument36(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Assets\\SecurityIdentification3Choice.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument48);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument35;
			owner_lazy = () -> FinancialInstrument40.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrument40 obj) throws Exception {
			checkFinancialInstrument40(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Assets\\SecurityIdentification3Choice.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument46);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument34;
			owner_lazy = () -> FinancialInstrument39.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrument39 obj) throws Exception {
			checkFinancialInstrument39(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Identification.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIdentificationGuideline.forFinancialInstrument56);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument29;
			owner_lazy = () -> FinancialInstrument51.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrument51 obj) throws Exception {
			checkFinancialInstrument51(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Identification.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument36;
			owner_lazy = () -> FinancialInstrument50.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrument50 obj) throws Exception {
			checkFinancialInstrument50(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Identification.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument49,
					com.tools20022.repository.constraints.ConstraintIdentificationGuideline.forFinancialInstrument55);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument10;
			owner_lazy = () -> FinancialInstrument45.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrument45 obj) throws Exception {
			checkFinancialInstrument45(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIdentificationGuideline#forFinancialInstrument63
	 * ConstraintIdentificationGuideline.forFinancialInstrument63}</li>
	 * </ul>
	 * </li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Identification.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIdentificationGuideline.forFinancialInstrument63);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument45;
			owner_lazy = () -> FinancialInstrument49.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrument49 obj) throws Exception {
			checkFinancialInstrument49(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIdentificationGuideline#forFinancialInstrument65
	 * ConstraintIdentificationGuideline.forFinancialInstrument65}</li>
	 * </ul>
	 * </li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Identification.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIdentificationGuideline.forFinancialInstrument65);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument40;
			owner_lazy = () -> FinancialInstrument48.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrument48 obj) throws Exception {
			checkFinancialInstrument48(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIdentificationGuideline#forFinancialInstrument61
	 * ConstraintIdentificationGuideline.forFinancialInstrument61}</li>
	 * </ul>
	 * </li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Identification.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIdentificationGuideline.forFinancialInstrument61);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument37;
			owner_lazy = () -> FinancialInstrument47.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrument47 obj) throws Exception {
			checkFinancialInstrument47(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIdentificationGuideline#forFinancialInstrument60
	 * ConstraintIdentificationGuideline.forFinancialInstrument60}</li>
	 * </ul>
	 * </li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Identification.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIdentificationGuideline.forFinancialInstrument60);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument39;
			owner_lazy = () -> FinancialInstrument46.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrument46 obj) throws Exception {
			checkFinancialInstrument46(obj);
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
	 * Identification\SecurityIdentification3Choice.
	 */
	public static void checkFinancialInstrument17(FinancialInstrument17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that ISIN be used in
	 * Identification\SecurityIdentification1Choice.
	 */
	public static void checkFinancialInstrument6(FinancialInstrument6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that ISIN be used in
	 * Identification\SecurityIdentification3Choice.
	 */
	public static void checkFinancialInstrument10(FinancialInstrument10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that ISIN be used in
	 * Identification\SecurityIdentification3Choice.
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
	 * Identification\SecurityIdentification1Choice.
	 */
	public static void checkFinancialInstrument3(FinancialInstrument3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that ISIN be used in
	 * Identification\SecurityIdentification1Choice.
	 */
	public static void checkFinancialInstrument5(FinancialInstrument5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that ISIN be used in
	 * Identification\SecurityIdentification3Choice.
	 */
	public static void checkFinancialInstrument8(FinancialInstrument8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that ISIN be used in
	 * Identification\SecurityIdentification3Choice.
	 */
	public static void checkFinancialInstrument13(FinancialInstrument13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that ISIN be used in
	 * Identification\SecurityIdentification3Choice.
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
	 * Identification\SecurityIdentification3Choice.
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