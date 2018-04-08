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
import com.tools20022.repository.area.seev.*;
import java.util.Arrays;

/**
 * If CorporateActionConfirmationDetails/CashMovementDetails/TaxVoucherDetails/
 * BargainDate or
 * CorporateActionConfirmationDetails/CashMovementDetails/TaxVoucherDetails
 * /BargainSettlementDate is present, then
 * CorporateActionGeneralInformation/EventType/Code value must be DRIP
 * (DividendReinvestment).
 */
public class ConstraintScripOrDividendReinvestment3Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV07
	 * CorporateActionMovementReversalAdviceV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScripOrDividendReinvestment3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionConfirmationDetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationDetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then CorporateActionGeneralInformation/EventType/Code value must be DRIP (DividendReinvestment)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule#for_seev_CorporateActionMovementReversalAdviceV08
	 * ConstraintScripOrDividendReinvestment3Rule.
	 * for_seev_CorporateActionMovementReversalAdviceV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule#for_seev_CorporateActionMovementReversalAdviceV06
	 * ConstraintScripOrDividendReinvestment3Rule.
	 * for_seev_CorporateActionMovementReversalAdviceV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV07> for_seev_CorporateActionMovementReversalAdviceV07 = new MMConstraint<CorporateActionMovementReversalAdviceV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScripOrDividendReinvestment3Rule";
			definition = "If CorporateActionConfirmationDetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationDetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then CorporateActionGeneralInformation/EventType/Code value must be DRIP (DividendReinvestment).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule.for_seev_CorporateActionMovementReversalAdviceV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule.for_seev_CorporateActionMovementReversalAdviceV06;
			owner_lazy = () -> CorporateActionMovementReversalAdviceV07.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementReversalAdviceV07 obj) throws Exception {
			check_seev_CorporateActionMovementReversalAdviceV07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV03
	 * CorporateActionMovementConfirmationV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScripOrDividendReinvestment3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then GeneralInformation/EventType/Code value must be DRIP (DividendReinvestment)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV03> for_seev_CorporateActionMovementConfirmationV03 = new MMConstraint<CorporateActionMovementConfirmationV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScripOrDividendReinvestment3Rule";
			definition = "If CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then GeneralInformation/EventType/Code value must be DRIP (DividendReinvestment).";
			owner_lazy = () -> CorporateActionMovementConfirmationV03.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementConfirmationV03 obj) throws Exception {
			check_seev_CorporateActionMovementConfirmationV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV05
	 * CorporateActionMovementConfirmationV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScripOrDividendReinvestment3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then GeneralInformation/EventType/Code value must be DRIP (DividendReinvestment)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule#for_seev_CorporateActionMovementConfirmationV06
	 * ConstraintScripOrDividendReinvestment3Rule.
	 * for_seev_CorporateActionMovementConfirmationV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule#for_seev_CorporateActionMovementConfirmationV04
	 * ConstraintScripOrDividendReinvestment3Rule.
	 * for_seev_CorporateActionMovementConfirmationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV05> for_seev_CorporateActionMovementConfirmationV05 = new MMConstraint<CorporateActionMovementConfirmationV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScripOrDividendReinvestment3Rule";
			definition = "If CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then GeneralInformation/EventType/Code value must be DRIP (DividendReinvestment).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule.for_seev_CorporateActionMovementConfirmationV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule.for_seev_CorporateActionMovementConfirmationV04;
			owner_lazy = () -> CorporateActionMovementConfirmationV05.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementConfirmationV05 obj) throws Exception {
			check_seev_CorporateActionMovementConfirmationV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV05
	 * CorporateActionMovementReversalAdviceV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScripOrDividendReinvestment3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then GeneralInformation/EventType/Code value must be DRIP (DividendReinvestment)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule#for_seev_CorporateActionMovementReversalAdviceV06
	 * ConstraintScripOrDividendReinvestment3Rule.
	 * for_seev_CorporateActionMovementReversalAdviceV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule#for_seev_CorporateActionMovementReversalAdviceV04
	 * ConstraintScripOrDividendReinvestment3Rule.
	 * for_seev_CorporateActionMovementReversalAdviceV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV05> for_seev_CorporateActionMovementReversalAdviceV05 = new MMConstraint<CorporateActionMovementReversalAdviceV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScripOrDividendReinvestment3Rule";
			definition = "If CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then GeneralInformation/EventType/Code value must be DRIP (DividendReinvestment).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule.for_seev_CorporateActionMovementReversalAdviceV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule.for_seev_CorporateActionMovementReversalAdviceV04;
			owner_lazy = () -> CorporateActionMovementReversalAdviceV05.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementReversalAdviceV05 obj) throws Exception {
			check_seev_CorporateActionMovementReversalAdviceV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV06
	 * CorporateActionMovementConfirmationV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScripOrDividendReinvestment3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then GeneralInformation/EventType/Code value must be DRIP (DividendReinvestment)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule#for_seev_CorporateActionMovementConfirmationV07
	 * ConstraintScripOrDividendReinvestment3Rule.
	 * for_seev_CorporateActionMovementConfirmationV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule#for_seev_CorporateActionMovementConfirmationV05
	 * ConstraintScripOrDividendReinvestment3Rule.
	 * for_seev_CorporateActionMovementConfirmationV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV06> for_seev_CorporateActionMovementConfirmationV06 = new MMConstraint<CorporateActionMovementConfirmationV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScripOrDividendReinvestment3Rule";
			definition = "If CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then GeneralInformation/EventType/Code value must be DRIP (DividendReinvestment).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule.for_seev_CorporateActionMovementConfirmationV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule.for_seev_CorporateActionMovementConfirmationV05;
			owner_lazy = () -> CorporateActionMovementConfirmationV06.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementConfirmationV06 obj) throws Exception {
			check_seev_CorporateActionMovementConfirmationV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV02
	 * CorporateActionMovementConfirmationV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScripOrDividendReinvestment3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then GeneralInformation/EventType/Code value must be DRIP (DividendReinvestment)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV02> for_seev_CorporateActionMovementConfirmationV02 = new MMConstraint<CorporateActionMovementConfirmationV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScripOrDividendReinvestment3Rule";
			definition = "If CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then GeneralInformation/EventType/Code value must be DRIP (DividendReinvestment).";
			owner_lazy = () -> CorporateActionMovementConfirmationV02.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementConfirmationV02 obj) throws Exception {
			check_seev_CorporateActionMovementConfirmationV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V07
	 * CorporateActionMovementConfirmation002V07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScripOrDividendReinvestment3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionConfirmationDetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationDetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then CorporateActionGeneralInformation/EventType/Code value must be DRIP (DividendReinvestment)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmation002V07> for_seev_CorporateActionMovementConfirmation002V07 = new MMConstraint<CorporateActionMovementConfirmation002V07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScripOrDividendReinvestment3Rule";
			definition = "If CorporateActionConfirmationDetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationDetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then CorporateActionGeneralInformation/EventType/Code value must be DRIP (DividendReinvestment).";
			owner_lazy = () -> CorporateActionMovementConfirmation002V07.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementConfirmation002V07 obj) throws Exception {
			check_seev_CorporateActionMovementConfirmation002V07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V09
	 * CorporateActionMovementConfirmation002V09}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScripOrDividendReinvestment3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionConfirmationDetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationDetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then CorporateActionGeneralInformation/EventType/Code value must be DRIP (DividendReinvestment)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmation002V09> for_seev_CorporateActionMovementConfirmation002V09 = new MMConstraint<CorporateActionMovementConfirmation002V09>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScripOrDividendReinvestment3Rule";
			definition = "If CorporateActionConfirmationDetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationDetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then CorporateActionGeneralInformation/EventType/Code value must be DRIP (DividendReinvestment).";
			owner_lazy = () -> CorporateActionMovementConfirmation002V09.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementConfirmation002V09 obj) throws Exception {
			check_seev_CorporateActionMovementConfirmation002V09(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV08
	 * CorporateActionMovementConfirmationV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScripOrDividendReinvestment3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionConfirmationDetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationDetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then CorporateActionGeneralInformation/EventType/Code value must be DRIP (DividendReinvestment)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule#for_seev_CorporateActionMovementConfirmationV09
	 * ConstraintScripOrDividendReinvestment3Rule.
	 * for_seev_CorporateActionMovementConfirmationV09}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule#for_seev_CorporateActionMovementConfirmationV07
	 * ConstraintScripOrDividendReinvestment3Rule.
	 * for_seev_CorporateActionMovementConfirmationV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV08> for_seev_CorporateActionMovementConfirmationV08 = new MMConstraint<CorporateActionMovementConfirmationV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScripOrDividendReinvestment3Rule";
			definition = "If CorporateActionConfirmationDetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationDetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then CorporateActionGeneralInformation/EventType/Code value must be DRIP (DividendReinvestment).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule.for_seev_CorporateActionMovementConfirmationV09);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule.for_seev_CorporateActionMovementConfirmationV07;
			owner_lazy = () -> CorporateActionMovementConfirmationV08.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementConfirmationV08 obj) throws Exception {
			check_seev_CorporateActionMovementConfirmationV08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV01
	 * CorporateActionMovementReversalAdviceV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScripOrDividendReinvestment3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then GeneralInformation/EventType/Code value must be DRIP (DividendReinvestment)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV01> for_seev_CorporateActionMovementReversalAdviceV01 = new MMConstraint<CorporateActionMovementReversalAdviceV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScripOrDividendReinvestment3Rule";
			definition = "If CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then GeneralInformation/EventType/Code value must be DRIP (DividendReinvestment).";
			owner_lazy = () -> CorporateActionMovementReversalAdviceV01.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementReversalAdviceV01 obj) throws Exception {
			check_seev_CorporateActionMovementReversalAdviceV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV06
	 * CorporateActionMovementReversalAdviceV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScripOrDividendReinvestment3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then GeneralInformation/EventType/Code value must be DRIP (DividendReinvestment)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule#for_seev_CorporateActionMovementReversalAdviceV07
	 * ConstraintScripOrDividendReinvestment3Rule.
	 * for_seev_CorporateActionMovementReversalAdviceV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule#for_seev_CorporateActionMovementReversalAdviceV05
	 * ConstraintScripOrDividendReinvestment3Rule.
	 * for_seev_CorporateActionMovementReversalAdviceV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV06> for_seev_CorporateActionMovementReversalAdviceV06 = new MMConstraint<CorporateActionMovementReversalAdviceV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScripOrDividendReinvestment3Rule";
			definition = "If CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then GeneralInformation/EventType/Code value must be DRIP (DividendReinvestment).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule.for_seev_CorporateActionMovementReversalAdviceV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule.for_seev_CorporateActionMovementReversalAdviceV05;
			owner_lazy = () -> CorporateActionMovementReversalAdviceV06.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementReversalAdviceV06 obj) throws Exception {
			check_seev_CorporateActionMovementReversalAdviceV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV02
	 * CorporateActionMovementReversalAdviceV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScripOrDividendReinvestment3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then GeneralInformation/EventType/Code value must be DRIP (DividendReinvestment)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV02> for_seev_CorporateActionMovementReversalAdviceV02 = new MMConstraint<CorporateActionMovementReversalAdviceV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScripOrDividendReinvestment3Rule";
			definition = "If CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then GeneralInformation/EventType/Code value must be DRIP (DividendReinvestment).";
			owner_lazy = () -> CorporateActionMovementReversalAdviceV02.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementReversalAdviceV02 obj) throws Exception {
			check_seev_CorporateActionMovementReversalAdviceV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV03
	 * CorporateActionMovementReversalAdviceV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScripOrDividendReinvestment3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then GeneralInformation/EventType/Code value must be DRIP (DividendReinvestment)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV03> for_seev_CorporateActionMovementReversalAdviceV03 = new MMConstraint<CorporateActionMovementReversalAdviceV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScripOrDividendReinvestment3Rule";
			definition = "If CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then GeneralInformation/EventType/Code value must be DRIP (DividendReinvestment).";
			owner_lazy = () -> CorporateActionMovementReversalAdviceV03.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementReversalAdviceV03 obj) throws Exception {
			check_seev_CorporateActionMovementReversalAdviceV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV04
	 * CorporateActionMovementReversalAdviceV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScripOrDividendReinvestment3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then GeneralInformation/EventType/Code value must be DRIP (DividendReinvestment)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule#for_seev_CorporateActionMovementReversalAdviceV05
	 * ConstraintScripOrDividendReinvestment3Rule.
	 * for_seev_CorporateActionMovementReversalAdviceV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV04> for_seev_CorporateActionMovementReversalAdviceV04 = new MMConstraint<CorporateActionMovementReversalAdviceV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScripOrDividendReinvestment3Rule";
			definition = "If CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then GeneralInformation/EventType/Code value must be DRIP (DividendReinvestment).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule.for_seev_CorporateActionMovementReversalAdviceV05);
			owner_lazy = () -> CorporateActionMovementReversalAdviceV04.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementReversalAdviceV04 obj) throws Exception {
			check_seev_CorporateActionMovementReversalAdviceV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV08
	 * CorporateActionMovementReversalAdviceV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScripOrDividendReinvestment3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionConfirmationDetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationDetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then CorporateActionGeneralInformation/EventType/Code value must be DRIP (DividendReinvestment)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule#for_seev_CorporateActionMovementReversalAdviceV07
	 * ConstraintScripOrDividendReinvestment3Rule.
	 * for_seev_CorporateActionMovementReversalAdviceV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV08> for_seev_CorporateActionMovementReversalAdviceV08 = new MMConstraint<CorporateActionMovementReversalAdviceV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScripOrDividendReinvestment3Rule";
			definition = "If CorporateActionConfirmationDetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationDetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then CorporateActionGeneralInformation/EventType/Code value must be DRIP (DividendReinvestment).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule.for_seev_CorporateActionMovementReversalAdviceV07;
			owner_lazy = () -> CorporateActionMovementReversalAdviceV08.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementReversalAdviceV08 obj) throws Exception {
			check_seev_CorporateActionMovementReversalAdviceV08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV01
	 * CorporateActionMovementConfirmationV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScripOrDividendReinvestment3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then GeneralInformation/EventType/Code value must be DRIP (DividendReinvestment)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV01> for_seev_CorporateActionMovementConfirmationV01 = new MMConstraint<CorporateActionMovementConfirmationV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScripOrDividendReinvestment3Rule";
			definition = "If CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then GeneralInformation/EventType/Code value must be DRIP (DividendReinvestment).";
			owner_lazy = () -> CorporateActionMovementConfirmationV01.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementConfirmationV01 obj) throws Exception {
			check_seev_CorporateActionMovementConfirmationV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV04
	 * CorporateActionMovementConfirmationV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScripOrDividendReinvestment3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then GeneralInformation/EventType/Code value must be DRIP (DividendReinvestment)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule#for_seev_CorporateActionMovementConfirmationV05
	 * ConstraintScripOrDividendReinvestment3Rule.
	 * for_seev_CorporateActionMovementConfirmationV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV04> for_seev_CorporateActionMovementConfirmationV04 = new MMConstraint<CorporateActionMovementConfirmationV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScripOrDividendReinvestment3Rule";
			definition = "If CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then GeneralInformation/EventType/Code value must be DRIP (DividendReinvestment).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule.for_seev_CorporateActionMovementConfirmationV05);
			owner_lazy = () -> CorporateActionMovementConfirmationV04.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementConfirmationV04 obj) throws Exception {
			check_seev_CorporateActionMovementConfirmationV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV07
	 * CorporateActionMovementConfirmationV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScripOrDividendReinvestment3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionConfirmationDetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationDetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then CorporateActionGeneralInformation/EventType/Code value must be DRIP (DividendReinvestment)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule#for_seev_CorporateActionMovementConfirmationV08
	 * ConstraintScripOrDividendReinvestment3Rule.
	 * for_seev_CorporateActionMovementConfirmationV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule#for_seev_CorporateActionMovementConfirmationV06
	 * ConstraintScripOrDividendReinvestment3Rule.
	 * for_seev_CorporateActionMovementConfirmationV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV07> for_seev_CorporateActionMovementConfirmationV07 = new MMConstraint<CorporateActionMovementConfirmationV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScripOrDividendReinvestment3Rule";
			definition = "If CorporateActionConfirmationDetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationDetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then CorporateActionGeneralInformation/EventType/Code value must be DRIP (DividendReinvestment).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule.for_seev_CorporateActionMovementConfirmationV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule.for_seev_CorporateActionMovementConfirmationV06;
			owner_lazy = () -> CorporateActionMovementConfirmationV07.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementConfirmationV07 obj) throws Exception {
			check_seev_CorporateActionMovementConfirmationV07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV09
	 * CorporateActionMovementConfirmationV09}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScripOrDividendReinvestment3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionConfirmationDetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationDetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then CorporateActionGeneralInformation/EventType/Code value must be DRIP (DividendReinvestment)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule#for_seev_CorporateActionMovementConfirmationV08
	 * ConstraintScripOrDividendReinvestment3Rule.
	 * for_seev_CorporateActionMovementConfirmationV08}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV09> for_seev_CorporateActionMovementConfirmationV09 = new MMConstraint<CorporateActionMovementConfirmationV09>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScripOrDividendReinvestment3Rule";
			definition = "If CorporateActionConfirmationDetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationDetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then CorporateActionGeneralInformation/EventType/Code value must be DRIP (DividendReinvestment).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule.for_seev_CorporateActionMovementConfirmationV08;
			owner_lazy = () -> CorporateActionMovementConfirmationV09.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementConfirmationV09 obj) throws Exception {
			check_seev_CorporateActionMovementConfirmationV09(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V07
	 * CorporateActionMovementReversalAdvice002V07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScripOrDividendReinvestment3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionConfirmationDetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationDetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then CorporateActionGeneralInformation/EventType/Code value must be DRIP (DividendReinvestment)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdvice002V07> for_seev_CorporateActionMovementReversalAdvice002V07 = new MMConstraint<CorporateActionMovementReversalAdvice002V07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScripOrDividendReinvestment3Rule";
			definition = "If CorporateActionConfirmationDetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationDetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then CorporateActionGeneralInformation/EventType/Code value must be DRIP (DividendReinvestment).";
			owner_lazy = () -> CorporateActionMovementReversalAdvice002V07.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementReversalAdvice002V07 obj) throws Exception {
			check_seev_CorporateActionMovementReversalAdvice002V07(obj);
		}
	};

	/**
	 * If CorporateActionConfirmationDetails/CashMovementDetails/
	 * TaxVoucherDetails/BargainDate or
	 * CorporateActionConfirmationDetails/CashMovementDetails
	 * /TaxVoucherDetails/BargainSettlementDate is present, then
	 * CorporateActionGeneralInformation/EventType/Code value must be DRIP
	 * (DividendReinvestment).
	 */
	public static void check_seev_CorporateActionMovementReversalAdviceV07(CorporateActionMovementReversalAdviceV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionConfirmationdetails/CashMovementDetails/
	 * TaxVoucherDetails/BargainDate or
	 * CorporateActionConfirmationdetails/CashMovementDetails
	 * /TaxVoucherDetails/BargainSettlementDate is present, then
	 * GeneralInformation/EventType/Code value must be DRIP
	 * (DividendReinvestment).
	 */
	public static void check_seev_CorporateActionMovementConfirmationV03(CorporateActionMovementConfirmationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionConfirmationdetails/CashMovementDetails/
	 * TaxVoucherDetails/BargainDate or
	 * CorporateActionConfirmationdetails/CashMovementDetails
	 * /TaxVoucherDetails/BargainSettlementDate is present, then
	 * GeneralInformation/EventType/Code value must be DRIP
	 * (DividendReinvestment).
	 */
	public static void check_seev_CorporateActionMovementConfirmationV05(CorporateActionMovementConfirmationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionConfirmationdetails/CashMovementDetails/
	 * TaxVoucherDetails/BargainDate or
	 * CorporateActionConfirmationdetails/CashMovementDetails
	 * /TaxVoucherDetails/BargainSettlementDate is present, then
	 * GeneralInformation/EventType/Code value must be DRIP
	 * (DividendReinvestment).
	 */
	public static void check_seev_CorporateActionMovementReversalAdviceV05(CorporateActionMovementReversalAdviceV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionConfirmationdetails/CashMovementDetails/
	 * TaxVoucherDetails/BargainDate or
	 * CorporateActionConfirmationdetails/CashMovementDetails
	 * /TaxVoucherDetails/BargainSettlementDate is present, then
	 * GeneralInformation/EventType/Code value must be DRIP
	 * (DividendReinvestment).
	 */
	public static void check_seev_CorporateActionMovementConfirmationV06(CorporateActionMovementConfirmationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionConfirmationdetails/CashMovementDetails/
	 * TaxVoucherDetails/BargainDate or
	 * CorporateActionConfirmationdetails/CashMovementDetails
	 * /TaxVoucherDetails/BargainSettlementDate is present, then
	 * GeneralInformation/EventType/Code value must be DRIP
	 * (DividendReinvestment).
	 */
	public static void check_seev_CorporateActionMovementConfirmationV02(CorporateActionMovementConfirmationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionConfirmationDetails/CashMovementDetails/
	 * TaxVoucherDetails/BargainDate or
	 * CorporateActionConfirmationDetails/CashMovementDetails
	 * /TaxVoucherDetails/BargainSettlementDate is present, then
	 * CorporateActionGeneralInformation/EventType/Code value must be DRIP
	 * (DividendReinvestment).
	 */
	public static void check_seev_CorporateActionMovementConfirmation002V07(CorporateActionMovementConfirmation002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionConfirmationDetails/CashMovementDetails/
	 * TaxVoucherDetails/BargainDate or
	 * CorporateActionConfirmationDetails/CashMovementDetails
	 * /TaxVoucherDetails/BargainSettlementDate is present, then
	 * CorporateActionGeneralInformation/EventType/Code value must be DRIP
	 * (DividendReinvestment).
	 */
	public static void check_seev_CorporateActionMovementConfirmation002V09(CorporateActionMovementConfirmation002V09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionConfirmationDetails/CashMovementDetails/
	 * TaxVoucherDetails/BargainDate or
	 * CorporateActionConfirmationDetails/CashMovementDetails
	 * /TaxVoucherDetails/BargainSettlementDate is present, then
	 * CorporateActionGeneralInformation/EventType/Code value must be DRIP
	 * (DividendReinvestment).
	 */
	public static void check_seev_CorporateActionMovementConfirmationV08(CorporateActionMovementConfirmationV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionConfirmationdetails/CashMovementDetails/
	 * TaxVoucherDetails/BargainDate or
	 * CorporateActionConfirmationdetails/CashMovementDetails
	 * /TaxVoucherDetails/BargainSettlementDate is present, then
	 * GeneralInformation/EventType/Code value must be DRIP
	 * (DividendReinvestment).
	 */
	public static void check_seev_CorporateActionMovementReversalAdviceV01(CorporateActionMovementReversalAdviceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionConfirmationdetails/CashMovementDetails/
	 * TaxVoucherDetails/BargainDate or
	 * CorporateActionConfirmationdetails/CashMovementDetails
	 * /TaxVoucherDetails/BargainSettlementDate is present, then
	 * GeneralInformation/EventType/Code value must be DRIP
	 * (DividendReinvestment).
	 */
	public static void check_seev_CorporateActionMovementReversalAdviceV06(CorporateActionMovementReversalAdviceV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionConfirmationdetails/CashMovementDetails/
	 * TaxVoucherDetails/BargainDate or
	 * CorporateActionConfirmationdetails/CashMovementDetails
	 * /TaxVoucherDetails/BargainSettlementDate is present, then
	 * GeneralInformation/EventType/Code value must be DRIP
	 * (DividendReinvestment).
	 */
	public static void check_seev_CorporateActionMovementReversalAdviceV02(CorporateActionMovementReversalAdviceV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionConfirmationdetails/CashMovementDetails/
	 * TaxVoucherDetails/BargainDate or
	 * CorporateActionConfirmationdetails/CashMovementDetails
	 * /TaxVoucherDetails/BargainSettlementDate is present, then
	 * GeneralInformation/EventType/Code value must be DRIP
	 * (DividendReinvestment).
	 */
	public static void check_seev_CorporateActionMovementReversalAdviceV03(CorporateActionMovementReversalAdviceV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionConfirmationdetails/CashMovementDetails/
	 * TaxVoucherDetails/BargainDate or
	 * CorporateActionConfirmationdetails/CashMovementDetails
	 * /TaxVoucherDetails/BargainSettlementDate is present, then
	 * GeneralInformation/EventType/Code value must be DRIP
	 * (DividendReinvestment).
	 */
	public static void check_seev_CorporateActionMovementReversalAdviceV04(CorporateActionMovementReversalAdviceV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionConfirmationDetails/CashMovementDetails/
	 * TaxVoucherDetails/BargainDate or
	 * CorporateActionConfirmationDetails/CashMovementDetails
	 * /TaxVoucherDetails/BargainSettlementDate is present, then
	 * CorporateActionGeneralInformation/EventType/Code value must be DRIP
	 * (DividendReinvestment).
	 */
	public static void check_seev_CorporateActionMovementReversalAdviceV08(CorporateActionMovementReversalAdviceV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionConfirmationdetails/CashMovementDetails/
	 * TaxVoucherDetails/BargainDate or
	 * CorporateActionConfirmationdetails/CashMovementDetails
	 * /TaxVoucherDetails/BargainSettlementDate is present, then
	 * GeneralInformation/EventType/Code value must be DRIP
	 * (DividendReinvestment).
	 */
	public static void check_seev_CorporateActionMovementConfirmationV01(CorporateActionMovementConfirmationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionConfirmationdetails/CashMovementDetails/
	 * TaxVoucherDetails/BargainDate or
	 * CorporateActionConfirmationdetails/CashMovementDetails
	 * /TaxVoucherDetails/BargainSettlementDate is present, then
	 * GeneralInformation/EventType/Code value must be DRIP
	 * (DividendReinvestment).
	 */
	public static void check_seev_CorporateActionMovementConfirmationV04(CorporateActionMovementConfirmationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionConfirmationDetails/CashMovementDetails/
	 * TaxVoucherDetails/BargainDate or
	 * CorporateActionConfirmationDetails/CashMovementDetails
	 * /TaxVoucherDetails/BargainSettlementDate is present, then
	 * CorporateActionGeneralInformation/EventType/Code value must be DRIP
	 * (DividendReinvestment).
	 */
	public static void check_seev_CorporateActionMovementConfirmationV07(CorporateActionMovementConfirmationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionConfirmationDetails/CashMovementDetails/
	 * TaxVoucherDetails/BargainDate or
	 * CorporateActionConfirmationDetails/CashMovementDetails
	 * /TaxVoucherDetails/BargainSettlementDate is present, then
	 * CorporateActionGeneralInformation/EventType/Code value must be DRIP
	 * (DividendReinvestment).
	 */
	public static void check_seev_CorporateActionMovementConfirmationV09(CorporateActionMovementConfirmationV09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionConfirmationDetails/CashMovementDetails/
	 * TaxVoucherDetails/BargainDate or
	 * CorporateActionConfirmationDetails/CashMovementDetails
	 * /TaxVoucherDetails/BargainSettlementDate is present, then
	 * CorporateActionGeneralInformation/EventType/Code value must be DRIP
	 * (DividendReinvestment).
	 */
	public static void check_seev_CorporateActionMovementReversalAdvice002V07(CorporateActionMovementReversalAdvice002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}