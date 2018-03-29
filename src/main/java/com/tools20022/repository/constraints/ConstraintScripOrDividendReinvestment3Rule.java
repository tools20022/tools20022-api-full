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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule#forCorporateActionMovementConfirmationV08
	 * ConstraintScripOrDividendReinvestment3Rule.
	 * forCorporateActionMovementConfirmationV08}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV09> forCorporateActionMovementConfirmationV09 = new MMConstraint<CorporateActionMovementConfirmationV09>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScripOrDividendReinvestment3Rule";
			definition = "If CorporateActionConfirmationDetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationDetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then CorporateActionGeneralInformation/EventType/Code value must be DRIP (DividendReinvestment).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule.forCorporateActionMovementConfirmationV08;
			owner_lazy = () -> CorporateActionMovementConfirmationV09.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementConfirmationV09 obj) throws Exception {
			checkCorporateActionMovementConfirmationV09(obj);
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
	public static final MMConstraint<CorporateActionMovementConfirmation002V09> forCorporateActionMovementConfirmation002V09 = new MMConstraint<CorporateActionMovementConfirmation002V09>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScripOrDividendReinvestment3Rule";
			definition = "If CorporateActionConfirmationDetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationDetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then CorporateActionGeneralInformation/EventType/Code value must be DRIP (DividendReinvestment).";
			owner_lazy = () -> CorporateActionMovementConfirmation002V09.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementConfirmation002V09 obj) throws Exception {
			checkCorporateActionMovementConfirmation002V09(obj);
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule#forCorporateActionMovementConfirmationV09
	 * ConstraintScripOrDividendReinvestment3Rule.
	 * forCorporateActionMovementConfirmationV09}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule#forCorporateActionMovementConfirmationV07
	 * ConstraintScripOrDividendReinvestment3Rule.
	 * forCorporateActionMovementConfirmationV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV08> forCorporateActionMovementConfirmationV08 = new MMConstraint<CorporateActionMovementConfirmationV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScripOrDividendReinvestment3Rule";
			definition = "If CorporateActionConfirmationDetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationDetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then CorporateActionGeneralInformation/EventType/Code value must be DRIP (DividendReinvestment).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule.forCorporateActionMovementConfirmationV09);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule.forCorporateActionMovementConfirmationV07;
			owner_lazy = () -> CorporateActionMovementConfirmationV08.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementConfirmationV08 obj) throws Exception {
			checkCorporateActionMovementConfirmationV08(obj);
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule#forCorporateActionMovementReversalAdviceV07
	 * ConstraintScripOrDividendReinvestment3Rule.
	 * forCorporateActionMovementReversalAdviceV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV08> forCorporateActionMovementReversalAdviceV08 = new MMConstraint<CorporateActionMovementReversalAdviceV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScripOrDividendReinvestment3Rule";
			definition = "If CorporateActionConfirmationDetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationDetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then CorporateActionGeneralInformation/EventType/Code value must be DRIP (DividendReinvestment).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule.forCorporateActionMovementReversalAdviceV07;
			owner_lazy = () -> CorporateActionMovementReversalAdviceV08.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementReversalAdviceV08 obj) throws Exception {
			checkCorporateActionMovementReversalAdviceV08(obj);
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
	public static final MMConstraint<CorporateActionMovementConfirmationV01> forCorporateActionMovementConfirmationV01 = new MMConstraint<CorporateActionMovementConfirmationV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScripOrDividendReinvestment3Rule";
			definition = "If CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then GeneralInformation/EventType/Code value must be DRIP (DividendReinvestment).";
			owner_lazy = () -> CorporateActionMovementConfirmationV01.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementConfirmationV01 obj) throws Exception {
			checkCorporateActionMovementConfirmationV01(obj);
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
	public static final MMConstraint<CorporateActionMovementConfirmationV02> forCorporateActionMovementConfirmationV02 = new MMConstraint<CorporateActionMovementConfirmationV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScripOrDividendReinvestment3Rule";
			definition = "If CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then GeneralInformation/EventType/Code value must be DRIP (DividendReinvestment).";
			owner_lazy = () -> CorporateActionMovementConfirmationV02.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementConfirmationV02 obj) throws Exception {
			checkCorporateActionMovementConfirmationV02(obj);
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
	public static final MMConstraint<CorporateActionMovementConfirmationV03> forCorporateActionMovementConfirmationV03 = new MMConstraint<CorporateActionMovementConfirmationV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScripOrDividendReinvestment3Rule";
			definition = "If CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then GeneralInformation/EventType/Code value must be DRIP (DividendReinvestment).";
			owner_lazy = () -> CorporateActionMovementConfirmationV03.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementConfirmationV03 obj) throws Exception {
			checkCorporateActionMovementConfirmationV03(obj);
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule#forCorporateActionMovementConfirmationV05
	 * ConstraintScripOrDividendReinvestment3Rule.
	 * forCorporateActionMovementConfirmationV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV04> forCorporateActionMovementConfirmationV04 = new MMConstraint<CorporateActionMovementConfirmationV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScripOrDividendReinvestment3Rule";
			definition = "If CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then GeneralInformation/EventType/Code value must be DRIP (DividendReinvestment).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule.forCorporateActionMovementConfirmationV05);
			owner_lazy = () -> CorporateActionMovementConfirmationV04.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementConfirmationV04 obj) throws Exception {
			checkCorporateActionMovementConfirmationV04(obj);
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
	public static final MMConstraint<CorporateActionMovementReversalAdviceV01> forCorporateActionMovementReversalAdviceV01 = new MMConstraint<CorporateActionMovementReversalAdviceV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScripOrDividendReinvestment3Rule";
			definition = "If CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then GeneralInformation/EventType/Code value must be DRIP (DividendReinvestment).";
			owner_lazy = () -> CorporateActionMovementReversalAdviceV01.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementReversalAdviceV01 obj) throws Exception {
			checkCorporateActionMovementReversalAdviceV01(obj);
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
	public static final MMConstraint<CorporateActionMovementReversalAdviceV02> forCorporateActionMovementReversalAdviceV02 = new MMConstraint<CorporateActionMovementReversalAdviceV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScripOrDividendReinvestment3Rule";
			definition = "If CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then GeneralInformation/EventType/Code value must be DRIP (DividendReinvestment).";
			owner_lazy = () -> CorporateActionMovementReversalAdviceV02.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementReversalAdviceV02 obj) throws Exception {
			checkCorporateActionMovementReversalAdviceV02(obj);
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
	public static final MMConstraint<CorporateActionMovementReversalAdviceV03> forCorporateActionMovementReversalAdviceV03 = new MMConstraint<CorporateActionMovementReversalAdviceV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScripOrDividendReinvestment3Rule";
			definition = "If CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then GeneralInformation/EventType/Code value must be DRIP (DividendReinvestment).";
			owner_lazy = () -> CorporateActionMovementReversalAdviceV03.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementReversalAdviceV03 obj) throws Exception {
			checkCorporateActionMovementReversalAdviceV03(obj);
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule#forCorporateActionMovementReversalAdviceV05
	 * ConstraintScripOrDividendReinvestment3Rule.
	 * forCorporateActionMovementReversalAdviceV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV04> forCorporateActionMovementReversalAdviceV04 = new MMConstraint<CorporateActionMovementReversalAdviceV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScripOrDividendReinvestment3Rule";
			definition = "If CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then GeneralInformation/EventType/Code value must be DRIP (DividendReinvestment).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule.forCorporateActionMovementReversalAdviceV05);
			owner_lazy = () -> CorporateActionMovementReversalAdviceV04.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementReversalAdviceV04 obj) throws Exception {
			checkCorporateActionMovementReversalAdviceV04(obj);
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule#forCorporateActionMovementConfirmationV06
	 * ConstraintScripOrDividendReinvestment3Rule.
	 * forCorporateActionMovementConfirmationV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule#forCorporateActionMovementConfirmationV04
	 * ConstraintScripOrDividendReinvestment3Rule.
	 * forCorporateActionMovementConfirmationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV05> forCorporateActionMovementConfirmationV05 = new MMConstraint<CorporateActionMovementConfirmationV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScripOrDividendReinvestment3Rule";
			definition = "If CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then GeneralInformation/EventType/Code value must be DRIP (DividendReinvestment).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule.forCorporateActionMovementConfirmationV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule.forCorporateActionMovementConfirmationV04;
			owner_lazy = () -> CorporateActionMovementConfirmationV05.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementConfirmationV05 obj) throws Exception {
			checkCorporateActionMovementConfirmationV05(obj);
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule#forCorporateActionMovementReversalAdviceV06
	 * ConstraintScripOrDividendReinvestment3Rule.
	 * forCorporateActionMovementReversalAdviceV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule#forCorporateActionMovementReversalAdviceV04
	 * ConstraintScripOrDividendReinvestment3Rule.
	 * forCorporateActionMovementReversalAdviceV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV05> forCorporateActionMovementReversalAdviceV05 = new MMConstraint<CorporateActionMovementReversalAdviceV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScripOrDividendReinvestment3Rule";
			definition = "If CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then GeneralInformation/EventType/Code value must be DRIP (DividendReinvestment).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule.forCorporateActionMovementReversalAdviceV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule.forCorporateActionMovementReversalAdviceV04;
			owner_lazy = () -> CorporateActionMovementReversalAdviceV05.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementReversalAdviceV05 obj) throws Exception {
			checkCorporateActionMovementReversalAdviceV05(obj);
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule#forCorporateActionMovementConfirmationV07
	 * ConstraintScripOrDividendReinvestment3Rule.
	 * forCorporateActionMovementConfirmationV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule#forCorporateActionMovementConfirmationV05
	 * ConstraintScripOrDividendReinvestment3Rule.
	 * forCorporateActionMovementConfirmationV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV06> forCorporateActionMovementConfirmationV06 = new MMConstraint<CorporateActionMovementConfirmationV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScripOrDividendReinvestment3Rule";
			definition = "If CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then GeneralInformation/EventType/Code value must be DRIP (DividendReinvestment).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule.forCorporateActionMovementConfirmationV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule.forCorporateActionMovementConfirmationV05;
			owner_lazy = () -> CorporateActionMovementConfirmationV06.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementConfirmationV06 obj) throws Exception {
			checkCorporateActionMovementConfirmationV06(obj);
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule#forCorporateActionMovementReversalAdviceV07
	 * ConstraintScripOrDividendReinvestment3Rule.
	 * forCorporateActionMovementReversalAdviceV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule#forCorporateActionMovementReversalAdviceV05
	 * ConstraintScripOrDividendReinvestment3Rule.
	 * forCorporateActionMovementReversalAdviceV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV06> forCorporateActionMovementReversalAdviceV06 = new MMConstraint<CorporateActionMovementReversalAdviceV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScripOrDividendReinvestment3Rule";
			definition = "If CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationdetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then GeneralInformation/EventType/Code value must be DRIP (DividendReinvestment).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule.forCorporateActionMovementReversalAdviceV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule.forCorporateActionMovementReversalAdviceV05;
			owner_lazy = () -> CorporateActionMovementReversalAdviceV06.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementReversalAdviceV06 obj) throws Exception {
			checkCorporateActionMovementReversalAdviceV06(obj);
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule#forCorporateActionMovementConfirmationV08
	 * ConstraintScripOrDividendReinvestment3Rule.
	 * forCorporateActionMovementConfirmationV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule#forCorporateActionMovementConfirmationV06
	 * ConstraintScripOrDividendReinvestment3Rule.
	 * forCorporateActionMovementConfirmationV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV07> forCorporateActionMovementConfirmationV07 = new MMConstraint<CorporateActionMovementConfirmationV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScripOrDividendReinvestment3Rule";
			definition = "If CorporateActionConfirmationDetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationDetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then CorporateActionGeneralInformation/EventType/Code value must be DRIP (DividendReinvestment).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule.forCorporateActionMovementConfirmationV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule.forCorporateActionMovementConfirmationV06;
			owner_lazy = () -> CorporateActionMovementConfirmationV07.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementConfirmationV07 obj) throws Exception {
			checkCorporateActionMovementConfirmationV07(obj);
		}
	};
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule#forCorporateActionMovementReversalAdviceV08
	 * ConstraintScripOrDividendReinvestment3Rule.
	 * forCorporateActionMovementReversalAdviceV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule#forCorporateActionMovementReversalAdviceV06
	 * ConstraintScripOrDividendReinvestment3Rule.
	 * forCorporateActionMovementReversalAdviceV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV07> forCorporateActionMovementReversalAdviceV07 = new MMConstraint<CorporateActionMovementReversalAdviceV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScripOrDividendReinvestment3Rule";
			definition = "If CorporateActionConfirmationDetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationDetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then CorporateActionGeneralInformation/EventType/Code value must be DRIP (DividendReinvestment).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule.forCorporateActionMovementReversalAdviceV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule.forCorporateActionMovementReversalAdviceV06;
			owner_lazy = () -> CorporateActionMovementReversalAdviceV07.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementReversalAdviceV07 obj) throws Exception {
			checkCorporateActionMovementReversalAdviceV07(obj);
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
	public static final MMConstraint<CorporateActionMovementReversalAdvice002V07> forCorporateActionMovementReversalAdvice002V07 = new MMConstraint<CorporateActionMovementReversalAdvice002V07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScripOrDividendReinvestment3Rule";
			definition = "If CorporateActionConfirmationDetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationDetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then CorporateActionGeneralInformation/EventType/Code value must be DRIP (DividendReinvestment).";
			owner_lazy = () -> CorporateActionMovementReversalAdvice002V07.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementReversalAdvice002V07 obj) throws Exception {
			checkCorporateActionMovementReversalAdvice002V07(obj);
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
	public static final MMConstraint<CorporateActionMovementConfirmation002V07> forCorporateActionMovementConfirmation002V07 = new MMConstraint<CorporateActionMovementConfirmation002V07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScripOrDividendReinvestment3Rule";
			definition = "If CorporateActionConfirmationDetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationDetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then CorporateActionGeneralInformation/EventType/Code value must be DRIP (DividendReinvestment).";
			owner_lazy = () -> CorporateActionMovementConfirmation002V07.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementConfirmation002V07 obj) throws Exception {
			checkCorporateActionMovementConfirmation002V07(obj);
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
	public static void checkCorporateActionMovementConfirmationV09(CorporateActionMovementConfirmationV09 obj) throws Exception {
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
	public static void checkCorporateActionMovementConfirmation002V09(CorporateActionMovementConfirmation002V09 obj) throws Exception {
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
	public static void checkCorporateActionMovementConfirmationV08(CorporateActionMovementConfirmationV08 obj) throws Exception {
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
	public static void checkCorporateActionMovementReversalAdviceV08(CorporateActionMovementReversalAdviceV08 obj) throws Exception {
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
	public static void checkCorporateActionMovementConfirmationV01(CorporateActionMovementConfirmationV01 obj) throws Exception {
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
	public static void checkCorporateActionMovementConfirmationV02(CorporateActionMovementConfirmationV02 obj) throws Exception {
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
	public static void checkCorporateActionMovementConfirmationV03(CorporateActionMovementConfirmationV03 obj) throws Exception {
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
	public static void checkCorporateActionMovementConfirmationV04(CorporateActionMovementConfirmationV04 obj) throws Exception {
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
	public static void checkCorporateActionMovementReversalAdviceV01(CorporateActionMovementReversalAdviceV01 obj) throws Exception {
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
	public static void checkCorporateActionMovementReversalAdviceV02(CorporateActionMovementReversalAdviceV02 obj) throws Exception {
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
	public static void checkCorporateActionMovementReversalAdviceV03(CorporateActionMovementReversalAdviceV03 obj) throws Exception {
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
	public static void checkCorporateActionMovementReversalAdviceV04(CorporateActionMovementReversalAdviceV04 obj) throws Exception {
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
	public static void checkCorporateActionMovementConfirmationV05(CorporateActionMovementConfirmationV05 obj) throws Exception {
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
	public static void checkCorporateActionMovementReversalAdviceV05(CorporateActionMovementReversalAdviceV05 obj) throws Exception {
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
	public static void checkCorporateActionMovementConfirmationV06(CorporateActionMovementConfirmationV06 obj) throws Exception {
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
	public static void checkCorporateActionMovementReversalAdviceV06(CorporateActionMovementReversalAdviceV06 obj) throws Exception {
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
	public static void checkCorporateActionMovementConfirmationV07(CorporateActionMovementConfirmationV07 obj) throws Exception {
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
	public static void checkCorporateActionMovementReversalAdviceV07(CorporateActionMovementReversalAdviceV07 obj) throws Exception {
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
	public static void checkCorporateActionMovementReversalAdvice002V07(CorporateActionMovementReversalAdvice002V07 obj) throws Exception {
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
	public static void checkCorporateActionMovementConfirmation002V07(CorporateActionMovementConfirmation002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}