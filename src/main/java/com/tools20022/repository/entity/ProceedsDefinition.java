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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.NonEligibleProceedsIndicator1Choice;
import com.tools20022.repository.choice.NonEligibleProceedsIndicator2Choice;
import com.tools20022.repository.choice.NonEligibleProceedsIndicator3Choice;
import com.tools20022.repository.choice.NonEligibleProceedsIndicator4Choice;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.codeset.NonEligibleProceedsIndicatorCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Definition of exchanges of cash and/or securities available in the processing
 * of corporate actions.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ProceedsDefinition" src="doc-files/ProceedsDefinition.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#SpecialConcessionAmount
 * ProceedsDefinition.SpecialConcessionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#CreditDebitIndicator
 * ProceedsDefinition.CreditDebitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#EarliestPaymentDate
 * ProceedsDefinition.EarliestPaymentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#ValueDate
 * ProceedsDefinition.ValueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#NonEligibleProceedsIndicator
 * ProceedsDefinition.NonEligibleProceedsIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#IssuerOfferorTaxabilityIndicator
 * ProceedsDefinition.IssuerOfferorTaxabilityIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#OfferPriceFixingDate
 * ProceedsDefinition.OfferPriceFixingDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ProceedsDefinition#Option
 * ProceedsDefinition.Option}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#CorporateAction
 * ProceedsDefinition.CorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#CountryOfIncomeSource
 * ProceedsDefinition.CountryOfIncomeSource}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#ProceedsDefinition
 * CorporateActionEvent.ProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#ProceedsDefinition
 * CorporateActionOption.ProceedsDefinition}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
 * SecuritiesProceedsDefinition}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashProceedsDefinition
 * CashProceedsDefinition}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NonEligibleProceedsIndicator1Choice
 * NonEligibleProceedsIndicator1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NonEligibleProceedsIndicator2Choice
 * NonEligibleProceedsIndicator2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NonEligibleProceedsIndicator3Choice
 * NonEligibleProceedsIndicator3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NonEligibleProceedsIndicator4Choice
 * NonEligibleProceedsIndicator4Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ProceedsDefinition"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Definition of exchanges of cash and/or securities available in the processing of corporate actions."
 * </li>
 * </ul>
 */
public class ProceedsDefinition {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Amount of drawdown or other reduction from or in addition to the deal
	 * price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts12#SpecialConcession
	 * OtherAmounts12.SpecialConcession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts14#SpecialConcession
	 * OtherAmounts14.SpecialConcession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts20#SpecialConcession
	 * OtherAmounts20.SpecialConcession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts4#SpecialConcession
	 * OtherAmounts4.SpecialConcession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts5#SpecialConcession
	 * OtherAmounts5.SpecialConcession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts17#SpecialConcession
	 * OtherAmounts17.SpecialConcession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts23#SpecialConcession
	 * OtherAmounts23.SpecialConcession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts3#SpecialConcession
	 * OtherAmounts3.SpecialConcession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts7#SpecialConcession
	 * OtherAmounts7.SpecialConcession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts9#SpecialConcession
	 * OtherAmounts9.SpecialConcession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts10#SpecialConcession
	 * OtherAmounts10.SpecialConcession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts18#SpecialConcession
	 * OtherAmounts18.SpecialConcession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts24#SpecialConcession
	 * OtherAmounts24.SpecialConcession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts13#SpecialConcession
	 * OtherAmounts13.SpecialConcession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts1#SpecialConcession
	 * OtherAmounts1.SpecialConcession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#SpecialConcession
	 * OtherAmounts16.SpecialConcession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#SpecialConcessionAmount
	 * CorporateActionAmounts1.SpecialConcessionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts28#SpecialConcession
	 * OtherAmounts28.SpecialConcession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts30#SpecialConcession
	 * OtherAmounts30.SpecialConcession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts31#SpecialConcession
	 * OtherAmounts31.SpecialConcession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts35#SpecialConcession
	 * OtherAmounts35.SpecialConcession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts34#SpecialConcession
	 * OtherAmounts34.SpecialConcession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts38#SpecialConcession
	 * OtherAmounts38.SpecialConcession}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition
	 * ProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialConcessionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of drawdown or other reduction from or in addition to the deal price."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SpecialConcessionAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OtherAmounts12.SpecialConcession, com.tools20022.repository.msg.OtherAmounts14.SpecialConcession,
					com.tools20022.repository.msg.OtherAmounts20.SpecialConcession, com.tools20022.repository.msg.OtherAmounts4.SpecialConcession, com.tools20022.repository.msg.OtherAmounts5.SpecialConcession,
					com.tools20022.repository.msg.OtherAmounts17.SpecialConcession, com.tools20022.repository.msg.OtherAmounts23.SpecialConcession, com.tools20022.repository.msg.OtherAmounts3.SpecialConcession,
					com.tools20022.repository.msg.OtherAmounts7.SpecialConcession, com.tools20022.repository.msg.OtherAmounts9.SpecialConcession, com.tools20022.repository.msg.OtherAmounts10.SpecialConcession,
					com.tools20022.repository.msg.OtherAmounts18.SpecialConcession, com.tools20022.repository.msg.OtherAmounts24.SpecialConcession, com.tools20022.repository.msg.OtherAmounts13.SpecialConcession,
					com.tools20022.repository.msg.OtherAmounts1.SpecialConcession, com.tools20022.repository.msg.OtherAmounts16.SpecialConcession, com.tools20022.repository.msg.CorporateActionAmounts1.SpecialConcessionAmount,
					com.tools20022.repository.msg.OtherAmounts28.SpecialConcession, com.tools20022.repository.msg.OtherAmounts30.SpecialConcession, com.tools20022.repository.msg.OtherAmounts31.SpecialConcession,
					com.tools20022.repository.msg.OtherAmounts35.SpecialConcession, com.tools20022.repository.msg.OtherAmounts34.SpecialConcession, com.tools20022.repository.msg.OtherAmounts38.SpecialConcession);
			elementContext_lazy = () -> ProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SpecialConcessionAmount";
			definition = "Amount of drawdown or other reduction from or in addition to the deal price.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies whether the value is a debit or credit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DebitCreditCode
	 * DebitCreditCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption3#CreditDebitIndicator
	 * SecuritiesOption3.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption2#CreditDebitIndicator
	 * CashOption2.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption8#CreditDebitIndicator
	 * SecuritiesOption8.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption9#CreditDebitIndicator
	 * CashOption9.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption18#CreditDebitIndicator
	 * SecuritiesOption18.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption12#CreditDebitIndicator
	 * CashOption12.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption20#CreditDebitIndicator
	 * SecuritiesOption20.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption13#CreditDebitIndicator
	 * CashOption13.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption26#CreditDebitIndicator
	 * SecuritiesOption26.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption18#CreditDebitIndicator
	 * CashOption18.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption31#CreditDebitIndicator
	 * SecuritiesOption31.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption22#CreditDebitIndicator
	 * CashOption22.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption35#CreditDebitIndicator
	 * SecuritiesOption35.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption26#CreditDebitIndicator
	 * CashOption26.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption36#CreditDebitIndicator
	 * SecuritiesOption36.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption27#CreditDebitIndicator
	 * CashOption27.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption4#CreditDebitIndicator
	 * SecuritiesOption4.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption3#CreditDebitIndicator
	 * CashOption3.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption10#CreditDebitIndicator
	 * SecuritiesOption10.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption6#CreditDebitIndicator
	 * CashOption6.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption13#CreditDebitIndicator
	 * SecuritiesOption13.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption11#CreditDebitIndicator
	 * CashOption11.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption17#CreditDebitIndicator
	 * SecuritiesOption17.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption14#CreditDebitIndicator
	 * CashOption14.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption24#CreditDebitIndicator
	 * SecuritiesOption24.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption16#CreditDebitIndicator
	 * CashOption16.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption29#CreditDebitIndicator
	 * SecuritiesOption29.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption20#CreditDebitIndicator
	 * CashOption20.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption33#CreditDebitIndicator
	 * SecuritiesOption33.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption38#CreditDebitIndicator
	 * SecuritiesOption38.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption25#CreditDebitIndicator
	 * CashOption25.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption37#CreditDebitIndicator
	 * SecuritiesOption37.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption39#CreditDebitIndicator
	 * SecuritiesOption39.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption28#CreditDebitIndicator
	 * CashOption28.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption5#CreditDebitIndicator
	 * SecuritiesOption5.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption5#CreditDebitIndicator
	 * CashOption5.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption11#CreditDebitIndicator
	 * SecuritiesOption11.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption7#CreditDebitIndicator
	 * CashOption7.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption19#CreditDebitIndicator
	 * SecuritiesOption19.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption21#CreditDebitIndicator
	 * SecuritiesOption21.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption27#CreditDebitIndicator
	 * SecuritiesOption27.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption19#CreditDebitIndicator
	 * CashOption19.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption32#CreditDebitIndicator
	 * SecuritiesOption32.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption23#CreditDebitIndicator
	 * CashOption23.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption6#CreditDebitIndicator
	 * SecuritiesOption6.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption4#CreditDebitIndicator
	 * CashOption4.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption12#CreditDebitIndicator
	 * SecuritiesOption12.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption8#CreditDebitIndicator
	 * CashOption8.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption14#CreditDebitIndicator
	 * SecuritiesOption14.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption10#CreditDebitIndicator
	 * CashOption10.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption22#CreditDebitIndicator
	 * SecuritiesOption22.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption15#CreditDebitIndicator
	 * CashOption15.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption25#CreditDebitIndicator
	 * SecuritiesOption25.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption17#CreditDebitIndicator
	 * CashOption17.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption30#CreditDebitIndicator
	 * SecuritiesOption30.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption21#CreditDebitIndicator
	 * CashOption21.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption24#CreditDebitIndicator
	 * CashOption24.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption29#CreditDebitIndicator
	 * CashOption29.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityOption1#CreditDebitIndicator
	 * SecurityOption1.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption1#CreditDebitIndicator
	 * CashOption1.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption30#CreditDebitIndicator
	 * CashOption30.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption42#CreditDebitIndicator
	 * SecuritiesOption42.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption31#CreditDebitIndicator
	 * CashOption31.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption40#CreditDebitIndicator
	 * SecuritiesOption40.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption32#CreditDebitIndicator
	 * CashOption32.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption36#CreditDebitIndicator
	 * CashOption36.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption35#CreditDebitIndicator
	 * CashOption35.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption38#CreditDebitIndicator
	 * CashOption38.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption48#CreditDebitIndicator
	 * SecuritiesOption48.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption45#CreditDebitIndicator
	 * SecuritiesOption45.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption39#CreditDebitIndicator
	 * CashOption39.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption41#CreditDebitIndicator
	 * CashOption41.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption44#CreditDebitIndicator
	 * CashOption44.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption49#CreditDebitIndicator
	 * SecuritiesOption49.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption53#CreditDebitIndicator
	 * SecuritiesOption53.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption45#CreditDebitIndicator
	 * CashOption45.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption42#CreditDebitIndicator
	 * CashOption42.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption43#CreditDebitIndicator
	 * CashOption43.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption50#CreditDebitIndicator
	 * SecuritiesOption50.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption46#CreditDebitIndicator
	 * CashOption46.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption55#CreditDebitIndicator
	 * SecuritiesOption55.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption49#CreditDebitIndicator
	 * CashOption49.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption47#CreditDebitIndicator
	 * CashOption47.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption57#CreditDebitIndicator
	 * SecuritiesOption57.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption58#CreditDebitIndicator
	 * SecuritiesOption58.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption48#CreditDebitIndicator
	 * CashOption48.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption52#CreditDebitIndicator
	 * CashOption52.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption60#CreditDebitIndicator
	 * SecuritiesOption60.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption51#CreditDebitIndicator
	 * CashOption51.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59#CreditDebitIndicator
	 * SecuritiesOption59.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption50#CreditDebitIndicator
	 * CashOption50.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption53#CreditDebitIndicator
	 * CashOption53.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption61#CreditDebitIndicator
	 * SecuritiesOption61.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption63#CreditDebitIndicator
	 * SecuritiesOption63.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption54#CreditDebitIndicator
	 * CashOption54.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption55#CreditDebitIndicator
	 * CashOption55.CreditDebitIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition
	 * ProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether the value is a debit or credit."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CreditDebitIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesOption3.CreditDebitIndicator, com.tools20022.repository.msg.CashOption2.CreditDebitIndicator,
					com.tools20022.repository.msg.SecuritiesOption8.CreditDebitIndicator, com.tools20022.repository.msg.CashOption9.CreditDebitIndicator, com.tools20022.repository.msg.SecuritiesOption18.CreditDebitIndicator,
					com.tools20022.repository.msg.CashOption12.CreditDebitIndicator, com.tools20022.repository.msg.SecuritiesOption20.CreditDebitIndicator, com.tools20022.repository.msg.CashOption13.CreditDebitIndicator,
					com.tools20022.repository.msg.SecuritiesOption26.CreditDebitIndicator, com.tools20022.repository.msg.CashOption18.CreditDebitIndicator, com.tools20022.repository.msg.SecuritiesOption31.CreditDebitIndicator,
					com.tools20022.repository.msg.CashOption22.CreditDebitIndicator, com.tools20022.repository.msg.SecuritiesOption35.CreditDebitIndicator, com.tools20022.repository.msg.CashOption26.CreditDebitIndicator,
					com.tools20022.repository.msg.SecuritiesOption36.CreditDebitIndicator, com.tools20022.repository.msg.CashOption27.CreditDebitIndicator, com.tools20022.repository.msg.SecuritiesOption4.CreditDebitIndicator,
					com.tools20022.repository.msg.CashOption3.CreditDebitIndicator, com.tools20022.repository.msg.SecuritiesOption10.CreditDebitIndicator, com.tools20022.repository.msg.CashOption6.CreditDebitIndicator,
					com.tools20022.repository.msg.SecuritiesOption13.CreditDebitIndicator, com.tools20022.repository.msg.CashOption11.CreditDebitIndicator, com.tools20022.repository.msg.SecuritiesOption17.CreditDebitIndicator,
					com.tools20022.repository.msg.CashOption14.CreditDebitIndicator, com.tools20022.repository.msg.SecuritiesOption24.CreditDebitIndicator, com.tools20022.repository.msg.CashOption16.CreditDebitIndicator,
					com.tools20022.repository.msg.SecuritiesOption29.CreditDebitIndicator, com.tools20022.repository.msg.CashOption20.CreditDebitIndicator, com.tools20022.repository.msg.SecuritiesOption33.CreditDebitIndicator,
					com.tools20022.repository.msg.SecuritiesOption38.CreditDebitIndicator, com.tools20022.repository.msg.CashOption25.CreditDebitIndicator, com.tools20022.repository.msg.SecuritiesOption37.CreditDebitIndicator,
					com.tools20022.repository.msg.SecuritiesOption39.CreditDebitIndicator, com.tools20022.repository.msg.CashOption28.CreditDebitIndicator, com.tools20022.repository.msg.SecuritiesOption5.CreditDebitIndicator,
					com.tools20022.repository.msg.CashOption5.CreditDebitIndicator, com.tools20022.repository.msg.SecuritiesOption11.CreditDebitIndicator, com.tools20022.repository.msg.CashOption7.CreditDebitIndicator,
					com.tools20022.repository.msg.SecuritiesOption19.CreditDebitIndicator, com.tools20022.repository.msg.SecuritiesOption21.CreditDebitIndicator, com.tools20022.repository.msg.SecuritiesOption27.CreditDebitIndicator,
					com.tools20022.repository.msg.CashOption19.CreditDebitIndicator, com.tools20022.repository.msg.SecuritiesOption32.CreditDebitIndicator, com.tools20022.repository.msg.CashOption23.CreditDebitIndicator,
					com.tools20022.repository.msg.SecuritiesOption6.CreditDebitIndicator, com.tools20022.repository.msg.CashOption4.CreditDebitIndicator, com.tools20022.repository.msg.SecuritiesOption12.CreditDebitIndicator,
					com.tools20022.repository.msg.CashOption8.CreditDebitIndicator, com.tools20022.repository.msg.SecuritiesOption14.CreditDebitIndicator, com.tools20022.repository.msg.CashOption10.CreditDebitIndicator,
					com.tools20022.repository.msg.SecuritiesOption22.CreditDebitIndicator, com.tools20022.repository.msg.CashOption15.CreditDebitIndicator, com.tools20022.repository.msg.SecuritiesOption25.CreditDebitIndicator,
					com.tools20022.repository.msg.CashOption17.CreditDebitIndicator, com.tools20022.repository.msg.SecuritiesOption30.CreditDebitIndicator, com.tools20022.repository.msg.CashOption21.CreditDebitIndicator,
					com.tools20022.repository.msg.CashOption24.CreditDebitIndicator, com.tools20022.repository.msg.CashOption29.CreditDebitIndicator, com.tools20022.repository.msg.SecurityOption1.CreditDebitIndicator,
					com.tools20022.repository.msg.CashOption1.CreditDebitIndicator, com.tools20022.repository.msg.CashOption30.CreditDebitIndicator, com.tools20022.repository.msg.SecuritiesOption42.CreditDebitIndicator,
					com.tools20022.repository.msg.CashOption31.CreditDebitIndicator, com.tools20022.repository.msg.SecuritiesOption40.CreditDebitIndicator, com.tools20022.repository.msg.CashOption32.CreditDebitIndicator,
					com.tools20022.repository.msg.CashOption36.CreditDebitIndicator, com.tools20022.repository.msg.CashOption35.CreditDebitIndicator, com.tools20022.repository.msg.CashOption38.CreditDebitIndicator,
					com.tools20022.repository.msg.SecuritiesOption48.CreditDebitIndicator, com.tools20022.repository.msg.SecuritiesOption45.CreditDebitIndicator, com.tools20022.repository.msg.CashOption39.CreditDebitIndicator,
					com.tools20022.repository.msg.CashOption41.CreditDebitIndicator, com.tools20022.repository.msg.CashOption44.CreditDebitIndicator, com.tools20022.repository.msg.SecuritiesOption49.CreditDebitIndicator,
					com.tools20022.repository.msg.SecuritiesOption53.CreditDebitIndicator, com.tools20022.repository.msg.CashOption45.CreditDebitIndicator, com.tools20022.repository.msg.CashOption42.CreditDebitIndicator,
					com.tools20022.repository.msg.CashOption43.CreditDebitIndicator, com.tools20022.repository.msg.SecuritiesOption50.CreditDebitIndicator, com.tools20022.repository.msg.CashOption46.CreditDebitIndicator,
					com.tools20022.repository.msg.SecuritiesOption55.CreditDebitIndicator, com.tools20022.repository.msg.CashOption49.CreditDebitIndicator, com.tools20022.repository.msg.CashOption47.CreditDebitIndicator,
					com.tools20022.repository.msg.SecuritiesOption57.CreditDebitIndicator, com.tools20022.repository.msg.SecuritiesOption58.CreditDebitIndicator, com.tools20022.repository.msg.CashOption48.CreditDebitIndicator,
					com.tools20022.repository.msg.CashOption52.CreditDebitIndicator, com.tools20022.repository.msg.SecuritiesOption60.CreditDebitIndicator, com.tools20022.repository.msg.CashOption51.CreditDebitIndicator,
					com.tools20022.repository.msg.SecuritiesOption59.CreditDebitIndicator, com.tools20022.repository.msg.CashOption50.CreditDebitIndicator, com.tools20022.repository.msg.CashOption53.CreditDebitIndicator,
					com.tools20022.repository.msg.SecuritiesOption61.CreditDebitIndicator, com.tools20022.repository.msg.SecuritiesOption63.CreditDebitIndicator, com.tools20022.repository.msg.CashOption54.CreditDebitIndicator,
					com.tools20022.repository.msg.CashOption55.CreditDebitIndicator);
			elementContext_lazy = () -> ProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Specifies whether the value is a debit or credit.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}
	};
	/**
	 * Date on which a payment can be made, eg, if payment date is a
	 * non-business day or to indicate the first payment date of an offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate1#EarliestPaymentDate
	 * SecurityDate1.EarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate7#EarliestPaymentDate
	 * CorporateActionDate7.EarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate3#EarliestPaymentDate
	 * SecurityDate3.EarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate6#EarliestPaymentDate
	 * SecurityDate6.EarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate7#EarliestPaymentDate
	 * SecurityDate7.EarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate24#EarliestPaymentDate
	 * CorporateActionDate24.EarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate2#EarliestPaymentDate
	 * SecurityDate2.EarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate9#EarliestPaymentDate
	 * CorporateActionDate9.EarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate4#EarliestPaymentDate
	 * SecurityDate4.EarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate12#EarliestPaymentDate
	 * CorporateActionDate12.EarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate5#EarliestPaymentDate
	 * SecurityDate5.EarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate17#EarliestPaymentDate
	 * CorporateActionDate17.EarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate8#EarliestPaymentDate
	 * SecurityDate8.EarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate20#EarliestPaymentDate
	 * CorporateActionDate20.EarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate23#EarliestPaymentDate
	 * CorporateActionDate23.EarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate26#EarliestPaymentDate
	 * CorporateActionDate26.EarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate9#EarliestPaymentDate
	 * SecurityDate9.EarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate10#EarliestPaymentDate
	 * SecurityDate10.EarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate4#EarliestPaymentDate
	 * CorporateActionDate4.EarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate3#EarliestPaymentDate
	 * CorporateActionDate3.EarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate5#EarliestPaymentDate
	 * CorporateActionDate5.EarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate12#EarliestPaymentDate
	 * SecurityDate12.EarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate47#EarliestPaymentDate
	 * CorporateActionDate47.EarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate11#EarliestPaymentDate
	 * SecurityDate11.EarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate56#EarliestPaymentDate
	 * CorporateActionDate56.EarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate14#EarliestPaymentDate
	 * SecurityDate14.EarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate13#EarliestPaymentDate
	 * SecurityDate13.EarliestPaymentDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition
	 * ProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarliestPaymentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which a payment can be made, eg, if payment date is a non-business day or to indicate the first payment date of an offer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EarliestPaymentDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecurityDate1.EarliestPaymentDate, com.tools20022.repository.msg.CorporateActionDate7.EarliestPaymentDate,
					com.tools20022.repository.msg.SecurityDate3.EarliestPaymentDate, com.tools20022.repository.msg.SecurityDate6.EarliestPaymentDate, com.tools20022.repository.msg.SecurityDate7.EarliestPaymentDate,
					com.tools20022.repository.msg.CorporateActionDate24.EarliestPaymentDate, com.tools20022.repository.msg.SecurityDate2.EarliestPaymentDate, com.tools20022.repository.msg.CorporateActionDate9.EarliestPaymentDate,
					com.tools20022.repository.msg.SecurityDate4.EarliestPaymentDate, com.tools20022.repository.msg.CorporateActionDate12.EarliestPaymentDate, com.tools20022.repository.msg.SecurityDate5.EarliestPaymentDate,
					com.tools20022.repository.msg.CorporateActionDate17.EarliestPaymentDate, com.tools20022.repository.msg.SecurityDate8.EarliestPaymentDate, com.tools20022.repository.msg.CorporateActionDate20.EarliestPaymentDate,
					com.tools20022.repository.msg.CorporateActionDate23.EarliestPaymentDate, com.tools20022.repository.msg.CorporateActionDate26.EarliestPaymentDate, com.tools20022.repository.msg.SecurityDate9.EarliestPaymentDate,
					com.tools20022.repository.msg.SecurityDate10.EarliestPaymentDate, com.tools20022.repository.msg.CorporateActionDate4.EarliestPaymentDate, com.tools20022.repository.msg.CorporateActionDate3.EarliestPaymentDate,
					com.tools20022.repository.msg.CorporateActionDate5.EarliestPaymentDate, com.tools20022.repository.msg.SecurityDate12.EarliestPaymentDate, com.tools20022.repository.msg.CorporateActionDate47.EarliestPaymentDate,
					com.tools20022.repository.msg.SecurityDate11.EarliestPaymentDate, com.tools20022.repository.msg.CorporateActionDate56.EarliestPaymentDate, com.tools20022.repository.msg.SecurityDate14.EarliestPaymentDate,
					com.tools20022.repository.msg.SecurityDate13.EarliestPaymentDate);
			elementContext_lazy = () -> ProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EarliestPaymentDate";
			definition = "Date on which a payment can be made, eg, if payment date is a non-business day or to indicate the first payment date of an offer.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date/time at which assets become available to the account owner (in a
	 * credit entry), or cease to be available to the account owner (in a debit
	 * entry).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate7#ValueDate
	 * CorporateActionDate7.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate24#ValueDate
	 * CorporateActionDate24.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate9#ValueDate
	 * CorporateActionDate9.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate12#ValueDate
	 * CorporateActionDate12.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate17#ValueDate
	 * CorporateActionDate17.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate20#ValueDate
	 * CorporateActionDate20.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate23#ValueDate
	 * CorporateActionDate23.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate26#ValueDate
	 * CorporateActionDate26.ValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption5#ValueDate
	 * CashOption5.ValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption7#ValueDate
	 * CashOption7.ValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption19#ValueDate
	 * CashOption19.ValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption23#ValueDate
	 * CashOption23.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate5#ValueDate
	 * CorporateActionDate5.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate47#ValueDate
	 * CorporateActionDate47.ValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption45#ValueDate
	 * CashOption45.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate56#ValueDate
	 * CorporateActionDate56.ValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption48#ValueDate
	 * CashOption48.ValueDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition
	 * ProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which assets become available to the account owner (in a credit entry), or cease to be available to the account owner (in a debit entry)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ValueDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate7.ValueDate, com.tools20022.repository.msg.CorporateActionDate24.ValueDate, com.tools20022.repository.msg.CorporateActionDate9.ValueDate,
					com.tools20022.repository.msg.CorporateActionDate12.ValueDate, com.tools20022.repository.msg.CorporateActionDate17.ValueDate, com.tools20022.repository.msg.CorporateActionDate20.ValueDate,
					com.tools20022.repository.msg.CorporateActionDate23.ValueDate, com.tools20022.repository.msg.CorporateActionDate26.ValueDate, com.tools20022.repository.msg.CashOption5.ValueDate,
					com.tools20022.repository.msg.CashOption7.ValueDate, com.tools20022.repository.msg.CashOption19.ValueDate, com.tools20022.repository.msg.CashOption23.ValueDate,
					com.tools20022.repository.msg.CorporateActionDate5.ValueDate, com.tools20022.repository.msg.CorporateActionDate47.ValueDate, com.tools20022.repository.msg.CashOption45.ValueDate,
					com.tools20022.repository.msg.CorporateActionDate56.ValueDate, com.tools20022.repository.msg.CashOption48.ValueDate);
			elementContext_lazy = () -> ProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValueDate";
			definition = "Date/time at which assets become available to the account owner (in a credit entry), or cease to be available to the account owner (in a debit entry).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Specifies information regarding outturn resources that cannot be
	 * processed by the CSD. Special delivery instruction is required from the
	 * account owner for the CA outcome to be credited.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.NonEligibleProceedsIndicatorCode
	 * NonEligibleProceedsIndicatorCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NonEligibleProceedsIndicator1Choice#Code
	 * NonEligibleProceedsIndicator1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NonEligibleProceedsIndicator1Choice#Proprietary
	 * NonEligibleProceedsIndicator1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption4#NonEligibleProceedsIndicator
	 * SecuritiesOption4.NonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption3#NonEligibleProceedsIndicator
	 * CashOption3.NonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NonEligibleProceedsIndicator2Choice#Code
	 * NonEligibleProceedsIndicator2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NonEligibleProceedsIndicator2Choice#Proprietary
	 * NonEligibleProceedsIndicator2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption10#NonEligibleProceedsIndicator
	 * SecuritiesOption10.NonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption6#NonEligibleProceedsIndicator
	 * CashOption6.NonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption13#NonEligibleProceedsIndicator
	 * SecuritiesOption13.NonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption11#NonEligibleProceedsIndicator
	 * CashOption11.NonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption17#NonEligibleProceedsIndicator
	 * SecuritiesOption17.NonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption14#NonEligibleProceedsIndicator
	 * CashOption14.NonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption24#NonEligibleProceedsIndicator
	 * SecuritiesOption24.NonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption16#NonEligibleProceedsIndicator
	 * CashOption16.NonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption29#NonEligibleProceedsIndicator
	 * SecuritiesOption29.NonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption20#NonEligibleProceedsIndicator
	 * CashOption20.NonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption33#NonEligibleProceedsIndicator
	 * SecuritiesOption33.NonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption38#NonEligibleProceedsIndicator
	 * SecuritiesOption38.NonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption25#NonEligibleProceedsIndicator
	 * CashOption25.NonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption37#NonEligibleProceedsIndicator
	 * SecuritiesOption37.NonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption39#NonEligibleProceedsIndicator
	 * SecuritiesOption39.NonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption28#NonEligibleProceedsIndicator
	 * CashOption28.NonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption6#NonEligibleProceedsIndicator
	 * SecuritiesOption6.NonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption4#NonEligibleProceedsIndicator
	 * CashOption4.NonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption12#NonEligibleProceedsIndicator
	 * SecuritiesOption12.NonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption8#NonEligibleProceedsIndicator
	 * CashOption8.NonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption14#NonEligibleProceedsIndicator
	 * SecuritiesOption14.NonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption10#NonEligibleProceedsIndicator
	 * CashOption10.NonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption22#NonEligibleProceedsIndicator
	 * SecuritiesOption22.NonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption15#NonEligibleProceedsIndicator
	 * CashOption15.NonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption25#NonEligibleProceedsIndicator
	 * SecuritiesOption25.NonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption17#NonEligibleProceedsIndicator
	 * CashOption17.NonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption30#NonEligibleProceedsIndicator
	 * SecuritiesOption30.NonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption21#NonEligibleProceedsIndicator
	 * CashOption21.NonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption24#NonEligibleProceedsIndicator
	 * CashOption24.NonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption29#NonEligibleProceedsIndicator
	 * CashOption29.NonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption31#NonEligibleProceedsIndicator
	 * CashOption31.NonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption40#NonEligibleProceedsIndicator
	 * SecuritiesOption40.NonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption32#NonEligibleProceedsIndicator
	 * CashOption32.NonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption36#NonEligibleProceedsIndicator
	 * CashOption36.NonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption35#NonEligibleProceedsIndicator
	 * CashOption35.NonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption45#NonEligibleProceedsIndicator
	 * SecuritiesOption45.NonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NonEligibleProceedsIndicator3Choice#Code
	 * NonEligibleProceedsIndicator3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NonEligibleProceedsIndicator3Choice#Proprietary
	 * NonEligibleProceedsIndicator3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption49#NonEligibleProceedsIndicator
	 * SecuritiesOption49.NonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption42#NonEligibleProceedsIndicator
	 * CashOption42.NonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption43#NonEligibleProceedsIndicator
	 * CashOption43.NonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption49#NonEligibleProceedsIndicator
	 * CashOption49.NonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NonEligibleProceedsIndicator4Choice#Code
	 * NonEligibleProceedsIndicator4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NonEligibleProceedsIndicator4Choice#Proprietary
	 * NonEligibleProceedsIndicator4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption47#NonEligibleProceedsIndicator
	 * CashOption47.NonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption57#NonEligibleProceedsIndicator
	 * SecuritiesOption57.NonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption51#NonEligibleProceedsIndicator
	 * CashOption51.NonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59#NonEligibleProceedsIndicator
	 * SecuritiesOption59.NonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption50#NonEligibleProceedsIndicator
	 * CashOption50.NonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption53#NonEligibleProceedsIndicator
	 * CashOption53.NonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption61#NonEligibleProceedsIndicator
	 * SecuritiesOption61.NonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption54#NonEligibleProceedsIndicator
	 * CashOption54.NonEligibleProceedsIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition
	 * ProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonEligibleProceedsIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies information regarding outturn resources that cannot be processed by the CSD. Special delivery instruction is required from the account owner for the CA outcome to be credited."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute NonEligibleProceedsIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.NonEligibleProceedsIndicator1Choice.Code, com.tools20022.repository.choice.NonEligibleProceedsIndicator1Choice.Proprietary,
					com.tools20022.repository.msg.SecuritiesOption4.NonEligibleProceedsIndicator, com.tools20022.repository.msg.CashOption3.NonEligibleProceedsIndicator,
					com.tools20022.repository.choice.NonEligibleProceedsIndicator2Choice.Code, com.tools20022.repository.choice.NonEligibleProceedsIndicator2Choice.Proprietary,
					com.tools20022.repository.msg.SecuritiesOption10.NonEligibleProceedsIndicator, com.tools20022.repository.msg.CashOption6.NonEligibleProceedsIndicator,
					com.tools20022.repository.msg.SecuritiesOption13.NonEligibleProceedsIndicator, com.tools20022.repository.msg.CashOption11.NonEligibleProceedsIndicator,
					com.tools20022.repository.msg.SecuritiesOption17.NonEligibleProceedsIndicator, com.tools20022.repository.msg.CashOption14.NonEligibleProceedsIndicator,
					com.tools20022.repository.msg.SecuritiesOption24.NonEligibleProceedsIndicator, com.tools20022.repository.msg.CashOption16.NonEligibleProceedsIndicator,
					com.tools20022.repository.msg.SecuritiesOption29.NonEligibleProceedsIndicator, com.tools20022.repository.msg.CashOption20.NonEligibleProceedsIndicator,
					com.tools20022.repository.msg.SecuritiesOption33.NonEligibleProceedsIndicator, com.tools20022.repository.msg.SecuritiesOption38.NonEligibleProceedsIndicator,
					com.tools20022.repository.msg.CashOption25.NonEligibleProceedsIndicator, com.tools20022.repository.msg.SecuritiesOption37.NonEligibleProceedsIndicator,
					com.tools20022.repository.msg.SecuritiesOption39.NonEligibleProceedsIndicator, com.tools20022.repository.msg.CashOption28.NonEligibleProceedsIndicator,
					com.tools20022.repository.msg.SecuritiesOption6.NonEligibleProceedsIndicator, com.tools20022.repository.msg.CashOption4.NonEligibleProceedsIndicator,
					com.tools20022.repository.msg.SecuritiesOption12.NonEligibleProceedsIndicator, com.tools20022.repository.msg.CashOption8.NonEligibleProceedsIndicator,
					com.tools20022.repository.msg.SecuritiesOption14.NonEligibleProceedsIndicator, com.tools20022.repository.msg.CashOption10.NonEligibleProceedsIndicator,
					com.tools20022.repository.msg.SecuritiesOption22.NonEligibleProceedsIndicator, com.tools20022.repository.msg.CashOption15.NonEligibleProceedsIndicator,
					com.tools20022.repository.msg.SecuritiesOption25.NonEligibleProceedsIndicator, com.tools20022.repository.msg.CashOption17.NonEligibleProceedsIndicator,
					com.tools20022.repository.msg.SecuritiesOption30.NonEligibleProceedsIndicator, com.tools20022.repository.msg.CashOption21.NonEligibleProceedsIndicator,
					com.tools20022.repository.msg.CashOption24.NonEligibleProceedsIndicator, com.tools20022.repository.msg.CashOption29.NonEligibleProceedsIndicator, com.tools20022.repository.msg.CashOption31.NonEligibleProceedsIndicator,
					com.tools20022.repository.msg.SecuritiesOption40.NonEligibleProceedsIndicator, com.tools20022.repository.msg.CashOption32.NonEligibleProceedsIndicator,
					com.tools20022.repository.msg.CashOption36.NonEligibleProceedsIndicator, com.tools20022.repository.msg.CashOption35.NonEligibleProceedsIndicator,
					com.tools20022.repository.msg.SecuritiesOption45.NonEligibleProceedsIndicator, com.tools20022.repository.choice.NonEligibleProceedsIndicator3Choice.Code,
					com.tools20022.repository.choice.NonEligibleProceedsIndicator3Choice.Proprietary, com.tools20022.repository.msg.SecuritiesOption49.NonEligibleProceedsIndicator,
					com.tools20022.repository.msg.CashOption42.NonEligibleProceedsIndicator, com.tools20022.repository.msg.CashOption43.NonEligibleProceedsIndicator, com.tools20022.repository.msg.CashOption49.NonEligibleProceedsIndicator,
					com.tools20022.repository.choice.NonEligibleProceedsIndicator4Choice.Code, com.tools20022.repository.choice.NonEligibleProceedsIndicator4Choice.Proprietary,
					com.tools20022.repository.msg.CashOption47.NonEligibleProceedsIndicator, com.tools20022.repository.msg.SecuritiesOption57.NonEligibleProceedsIndicator,
					com.tools20022.repository.msg.CashOption51.NonEligibleProceedsIndicator, com.tools20022.repository.msg.SecuritiesOption59.NonEligibleProceedsIndicator,
					com.tools20022.repository.msg.CashOption50.NonEligibleProceedsIndicator, com.tools20022.repository.msg.CashOption53.NonEligibleProceedsIndicator,
					com.tools20022.repository.msg.SecuritiesOption61.NonEligibleProceedsIndicator, com.tools20022.repository.msg.CashOption54.NonEligibleProceedsIndicator);
			elementContext_lazy = () -> ProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NonEligibleProceedsIndicator";
			definition = "Specifies information regarding outturn resources that cannot be processed by the CSD. Special delivery instruction is required from the account owner for the CA outcome to be credited.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> NonEligibleProceedsIndicatorCode.mmObject();
		}
	};
	/**
	 * Proceeds are taxable according to the information provided by the issuer
	 * / offeror.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption24#IssuerOfferorTaxabilityIndicator
	 * SecuritiesOption24.IssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption16#IssuerOfferorTaxabilityIndicator
	 * CashOption16.IssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption29#IssuerOfferorTaxabilityIndicator
	 * SecuritiesOption29.IssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption20#IssuerOfferorTaxabilityIndicator
	 * CashOption20.IssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption33#IssuerOfferorTaxabilityIndicator
	 * SecuritiesOption33.IssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption38#IssuerOfferorTaxabilityIndicator
	 * SecuritiesOption38.IssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption25#IssuerOfferorTaxabilityIndicator
	 * CashOption25.IssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption37#IssuerOfferorTaxabilityIndicator
	 * SecuritiesOption37.IssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption39#IssuerOfferorTaxabilityIndicator
	 * SecuritiesOption39.IssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption28#IssuerOfferorTaxabilityIndicator
	 * CashOption28.IssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption25#IssuerOfferorTaxabilityIndicator
	 * SecuritiesOption25.IssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption17#IssuerOfferorTaxabilityIndicator
	 * CashOption17.IssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption30#IssuerOfferorTaxabilityIndicator
	 * SecuritiesOption30.IssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption21#IssuerOfferorTaxabilityIndicator
	 * CashOption21.IssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption24#IssuerOfferorTaxabilityIndicator
	 * CashOption24.IssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption29#IssuerOfferorTaxabilityIndicator
	 * CashOption29.IssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption31#IssuerOfferorTaxabilityIndicator
	 * CashOption31.IssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption40#IssuerOfferorTaxabilityIndicator
	 * SecuritiesOption40.IssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption32#IssuerOfferorTaxabilityIndicator
	 * CashOption32.IssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption36#IssuerOfferorTaxabilityIndicator
	 * CashOption36.IssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption35#IssuerOfferorTaxabilityIndicator
	 * CashOption35.IssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption45#IssuerOfferorTaxabilityIndicator
	 * SecuritiesOption45.IssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption44#IssuerOfferorTaxabilityIndicator
	 * CashOption44.IssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption49#IssuerOfferorTaxabilityIndicator
	 * SecuritiesOption49.IssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption42#IssuerOfferorTaxabilityIndicator
	 * CashOption42.IssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption43#IssuerOfferorTaxabilityIndicator
	 * CashOption43.IssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption50#IssuerOfferorTaxabilityIndicator
	 * SecuritiesOption50.IssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption46#IssuerOfferorTaxabilityIndicator
	 * CashOption46.IssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption55#IssuerOfferorTaxabilityIndicator
	 * SecuritiesOption55.IssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption49#IssuerOfferorTaxabilityIndicator
	 * CashOption49.IssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption47#IssuerOfferorTaxabilityIndicator
	 * CashOption47.IssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption57#IssuerOfferorTaxabilityIndicator
	 * SecuritiesOption57.IssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption52#IssuerOfferorTaxabilityIndicator
	 * CashOption52.IssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption60#IssuerOfferorTaxabilityIndicator
	 * SecuritiesOption60.IssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption51#IssuerOfferorTaxabilityIndicator
	 * CashOption51.IssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59#IssuerOfferorTaxabilityIndicator
	 * SecuritiesOption59.IssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption50#IssuerOfferorTaxabilityIndicator
	 * CashOption50.IssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption53#IssuerOfferorTaxabilityIndicator
	 * CashOption53.IssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption61#IssuerOfferorTaxabilityIndicator
	 * SecuritiesOption61.IssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption63#IssuerOfferorTaxabilityIndicator
	 * SecuritiesOption63.IssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption54#IssuerOfferorTaxabilityIndicator
	 * CashOption54.IssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption55#IssuerOfferorTaxabilityIndicator
	 * CashOption55.IssuerOfferorTaxabilityIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition
	 * ProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Proceeds are taxable according to the information provided by the issuer / offeror."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute IssuerOfferorTaxabilityIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesOption24.IssuerOfferorTaxabilityIndicator, com.tools20022.repository.msg.CashOption16.IssuerOfferorTaxabilityIndicator,
					com.tools20022.repository.msg.SecuritiesOption29.IssuerOfferorTaxabilityIndicator, com.tools20022.repository.msg.CashOption20.IssuerOfferorTaxabilityIndicator,
					com.tools20022.repository.msg.SecuritiesOption33.IssuerOfferorTaxabilityIndicator, com.tools20022.repository.msg.SecuritiesOption38.IssuerOfferorTaxabilityIndicator,
					com.tools20022.repository.msg.CashOption25.IssuerOfferorTaxabilityIndicator, com.tools20022.repository.msg.SecuritiesOption37.IssuerOfferorTaxabilityIndicator,
					com.tools20022.repository.msg.SecuritiesOption39.IssuerOfferorTaxabilityIndicator, com.tools20022.repository.msg.CashOption28.IssuerOfferorTaxabilityIndicator,
					com.tools20022.repository.msg.SecuritiesOption25.IssuerOfferorTaxabilityIndicator, com.tools20022.repository.msg.CashOption17.IssuerOfferorTaxabilityIndicator,
					com.tools20022.repository.msg.SecuritiesOption30.IssuerOfferorTaxabilityIndicator, com.tools20022.repository.msg.CashOption21.IssuerOfferorTaxabilityIndicator,
					com.tools20022.repository.msg.CashOption24.IssuerOfferorTaxabilityIndicator, com.tools20022.repository.msg.CashOption29.IssuerOfferorTaxabilityIndicator,
					com.tools20022.repository.msg.CashOption31.IssuerOfferorTaxabilityIndicator, com.tools20022.repository.msg.SecuritiesOption40.IssuerOfferorTaxabilityIndicator,
					com.tools20022.repository.msg.CashOption32.IssuerOfferorTaxabilityIndicator, com.tools20022.repository.msg.CashOption36.IssuerOfferorTaxabilityIndicator,
					com.tools20022.repository.msg.CashOption35.IssuerOfferorTaxabilityIndicator, com.tools20022.repository.msg.SecuritiesOption45.IssuerOfferorTaxabilityIndicator,
					com.tools20022.repository.msg.CashOption44.IssuerOfferorTaxabilityIndicator, com.tools20022.repository.msg.SecuritiesOption49.IssuerOfferorTaxabilityIndicator,
					com.tools20022.repository.msg.CashOption42.IssuerOfferorTaxabilityIndicator, com.tools20022.repository.msg.CashOption43.IssuerOfferorTaxabilityIndicator,
					com.tools20022.repository.msg.SecuritiesOption50.IssuerOfferorTaxabilityIndicator, com.tools20022.repository.msg.CashOption46.IssuerOfferorTaxabilityIndicator,
					com.tools20022.repository.msg.SecuritiesOption55.IssuerOfferorTaxabilityIndicator, com.tools20022.repository.msg.CashOption49.IssuerOfferorTaxabilityIndicator,
					com.tools20022.repository.msg.CashOption47.IssuerOfferorTaxabilityIndicator, com.tools20022.repository.msg.SecuritiesOption57.IssuerOfferorTaxabilityIndicator,
					com.tools20022.repository.msg.CashOption52.IssuerOfferorTaxabilityIndicator, com.tools20022.repository.msg.SecuritiesOption60.IssuerOfferorTaxabilityIndicator,
					com.tools20022.repository.msg.CashOption51.IssuerOfferorTaxabilityIndicator, com.tools20022.repository.msg.SecuritiesOption59.IssuerOfferorTaxabilityIndicator,
					com.tools20022.repository.msg.CashOption50.IssuerOfferorTaxabilityIndicator, com.tools20022.repository.msg.CashOption53.IssuerOfferorTaxabilityIndicator,
					com.tools20022.repository.msg.SecuritiesOption61.IssuerOfferorTaxabilityIndicator, com.tools20022.repository.msg.SecuritiesOption63.IssuerOfferorTaxabilityIndicator,
					com.tools20022.repository.msg.CashOption54.IssuerOfferorTaxabilityIndicator, com.tools20022.repository.msg.CashOption55.IssuerOfferorTaxabilityIndicator);
			elementContext_lazy = () -> ProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IssuerOfferorTaxabilityIndicator";
			definition = "Proceeds are taxable according to the information provided by the issuer / offeror.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Date/time at which an offer price is determined (as compared to its reset
	 * date if applicable).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#FixingDate
	 * CorporateActionDate22.FixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#FixingDate
	 * CorporateActionDate25.FixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#FixingDate
	 * CorporateActionDate27.FixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#FixingDate
	 * CorporateActionDate28.FixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#FixingDate
	 * CorporateActionDate44.FixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#FixingDate
	 * CorporateActionDate58.FixingDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition
	 * ProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfferPriceFixingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which an offer price is determined (as compared to its reset date if applicable)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OfferPriceFixingDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate22.FixingDate, com.tools20022.repository.msg.CorporateActionDate25.FixingDate,
					com.tools20022.repository.msg.CorporateActionDate27.FixingDate, com.tools20022.repository.msg.CorporateActionDate28.FixingDate, com.tools20022.repository.msg.CorporateActionDate44.FixingDate,
					com.tools20022.repository.msg.CorporateActionDate58.FixingDate);
			elementContext_lazy = () -> ProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OfferPriceFixingDate";
			definition = "Date/time at which an offer price is determined (as compared to its reset date if applicable).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Option for which proceeds are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#ProceedsDefinition
	 * CorporateActionOption.ProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption
	 * CorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition
	 * ProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Option"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Option for which proceeds are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Option = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Option";
			definition = "Option for which proceeds are specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionOption.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.ProceedsDefinition;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Corporate action for which the proceeds are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#ProceedsDefinition
	 * CorporateActionEvent.ProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition
	 * ProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Corporate action for which the proceeds are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CorporateAction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateAction";
			definition = "Corporate action for which the proceeds are specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionEvent.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.ProceedsDefinition;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates the country from which the income originates.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption44#CountryOfIncomeSource
	 * CashOption44.CountryOfIncomeSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption49#CountryOfIncomeSource
	 * SecuritiesOption49.CountryOfIncomeSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption43#CountryOfIncomeSource
	 * CashOption43.CountryOfIncomeSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption50#CountryOfIncomeSource
	 * SecuritiesOption50.CountryOfIncomeSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption46#CountryOfIncomeSource
	 * CashOption46.CountryOfIncomeSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption55#CountryOfIncomeSource
	 * SecuritiesOption55.CountryOfIncomeSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption49#CountryOfIncomeSource
	 * CashOption49.CountryOfIncomeSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption57#CountryOfIncomeSource
	 * SecuritiesOption57.CountryOfIncomeSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption52#CountryOfIncomeSource
	 * CashOption52.CountryOfIncomeSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption60#CountryOfIncomeSource
	 * SecuritiesOption60.CountryOfIncomeSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59#CountryOfIncomeSource
	 * SecuritiesOption59.CountryOfIncomeSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption50#CountryOfIncomeSource
	 * CashOption50.CountryOfIncomeSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption53#CountryOfIncomeSource
	 * CashOption53.CountryOfIncomeSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption61#CountryOfIncomeSource
	 * SecuritiesOption61.CountryOfIncomeSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption63#CountryOfIncomeSource
	 * SecuritiesOption63.CountryOfIncomeSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption55#CountryOfIncomeSource
	 * CashOption55.CountryOfIncomeSource}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition
	 * ProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountryOfIncomeSource"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the country from which the income originates."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CountryOfIncomeSource = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashOption44.CountryOfIncomeSource, com.tools20022.repository.msg.SecuritiesOption49.CountryOfIncomeSource,
					com.tools20022.repository.msg.CashOption43.CountryOfIncomeSource, com.tools20022.repository.msg.SecuritiesOption50.CountryOfIncomeSource, com.tools20022.repository.msg.CashOption46.CountryOfIncomeSource,
					com.tools20022.repository.msg.SecuritiesOption55.CountryOfIncomeSource, com.tools20022.repository.msg.CashOption49.CountryOfIncomeSource, com.tools20022.repository.msg.SecuritiesOption57.CountryOfIncomeSource,
					com.tools20022.repository.msg.CashOption52.CountryOfIncomeSource, com.tools20022.repository.msg.SecuritiesOption60.CountryOfIncomeSource, com.tools20022.repository.msg.SecuritiesOption59.CountryOfIncomeSource,
					com.tools20022.repository.msg.CashOption50.CountryOfIncomeSource, com.tools20022.repository.msg.CashOption53.CountryOfIncomeSource, com.tools20022.repository.msg.SecuritiesOption61.CountryOfIncomeSource,
					com.tools20022.repository.msg.SecuritiesOption63.CountryOfIncomeSource, com.tools20022.repository.msg.CashOption55.CountryOfIncomeSource);
			elementContext_lazy = () -> ProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CountryOfIncomeSource";
			definition = "Indicates the country from which the income originates.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ProceedsDefinition";
				definition = "Definition of exchanges of cash and/or securities available in the processing of corporate actions.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionEvent.ProceedsDefinition, com.tools20022.repository.entity.CorporateActionOption.ProceedsDefinition);
				subType_lazy = () -> Arrays.asList(SecuritiesProceedsDefinition.mmObject(), CashProceedsDefinition.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ProceedsDefinition.SpecialConcessionAmount, com.tools20022.repository.entity.ProceedsDefinition.CreditDebitIndicator,
						com.tools20022.repository.entity.ProceedsDefinition.EarliestPaymentDate, com.tools20022.repository.entity.ProceedsDefinition.ValueDate,
						com.tools20022.repository.entity.ProceedsDefinition.NonEligibleProceedsIndicator, com.tools20022.repository.entity.ProceedsDefinition.IssuerOfferorTaxabilityIndicator,
						com.tools20022.repository.entity.ProceedsDefinition.OfferPriceFixingDate, com.tools20022.repository.entity.ProceedsDefinition.Option, com.tools20022.repository.entity.ProceedsDefinition.CorporateAction,
						com.tools20022.repository.entity.ProceedsDefinition.CountryOfIncomeSource);
				derivationComponent_lazy = () -> Arrays.asList(NonEligibleProceedsIndicator1Choice.mmObject(), NonEligibleProceedsIndicator2Choice.mmObject(), NonEligibleProceedsIndicator3Choice.mmObject(),
						NonEligibleProceedsIndicator4Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}