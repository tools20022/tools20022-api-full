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
import com.tools20022.repository.msg.InvestmentAccount60;
import com.tools20022.repository.msg.InvestmentAccount63;

/**
 * One of the elements (AccountStatusUpdateInstruction, Name, Designation, Type,
 * OwnershipType, TaxExemption, StatementFrequency, ReferenceCurrency, Language,
 * IncomePreference, ReinvestmentDetails, TaxWithholdingMethod, TaxReporting,
 * LetterIntentDetails, AccumulationRightReference, RequiredSignatoriesNumber,
 * FundFamilyName, ModifiedFinancialInstrumentDetails, RoundingDetails, Account
 * Servicer, BlockedStatus, AccountUsageType, ForeignStatusCertification,
 * AccountSignatureDateTime, TransactionChannelType, InvestmentAccountCategory,
 * Pledging, Collateral, ThirdPartyRights, PowerOfAttorneyLevelOfControl,
 * AccountingStatus, OpeningDate, ClosingDate, NegativeIndicator,
 * ProcessingOrder, Liability, ModifiedInvestorProfile, FiscalYear) must be
 * present.
 */
public class ConstraintAccountElementRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63
	 * InvestmentAccount63}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountElementRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "One of the elements (AccountStatusUpdateInstruction, Name, Designation, Type, OwnershipType, TaxExemption, StatementFrequency, ReferenceCurrency, Language, IncomePreference, ReinvestmentDetails, TaxWithholdingMethod, TaxReporting, LetterIntentDetails, AccumulationRightReference, RequiredSignatoriesNumber, FundFamilyName, ModifiedFinancialInstrumentDetails, RoundingDetails, Account Servicer, BlockedStatus, AccountUsageType, ForeignStatusCertification, AccountSignatureDateTime, TransactionChannelType, InvestmentAccountCategory, Pledging, Collateral, ThirdPartyRights, PowerOfAttorneyLevelOfControl, AccountingStatus, OpeningDate, ClosingDate, NegativeIndicator, ProcessingOrder, Liability, ModifiedInvestorProfile, FiscalYear) must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<InvestmentAccount63> forInvestmentAccount63 = new MMConstraint<InvestmentAccount63>() {
		{
			validator = ConstraintAccountElementRule::checkInvestmentAccount63;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountElementRule";
			definition = "One of the elements (AccountStatusUpdateInstruction, Name, Designation, Type, OwnershipType, TaxExemption, StatementFrequency, ReferenceCurrency, Language, IncomePreference, ReinvestmentDetails, TaxWithholdingMethod, TaxReporting, LetterIntentDetails, AccumulationRightReference, RequiredSignatoriesNumber, FundFamilyName, ModifiedFinancialInstrumentDetails, RoundingDetails, Account Servicer, BlockedStatus, AccountUsageType, ForeignStatusCertification, AccountSignatureDateTime, TransactionChannelType, InvestmentAccountCategory, Pledging, Collateral, ThirdPartyRights, PowerOfAttorneyLevelOfControl, AccountingStatus, OpeningDate, ClosingDate, NegativeIndicator, ProcessingOrder, Liability, ModifiedInvestorProfile, FiscalYear) must be present.";
			owner_lazy = () -> InvestmentAccount63.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount60
	 * InvestmentAccount60}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountElementRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either AccountIdentification or Type must be present. Both may be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<InvestmentAccount60> forInvestmentAccount60 = new MMConstraint<InvestmentAccount60>() {
		{
			validator = ConstraintAccountElementRule::checkInvestmentAccount60;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountElementRule";
			definition = "Either AccountIdentification or Type must be present. Both may be present.";
			owner_lazy = () -> InvestmentAccount60.mmObject();
		}
	};

	/**
	 * One of the elements (AccountStatusUpdateInstruction, Name, Designation,
	 * Type, OwnershipType, TaxExemption, StatementFrequency, ReferenceCurrency,
	 * Language, IncomePreference, ReinvestmentDetails, TaxWithholdingMethod,
	 * TaxReporting, LetterIntentDetails, AccumulationRightReference,
	 * RequiredSignatoriesNumber, FundFamilyName,
	 * ModifiedFinancialInstrumentDetails, RoundingDetails, Account Servicer,
	 * BlockedStatus, AccountUsageType, ForeignStatusCertification,
	 * AccountSignatureDateTime, TransactionChannelType,
	 * InvestmentAccountCategory, Pledging, Collateral, ThirdPartyRights,
	 * PowerOfAttorneyLevelOfControl, AccountingStatus, OpeningDate,
	 * ClosingDate, NegativeIndicator, ProcessingOrder, Liability,
	 * ModifiedInvestorProfile, FiscalYear) must be present.
	 */
	public static void checkInvestmentAccount63(InvestmentAccount63 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either AccountIdentification or Type must be present. Both may be
	 * present.
	 */
	public static void checkInvestmentAccount60(InvestmentAccount60 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}