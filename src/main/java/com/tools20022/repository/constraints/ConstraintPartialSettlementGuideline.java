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
 * Partial settlement information only applies to markets where partial
 * settlement is allowed.<br>
 * The SettledQuantity field provides the quantity of securities effectively
 * settled.<br>
 * The other quantities (PreviouslySettledQuantity and/or
 * RemainingToBeSettledQuantity) may be provided, but this is not mandatory.<br>
 * For more details, see the relevant market practice document on www.smpg.info.
 */
public class ConstraintPartialSettlementGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount51
	 * QuantityAndAccount51}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Partial settlement information only applies to markets where partial settlement is allowed.\r\nThe SettledQuantity field provides the quantity of securities effectively settled.\r\nThe other quantities (PreviouslySettledQuantity and/or RemainingToBeSettledQuantity) may be provided, but this is not mandatory.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPartialSettlementGuideline#forQuantityAndAccount57
	 * ConstraintPartialSettlementGuideline.forQuantityAndAccount57}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount51> forQuantityAndAccount51 = new MMConstraint<QuantityAndAccount51>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialSettlementGuideline";
			definition = "Partial settlement information only applies to markets where partial settlement is allowed.\r\nThe SettledQuantity field provides the quantity of securities effectively settled.\r\nThe other quantities (PreviouslySettledQuantity and/or RemainingToBeSettledQuantity) may be provided, but this is not mandatory.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPartialSettlementGuideline.forQuantityAndAccount57);
			owner_lazy = () -> QuantityAndAccount51.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount51 obj) throws Exception {
			checkQuantityAndAccount51(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount72
	 * QuantityAndAccount72}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Partial settlement information only applies to markets where partial settlement is allowed.\r\nThe SettledQuantity field provides the quantity of securities effectively settled.\r\nThe other quantities (PreviouslySettledQuantity and/or RemainingToBeSettledQuantity) may be provided, but this is not mandatory.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount72> forQuantityAndAccount72 = new MMConstraint<QuantityAndAccount72>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialSettlementGuideline";
			definition = "Partial settlement information only applies to markets where partial settlement is allowed.\r\nThe SettledQuantity field provides the quantity of securities effectively settled.\r\nThe other quantities (PreviouslySettledQuantity and/or RemainingToBeSettledQuantity) may be provided, but this is not mandatory.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> QuantityAndAccount72.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount72 obj) throws Exception {
			checkQuantityAndAccount72(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters18
	 * AdditionalParameters18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Partial settlement information only applies to markets where partial settlement is allowed.\r\nThe PartialSettlement field should be used as follows:\r\n- with code PAIN in the first message(s) (there may be more than one) confirming the partial settlement of an instruction.\r\n- with code PARC in the very last message sent to confirm the settlement of the remaining part.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPartialSettlementGuideline#forAdditionalParameters24
	 * ConstraintPartialSettlementGuideline.forAdditionalParameters24}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalParameters18> forAdditionalParameters18 = new MMConstraint<AdditionalParameters18>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialSettlementGuideline";
			definition = "Partial settlement information only applies to markets where partial settlement is allowed.\r\nThe PartialSettlement field should be used as follows:\r\n- with code PAIN in the first message(s) (there may be more than one) confirming the partial settlement of an instruction.\r\n- with code PARC in the very last message sent to confirm the settlement of the remaining part.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPartialSettlementGuideline.forAdditionalParameters24);
			owner_lazy = () -> AdditionalParameters18.mmObject();
		}

		@Override
		public void executeValidator(AdditionalParameters18 obj) throws Exception {
			checkAdditionalParameters18(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters20
	 * AdditionalParameters20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Partial settlement information only applies to markets where partial settlement is allowed.\r\nThe PartialSettlement field should be used as follows:\r\n- with code PAIN in the first message(s) (there may be more than one) confirming the partial settlement of an instruction.\r\n- with code PARC in the very last message sent to confirm the settlement of the remaining part.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalParameters20> forAdditionalParameters20 = new MMConstraint<AdditionalParameters20>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialSettlementGuideline";
			definition = "Partial settlement information only applies to markets where partial settlement is allowed.\r\nThe PartialSettlement field should be used as follows:\r\n- with code PAIN in the first message(s) (there may be more than one) confirming the partial settlement of an instruction.\r\n- with code PARC in the very last message sent to confirm the settlement of the remaining part.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> AdditionalParameters20.mmObject();
		}

		@Override
		public void executeValidator(AdditionalParameters20 obj) throws Exception {
			checkAdditionalParameters20(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount12
	 * QuantityAndAccount12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Partial settlement information only applies to markets where partial settlement is allowed.\r\nThe SettledQuantity field provides the quantity of securities effectively settled.\r\nThe other quantities (PreviouslySettledQuantity and/or RemainingToBeSettledQuantity) may be provided, but this is not mandatory.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount12> forQuantityAndAccount12 = new MMConstraint<QuantityAndAccount12>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialSettlementGuideline";
			definition = "Partial settlement information only applies to markets where partial settlement is allowed.\r\nThe SettledQuantity field provides the quantity of securities effectively settled.\r\nThe other quantities (PreviouslySettledQuantity and/or RemainingToBeSettledQuantity) may be provided, but this is not mandatory.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> QuantityAndAccount12.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount12 obj) throws Exception {
			checkQuantityAndAccount12(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters29
	 * AdditionalParameters29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Partial settlement information only applies to markets where partial settlement is allowed.\r\nThe PartialSettlement field should be used as follows:\r\n- with code PAIN in the first message(s) (there may be more than one) confirming the partial settlement of an instruction.\r\n- with code PARC in the very last message sent to confirm the settlement of the remaining part.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPartialSettlementGuideline#forAdditionalParameters22
	 * ConstraintPartialSettlementGuideline.forAdditionalParameters22}</li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalParameters29> forAdditionalParameters29 = new MMConstraint<AdditionalParameters29>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialSettlementGuideline";
			definition = "Partial settlement information only applies to markets where partial settlement is allowed.\r\nThe PartialSettlement field should be used as follows:\r\n- with code PAIN in the first message(s) (there may be more than one) confirming the partial settlement of an instruction.\r\n- with code PARC in the very last message sent to confirm the settlement of the remaining part.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPartialSettlementGuideline.forAdditionalParameters22;
			owner_lazy = () -> AdditionalParameters29.mmObject();
		}

		@Override
		public void executeValidator(AdditionalParameters29 obj) throws Exception {
			checkAdditionalParameters29(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters13
	 * AdditionalParameters13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Partial settlement information only applies to markets where partial settlement is allowed.\r\nThe PartialSettlement field should be used as follows:\r\n- with code PAIN in the first message(s) (there may be more than one) confirming the partial settlement of an instruction.\r\n- with code PARC in the very last message sent to confirm the settlement of the remaining part.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalParameters13> forAdditionalParameters13 = new MMConstraint<AdditionalParameters13>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialSettlementGuideline";
			definition = "Partial settlement information only applies to markets where partial settlement is allowed.\r\nThe PartialSettlement field should be used as follows:\r\n- with code PAIN in the first message(s) (there may be more than one) confirming the partial settlement of an instruction.\r\n- with code PARC in the very last message sent to confirm the settlement of the remaining part.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> AdditionalParameters13.mmObject();
		}

		@Override
		public void executeValidator(AdditionalParameters13 obj) throws Exception {
			checkAdditionalParameters13(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters2
	 * AdditionalParameters2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Partial settlement information only applies to markets where partial settlement is allowed.\r\nThe PartialSettlement field should be used as follows:\r\n- with code PAIN in the first message(s) (there may be more than one) confirming the partial settlement of an instruction.\r\n- with code PARC in the very last message sent to confirm the settlement of the remaining part.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalParameters2> forAdditionalParameters2 = new MMConstraint<AdditionalParameters2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialSettlementGuideline";
			definition = "Partial settlement information only applies to markets where partial settlement is allowed.\r\nThe PartialSettlement field should be used as follows:\r\n- with code PAIN in the first message(s) (there may be more than one) confirming the partial settlement of an instruction.\r\n- with code PARC in the very last message sent to confirm the settlement of the remaining part.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> AdditionalParameters2.mmObject();
		}

		@Override
		public void executeValidator(AdditionalParameters2 obj) throws Exception {
			checkAdditionalParameters2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters24
	 * AdditionalParameters24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Partial settlement information only applies to markets where partial settlement is allowed.\r\nThe PartialSettlement field should be used as follows:\r\n- with code PAIN in the first message(s) (there may be more than one) confirming the partial settlement of an instruction.\r\n- with code PARC in the very last message sent to confirm the settlement of the remaining part.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPartialSettlementGuideline#forAdditionalParameters18
	 * ConstraintPartialSettlementGuideline.forAdditionalParameters18}</li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalParameters24> forAdditionalParameters24 = new MMConstraint<AdditionalParameters24>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialSettlementGuideline";
			definition = "Partial settlement information only applies to markets where partial settlement is allowed.\r\nThe PartialSettlement field should be used as follows:\r\n- with code PAIN in the first message(s) (there may be more than one) confirming the partial settlement of an instruction.\r\n- with code PARC in the very last message sent to confirm the settlement of the remaining part.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPartialSettlementGuideline.forAdditionalParameters18;
			owner_lazy = () -> AdditionalParameters24.mmObject();
		}

		@Override
		public void executeValidator(AdditionalParameters24 obj) throws Exception {
			checkAdditionalParameters24(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount28
	 * QuantityAndAccount28}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Partial settlement information only applies to markets where partial settlement is allowed.\r\nThe SettledQuantity field provides the quantity of securities effectively settled.\r\nThe other quantities (PreviouslySettledQuantity and/or RemainingToBeSettledQuantity) may be provided, but this is not mandatory.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPartialSettlementGuideline#forQuantityAndAccount41
	 * ConstraintPartialSettlementGuideline.forQuantityAndAccount41}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount28> forQuantityAndAccount28 = new MMConstraint<QuantityAndAccount28>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialSettlementGuideline";
			definition = "Partial settlement information only applies to markets where partial settlement is allowed.\r\nThe SettledQuantity field provides the quantity of securities effectively settled.\r\nThe other quantities (PreviouslySettledQuantity and/or RemainingToBeSettledQuantity) may be provided, but this is not mandatory.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPartialSettlementGuideline.forQuantityAndAccount41);
			owner_lazy = () -> QuantityAndAccount28.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount28 obj) throws Exception {
			checkQuantityAndAccount28(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters6
	 * AdditionalParameters6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Partial settlement information only applies to markets where partial settlement is allowed.\r\nThe PartialSettlement field should be used as follows:\r\n- with code PAIN in the first message(s) (there may be more than one) confirming the partial settlement of an instruction.\r\n- with code PARC in the very last message sent to confirm the settlement of the remaining part.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalParameters6> forAdditionalParameters6 = new MMConstraint<AdditionalParameters6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialSettlementGuideline";
			definition = "Partial settlement information only applies to markets where partial settlement is allowed.\r\nThe PartialSettlement field should be used as follows:\r\n- with code PAIN in the first message(s) (there may be more than one) confirming the partial settlement of an instruction.\r\n- with code PARC in the very last message sent to confirm the settlement of the remaining part.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> AdditionalParameters6.mmObject();
		}

		@Override
		public void executeValidator(AdditionalParameters6 obj) throws Exception {
			checkAdditionalParameters6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters22
	 * AdditionalParameters22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Partial settlement information only applies to markets where partial settlement is allowed.\r\nThe PartialSettlement field should be used as follows:\r\n- with code PAIN in the first message(s) (there may be more than one) confirming the partial settlement of an instruction.\r\n- with code PARC in the very last message sent to confirm the settlement of the remaining part.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPartialSettlementGuideline#forAdditionalParameters29
	 * ConstraintPartialSettlementGuideline.forAdditionalParameters29}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPartialSettlementGuideline#forAdditionalParameters17
	 * ConstraintPartialSettlementGuideline.forAdditionalParameters17}</li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalParameters22> forAdditionalParameters22 = new MMConstraint<AdditionalParameters22>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialSettlementGuideline";
			definition = "Partial settlement information only applies to markets where partial settlement is allowed.\r\nThe PartialSettlement field should be used as follows:\r\n- with code PAIN in the first message(s) (there may be more than one) confirming the partial settlement of an instruction.\r\n- with code PARC in the very last message sent to confirm the settlement of the remaining part.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPartialSettlementGuideline.forAdditionalParameters29);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPartialSettlementGuideline.forAdditionalParameters17;
			owner_lazy = () -> AdditionalParameters22.mmObject();
		}

		@Override
		public void executeValidator(AdditionalParameters22 obj) throws Exception {
			checkAdditionalParameters22(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters26
	 * AdditionalParameters26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Partial settlement information only applies to markets where partial settlement is allowed.\r\nThe PartialSettlement field should be used as follows:\r\n- with code PAIN in the first message(s) (there may be more than one) confirming the partial settlement of an instruction.\r\n- with code PARC in the very last message sent to confirm the settlement of the remaining part.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalParameters26> forAdditionalParameters26 = new MMConstraint<AdditionalParameters26>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialSettlementGuideline";
			definition = "Partial settlement information only applies to markets where partial settlement is allowed.\r\nThe PartialSettlement field should be used as follows:\r\n- with code PAIN in the first message(s) (there may be more than one) confirming the partial settlement of an instruction.\r\n- with code PARC in the very last message sent to confirm the settlement of the remaining part.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> AdditionalParameters26.mmObject();
		}

		@Override
		public void executeValidator(AdditionalParameters26 obj) throws Exception {
			checkAdditionalParameters26(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount41
	 * QuantityAndAccount41}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Partial settlement information only applies to markets where partial settlement is allowed.\r\nThe SettledQuantity field provides the quantity of securities effectively settled.\r\nThe other quantities (PreviouslySettledQuantity and/or RemainingToBeSettledQuantity) may be provided, but this is not mandatory.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPartialSettlementGuideline#forQuantityAndAccount64
	 * ConstraintPartialSettlementGuideline.forQuantityAndAccount64}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPartialSettlementGuideline#forQuantityAndAccount28
	 * ConstraintPartialSettlementGuideline.forQuantityAndAccount28}</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount41> forQuantityAndAccount41 = new MMConstraint<QuantityAndAccount41>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialSettlementGuideline";
			definition = "Partial settlement information only applies to markets where partial settlement is allowed.\r\nThe SettledQuantity field provides the quantity of securities effectively settled.\r\nThe other quantities (PreviouslySettledQuantity and/or RemainingToBeSettledQuantity) may be provided, but this is not mandatory.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPartialSettlementGuideline.forQuantityAndAccount64);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPartialSettlementGuideline.forQuantityAndAccount28;
			owner_lazy = () -> QuantityAndAccount41.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount41 obj) throws Exception {
			checkQuantityAndAccount41(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters27
	 * AdditionalParameters27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Partial settlement information only applies to markets where partial settlement is allowed.\r\nThe PartialSettlement field should be used as follows:\r\n- with code PAIN in the first message(s) (there may be more than one) confirming the partial settlement of an instruction.\r\n- with code PARC in the very last message sent to confirm the settlement of the remaining part.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalParameters27> forAdditionalParameters27 = new MMConstraint<AdditionalParameters27>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialSettlementGuideline";
			definition = "Partial settlement information only applies to markets where partial settlement is allowed.\r\nThe PartialSettlement field should be used as follows:\r\n- with code PAIN in the first message(s) (there may be more than one) confirming the partial settlement of an instruction.\r\n- with code PARC in the very last message sent to confirm the settlement of the remaining part.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> AdditionalParameters27.mmObject();
		}

		@Override
		public void executeValidator(AdditionalParameters27 obj) throws Exception {
			checkAdditionalParameters27(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters31
	 * AdditionalParameters31}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Partial settlement information only applies to markets where partial settlement is allowed.\r\nThe PartialSettlement field should be used as follows:\r\n- with code PAIN in the first message(s) (there may be more than one) confirming the partial settlement of an instruction.\r\n- with code PARC in the very last message sent to confirm the settlement of the remaining part.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalParameters31> forAdditionalParameters31 = new MMConstraint<AdditionalParameters31>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialSettlementGuideline";
			definition = "Partial settlement information only applies to markets where partial settlement is allowed.\r\nThe PartialSettlement field should be used as follows:\r\n- with code PAIN in the first message(s) (there may be more than one) confirming the partial settlement of an instruction.\r\n- with code PARC in the very last message sent to confirm the settlement of the remaining part.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> AdditionalParameters31.mmObject();
		}

		@Override
		public void executeValidator(AdditionalParameters31 obj) throws Exception {
			checkAdditionalParameters31(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount15
	 * QuantityAndAccount15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Partial settlement information only applies to markets where partial settlement is allowed.\r\nThe SettledQuantity field provides the quantity of securities effectively settled.\r\nThe other quantities (PreviouslySettledQuantity and/or RemainingToBeSettledQuantity) may be provided, but this is not mandatory.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount15> forQuantityAndAccount15 = new MMConstraint<QuantityAndAccount15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialSettlementGuideline";
			definition = "Partial settlement information only applies to markets where partial settlement is allowed.\r\nThe SettledQuantity field provides the quantity of securities effectively settled.\r\nThe other quantities (PreviouslySettledQuantity and/or RemainingToBeSettledQuantity) may be provided, but this is not mandatory.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> QuantityAndAccount15.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount15 obj) throws Exception {
			checkQuantityAndAccount15(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount57
	 * QuantityAndAccount57}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Partial settlement information only applies to markets where partial settlement is allowed.\r\nThe SettledQuantity field provides the quantity of securities effectively settled.\r\nThe other quantities (PreviouslySettledQuantity and/or RemainingToBeSettledQuantity) may be provided, but this is not mandatory.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPartialSettlementGuideline#forQuantityAndAccount51
	 * ConstraintPartialSettlementGuideline.forQuantityAndAccount51}</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount57> forQuantityAndAccount57 = new MMConstraint<QuantityAndAccount57>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialSettlementGuideline";
			definition = "Partial settlement information only applies to markets where partial settlement is allowed.\r\nThe SettledQuantity field provides the quantity of securities effectively settled.\r\nThe other quantities (PreviouslySettledQuantity and/or RemainingToBeSettledQuantity) may be provided, but this is not mandatory.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPartialSettlementGuideline.forQuantityAndAccount51;
			owner_lazy = () -> QuantityAndAccount57.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount57 obj) throws Exception {
			checkQuantityAndAccount57(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount64
	 * QuantityAndAccount64}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Partial settlement information only applies to markets where partial settlement is allowed.\r\nThe SettledQuantity field provides the quantity of securities effectively settled.\r\nThe other quantities (PreviouslySettledQuantity and/or RemainingToBeSettledQuantity) may be provided, but this is not mandatory.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPartialSettlementGuideline#forQuantityAndAccount41
	 * ConstraintPartialSettlementGuideline.forQuantityAndAccount41}</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount64> forQuantityAndAccount64 = new MMConstraint<QuantityAndAccount64>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialSettlementGuideline";
			definition = "Partial settlement information only applies to markets where partial settlement is allowed.\r\nThe SettledQuantity field provides the quantity of securities effectively settled.\r\nThe other quantities (PreviouslySettledQuantity and/or RemainingToBeSettledQuantity) may be provided, but this is not mandatory.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPartialSettlementGuideline.forQuantityAndAccount41;
			owner_lazy = () -> QuantityAndAccount64.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount64 obj) throws Exception {
			checkQuantityAndAccount64(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount20
	 * QuantityAndAccount20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Partial settlement information only applies to markets where partial settlement is allowed.\r\nThe SettledQuantity field provides the quantity of securities effectively settled.\r\nThe other quantities (PreviouslySettledQuantity and/or RemainingToBeSettledQuantity) may be provided, but this is not mandatory.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount20> forQuantityAndAccount20 = new MMConstraint<QuantityAndAccount20>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialSettlementGuideline";
			definition = "Partial settlement information only applies to markets where partial settlement is allowed.\r\nThe SettledQuantity field provides the quantity of securities effectively settled.\r\nThe other quantities (PreviouslySettledQuantity and/or RemainingToBeSettledQuantity) may be provided, but this is not mandatory.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> QuantityAndAccount20.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount20 obj) throws Exception {
			checkQuantityAndAccount20(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters19
	 * AdditionalParameters19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Partial settlement information only applies to markets where partial settlement is allowed.\r\nThe PartialSettlement field should be used as follows:\r\n- with code PAIN in the first message(s) (there may be more than one) confirming the partial settlement of an instruction.\r\n- with code PARC in the very last message sent to confirm the settlement of the remaining part.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalParameters19> forAdditionalParameters19 = new MMConstraint<AdditionalParameters19>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialSettlementGuideline";
			definition = "Partial settlement information only applies to markets where partial settlement is allowed.\r\nThe PartialSettlement field should be used as follows:\r\n- with code PAIN in the first message(s) (there may be more than one) confirming the partial settlement of an instruction.\r\n- with code PARC in the very last message sent to confirm the settlement of the remaining part.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> AdditionalParameters19.mmObject();
		}

		@Override
		public void executeValidator(AdditionalParameters19 obj) throws Exception {
			checkAdditionalParameters19(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters17
	 * AdditionalParameters17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Partial settlement information only applies to markets where partial settlement is allowed.\r\nThe PartialSettlement field should be used as follows:\r\n- with code PAIN in the first message(s) (there may be more than one) confirming the partial settlement of an instruction.\r\n- with code PARC in the very last message sent to confirm the settlement of the remaining part.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPartialSettlementGuideline#forAdditionalParameters22
	 * ConstraintPartialSettlementGuideline.forAdditionalParameters22}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalParameters17> forAdditionalParameters17 = new MMConstraint<AdditionalParameters17>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialSettlementGuideline";
			definition = "Partial settlement information only applies to markets where partial settlement is allowed.\r\nThe PartialSettlement field should be used as follows:\r\n- with code PAIN in the first message(s) (there may be more than one) confirming the partial settlement of an instruction.\r\n- with code PARC in the very last message sent to confirm the settlement of the remaining part.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPartialSettlementGuideline.forAdditionalParameters22);
			owner_lazy = () -> AdditionalParameters17.mmObject();
		}

		@Override
		public void executeValidator(AdditionalParameters17 obj) throws Exception {
			checkAdditionalParameters17(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount2
	 * QuantityAndAccount2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Partial settlement information only applies to markets where partial settlement is allowed.\r\nThe SettledQuantity field provides the quantity of securities effectively settled.\r\nThe other quantities (PreviouslySettledQuantity and/or RemainingToBeSettledQuantity) may be provided, but this is not mandatory.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount2> forQuantityAndAccount2 = new MMConstraint<QuantityAndAccount2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialSettlementGuideline";
			definition = "Partial settlement information only applies to markets where partial settlement is allowed.\r\nThe SettledQuantity field provides the quantity of securities effectively settled.\r\nThe other quantities (PreviouslySettledQuantity and/or RemainingToBeSettledQuantity) may be provided, but this is not mandatory.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> QuantityAndAccount2.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount2 obj) throws Exception {
			checkQuantityAndAccount2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount37
	 * QuantityAndAccount37}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Partial settlement information only applies to markets where partial settlement is allowed.\r\nThe SettledQuantity field provides the quantity of securities effectively settled.\r\nThe other quantities (PreviouslySettledQuantity and/or RemainingToBeSettledQuantity) may be provided, but this is not mandatory.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount37> forQuantityAndAccount37 = new MMConstraint<QuantityAndAccount37>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialSettlementGuideline";
			definition = "Partial settlement information only applies to markets where partial settlement is allowed.\r\nThe SettledQuantity field provides the quantity of securities effectively settled.\r\nThe other quantities (PreviouslySettledQuantity and/or RemainingToBeSettledQuantity) may be provided, but this is not mandatory.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> QuantityAndAccount37.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount37 obj) throws Exception {
			checkQuantityAndAccount37(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters12
	 * AdditionalParameters12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Partial settlement information only applies to markets where partial settlement is allowed.\r\nThe PartialSettlement field should be used as follows:\r\n- with code PAIN in the first message(s) (there may be more than one) confirming the partial settlement of an instruction.\r\n- with code PARC in the very last message sent to confirm the settlement of the remaining part.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalParameters12> forAdditionalParameters12 = new MMConstraint<AdditionalParameters12>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialSettlementGuideline";
			definition = "Partial settlement information only applies to markets where partial settlement is allowed.\r\nThe PartialSettlement field should be used as follows:\r\n- with code PAIN in the first message(s) (there may be more than one) confirming the partial settlement of an instruction.\r\n- with code PARC in the very last message sent to confirm the settlement of the remaining part.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> AdditionalParameters12.mmObject();
		}

		@Override
		public void executeValidator(AdditionalParameters12 obj) throws Exception {
			checkAdditionalParameters12(obj);
		}
	};

	/**
	 * Partial settlement information only applies to markets where partial
	 * settlement is allowed.<br>
	 * The SettledQuantity field provides the quantity of securities effectively
	 * settled.<br>
	 * The other quantities (PreviouslySettledQuantity and/or
	 * RemainingToBeSettledQuantity) may be provided, but this is not mandatory.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkQuantityAndAccount51(QuantityAndAccount51 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Partial settlement information only applies to markets where partial
	 * settlement is allowed.<br>
	 * The SettledQuantity field provides the quantity of securities effectively
	 * settled.<br>
	 * The other quantities (PreviouslySettledQuantity and/or
	 * RemainingToBeSettledQuantity) may be provided, but this is not mandatory.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkQuantityAndAccount72(QuantityAndAccount72 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Partial settlement information only applies to markets where partial
	 * settlement is allowed.<br>
	 * The PartialSettlement field should be used as follows:<br>
	 * - with code PAIN in the first message(s) (there may be more than one)
	 * confirming the partial settlement of an instruction.<br>
	 * - with code PARC in the very last message sent to confirm the settlement
	 * of the remaining part.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkAdditionalParameters18(AdditionalParameters18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Partial settlement information only applies to markets where partial
	 * settlement is allowed.<br>
	 * The PartialSettlement field should be used as follows:<br>
	 * - with code PAIN in the first message(s) (there may be more than one)
	 * confirming the partial settlement of an instruction.<br>
	 * - with code PARC in the very last message sent to confirm the settlement
	 * of the remaining part.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkAdditionalParameters20(AdditionalParameters20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Partial settlement information only applies to markets where partial
	 * settlement is allowed.<br>
	 * The SettledQuantity field provides the quantity of securities effectively
	 * settled.<br>
	 * The other quantities (PreviouslySettledQuantity and/or
	 * RemainingToBeSettledQuantity) may be provided, but this is not mandatory.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkQuantityAndAccount12(QuantityAndAccount12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Partial settlement information only applies to markets where partial
	 * settlement is allowed.<br>
	 * The PartialSettlement field should be used as follows:<br>
	 * - with code PAIN in the first message(s) (there may be more than one)
	 * confirming the partial settlement of an instruction.<br>
	 * - with code PARC in the very last message sent to confirm the settlement
	 * of the remaining part.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkAdditionalParameters29(AdditionalParameters29 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Partial settlement information only applies to markets where partial
	 * settlement is allowed.<br>
	 * The PartialSettlement field should be used as follows:<br>
	 * - with code PAIN in the first message(s) (there may be more than one)
	 * confirming the partial settlement of an instruction.<br>
	 * - with code PARC in the very last message sent to confirm the settlement
	 * of the remaining part.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkAdditionalParameters13(AdditionalParameters13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Partial settlement information only applies to markets where partial
	 * settlement is allowed.<br>
	 * The PartialSettlement field should be used as follows:<br>
	 * - with code PAIN in the first message(s) (there may be more than one)
	 * confirming the partial settlement of an instruction.<br>
	 * - with code PARC in the very last message sent to confirm the settlement
	 * of the remaining part.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkAdditionalParameters2(AdditionalParameters2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Partial settlement information only applies to markets where partial
	 * settlement is allowed.<br>
	 * The PartialSettlement field should be used as follows:<br>
	 * - with code PAIN in the first message(s) (there may be more than one)
	 * confirming the partial settlement of an instruction.<br>
	 * - with code PARC in the very last message sent to confirm the settlement
	 * of the remaining part.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkAdditionalParameters24(AdditionalParameters24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Partial settlement information only applies to markets where partial
	 * settlement is allowed.<br>
	 * The SettledQuantity field provides the quantity of securities effectively
	 * settled.<br>
	 * The other quantities (PreviouslySettledQuantity and/or
	 * RemainingToBeSettledQuantity) may be provided, but this is not mandatory.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkQuantityAndAccount28(QuantityAndAccount28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Partial settlement information only applies to markets where partial
	 * settlement is allowed.<br>
	 * The PartialSettlement field should be used as follows:<br>
	 * - with code PAIN in the first message(s) (there may be more than one)
	 * confirming the partial settlement of an instruction.<br>
	 * - with code PARC in the very last message sent to confirm the settlement
	 * of the remaining part.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkAdditionalParameters6(AdditionalParameters6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Partial settlement information only applies to markets where partial
	 * settlement is allowed.<br>
	 * The PartialSettlement field should be used as follows:<br>
	 * - with code PAIN in the first message(s) (there may be more than one)
	 * confirming the partial settlement of an instruction.<br>
	 * - with code PARC in the very last message sent to confirm the settlement
	 * of the remaining part.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkAdditionalParameters22(AdditionalParameters22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Partial settlement information only applies to markets where partial
	 * settlement is allowed.<br>
	 * The PartialSettlement field should be used as follows:<br>
	 * - with code PAIN in the first message(s) (there may be more than one)
	 * confirming the partial settlement of an instruction.<br>
	 * - with code PARC in the very last message sent to confirm the settlement
	 * of the remaining part.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkAdditionalParameters26(AdditionalParameters26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Partial settlement information only applies to markets where partial
	 * settlement is allowed.<br>
	 * The SettledQuantity field provides the quantity of securities effectively
	 * settled.<br>
	 * The other quantities (PreviouslySettledQuantity and/or
	 * RemainingToBeSettledQuantity) may be provided, but this is not mandatory.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkQuantityAndAccount41(QuantityAndAccount41 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Partial settlement information only applies to markets where partial
	 * settlement is allowed.<br>
	 * The PartialSettlement field should be used as follows:<br>
	 * - with code PAIN in the first message(s) (there may be more than one)
	 * confirming the partial settlement of an instruction.<br>
	 * - with code PARC in the very last message sent to confirm the settlement
	 * of the remaining part.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkAdditionalParameters27(AdditionalParameters27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Partial settlement information only applies to markets where partial
	 * settlement is allowed.<br>
	 * The PartialSettlement field should be used as follows:<br>
	 * - with code PAIN in the first message(s) (there may be more than one)
	 * confirming the partial settlement of an instruction.<br>
	 * - with code PARC in the very last message sent to confirm the settlement
	 * of the remaining part.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkAdditionalParameters31(AdditionalParameters31 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Partial settlement information only applies to markets where partial
	 * settlement is allowed.<br>
	 * The SettledQuantity field provides the quantity of securities effectively
	 * settled.<br>
	 * The other quantities (PreviouslySettledQuantity and/or
	 * RemainingToBeSettledQuantity) may be provided, but this is not mandatory.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkQuantityAndAccount15(QuantityAndAccount15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Partial settlement information only applies to markets where partial
	 * settlement is allowed.<br>
	 * The SettledQuantity field provides the quantity of securities effectively
	 * settled.<br>
	 * The other quantities (PreviouslySettledQuantity and/or
	 * RemainingToBeSettledQuantity) may be provided, but this is not mandatory.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkQuantityAndAccount57(QuantityAndAccount57 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Partial settlement information only applies to markets where partial
	 * settlement is allowed.<br>
	 * The SettledQuantity field provides the quantity of securities effectively
	 * settled.<br>
	 * The other quantities (PreviouslySettledQuantity and/or
	 * RemainingToBeSettledQuantity) may be provided, but this is not mandatory.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkQuantityAndAccount64(QuantityAndAccount64 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Partial settlement information only applies to markets where partial
	 * settlement is allowed.<br>
	 * The SettledQuantity field provides the quantity of securities effectively
	 * settled.<br>
	 * The other quantities (PreviouslySettledQuantity and/or
	 * RemainingToBeSettledQuantity) may be provided, but this is not mandatory.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkQuantityAndAccount20(QuantityAndAccount20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Partial settlement information only applies to markets where partial
	 * settlement is allowed.<br>
	 * The PartialSettlement field should be used as follows:<br>
	 * - with code PAIN in the first message(s) (there may be more than one)
	 * confirming the partial settlement of an instruction.<br>
	 * - with code PARC in the very last message sent to confirm the settlement
	 * of the remaining part.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkAdditionalParameters19(AdditionalParameters19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Partial settlement information only applies to markets where partial
	 * settlement is allowed.<br>
	 * The PartialSettlement field should be used as follows:<br>
	 * - with code PAIN in the first message(s) (there may be more than one)
	 * confirming the partial settlement of an instruction.<br>
	 * - with code PARC in the very last message sent to confirm the settlement
	 * of the remaining part.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkAdditionalParameters17(AdditionalParameters17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Partial settlement information only applies to markets where partial
	 * settlement is allowed.<br>
	 * The SettledQuantity field provides the quantity of securities effectively
	 * settled.<br>
	 * The other quantities (PreviouslySettledQuantity and/or
	 * RemainingToBeSettledQuantity) may be provided, but this is not mandatory.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkQuantityAndAccount2(QuantityAndAccount2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Partial settlement information only applies to markets where partial
	 * settlement is allowed.<br>
	 * The SettledQuantity field provides the quantity of securities effectively
	 * settled.<br>
	 * The other quantities (PreviouslySettledQuantity and/or
	 * RemainingToBeSettledQuantity) may be provided, but this is not mandatory.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkQuantityAndAccount37(QuantityAndAccount37 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Partial settlement information only applies to markets where partial
	 * settlement is allowed.<br>
	 * The PartialSettlement field should be used as follows:<br>
	 * - with code PAIN in the first message(s) (there may be more than one)
	 * confirming the partial settlement of an instruction.<br>
	 * - with code PARC in the very last message sent to confirm the settlement
	 * of the remaining part.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkAdditionalParameters12(AdditionalParameters12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}