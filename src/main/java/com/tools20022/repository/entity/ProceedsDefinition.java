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
 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmSpecialConcessionAmount
 * ProceedsDefinition.mmSpecialConcessionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmCreditDebitIndicator
 * ProceedsDefinition.mmCreditDebitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmEarliestPaymentDate
 * ProceedsDefinition.mmEarliestPaymentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmValueDate
 * ProceedsDefinition.mmValueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmNonEligibleProceedsIndicator
 * ProceedsDefinition.mmNonEligibleProceedsIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmIssuerOfferorTaxabilityIndicator
 * ProceedsDefinition.mmIssuerOfferorTaxabilityIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmOfferPriceFixingDate
 * ProceedsDefinition.mmOfferPriceFixingDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmOption
 * ProceedsDefinition.mmOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmCorporateAction
 * ProceedsDefinition.mmCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmCountryOfIncomeSource
 * ProceedsDefinition.mmCountryOfIncomeSource}</li>
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
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmProceedsDefinition
 * CorporateActionEvent.mmProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmProceedsDefinition
 * CorporateActionOption.mmProceedsDefinition}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected CurrencyAndAmount specialConcessionAmount;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition
	 * ProceedsDefinition}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts12#mmSpecialConcession
	 * OtherAmounts12.mmSpecialConcession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts14#mmSpecialConcession
	 * OtherAmounts14.mmSpecialConcession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts20#mmSpecialConcession
	 * OtherAmounts20.mmSpecialConcession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts4#mmSpecialConcession
	 * OtherAmounts4.mmSpecialConcession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts5#mmSpecialConcession
	 * OtherAmounts5.mmSpecialConcession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts17#mmSpecialConcession
	 * OtherAmounts17.mmSpecialConcession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts23#mmSpecialConcession
	 * OtherAmounts23.mmSpecialConcession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts3#mmSpecialConcession
	 * OtherAmounts3.mmSpecialConcession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts7#mmSpecialConcession
	 * OtherAmounts7.mmSpecialConcession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts9#mmSpecialConcession
	 * OtherAmounts9.mmSpecialConcession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts10#mmSpecialConcession
	 * OtherAmounts10.mmSpecialConcession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts18#mmSpecialConcession
	 * OtherAmounts18.mmSpecialConcession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts24#mmSpecialConcession
	 * OtherAmounts24.mmSpecialConcession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts13#mmSpecialConcession
	 * OtherAmounts13.mmSpecialConcession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts1#mmSpecialConcession
	 * OtherAmounts1.mmSpecialConcession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmSpecialConcession
	 * OtherAmounts16.mmSpecialConcession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmSpecialConcessionAmount
	 * CorporateActionAmounts1.mmSpecialConcessionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts28#mmSpecialConcession
	 * OtherAmounts28.mmSpecialConcession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts30#mmSpecialConcession
	 * OtherAmounts30.mmSpecialConcession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts31#mmSpecialConcession
	 * OtherAmounts31.mmSpecialConcession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts35#mmSpecialConcession
	 * OtherAmounts35.mmSpecialConcession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts34#mmSpecialConcession
	 * OtherAmounts34.mmSpecialConcession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts38#mmSpecialConcession
	 * OtherAmounts38.mmSpecialConcession}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmSpecialConcessionAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OtherAmounts12.mmSpecialConcession, com.tools20022.repository.msg.OtherAmounts14.mmSpecialConcession,
					com.tools20022.repository.msg.OtherAmounts20.mmSpecialConcession, com.tools20022.repository.msg.OtherAmounts4.mmSpecialConcession, com.tools20022.repository.msg.OtherAmounts5.mmSpecialConcession,
					com.tools20022.repository.msg.OtherAmounts17.mmSpecialConcession, com.tools20022.repository.msg.OtherAmounts23.mmSpecialConcession, com.tools20022.repository.msg.OtherAmounts3.mmSpecialConcession,
					com.tools20022.repository.msg.OtherAmounts7.mmSpecialConcession, com.tools20022.repository.msg.OtherAmounts9.mmSpecialConcession, com.tools20022.repository.msg.OtherAmounts10.mmSpecialConcession,
					com.tools20022.repository.msg.OtherAmounts18.mmSpecialConcession, com.tools20022.repository.msg.OtherAmounts24.mmSpecialConcession, com.tools20022.repository.msg.OtherAmounts13.mmSpecialConcession,
					com.tools20022.repository.msg.OtherAmounts1.mmSpecialConcession, com.tools20022.repository.msg.OtherAmounts16.mmSpecialConcession, com.tools20022.repository.msg.CorporateActionAmounts1.mmSpecialConcessionAmount,
					com.tools20022.repository.msg.OtherAmounts28.mmSpecialConcession, com.tools20022.repository.msg.OtherAmounts30.mmSpecialConcession, com.tools20022.repository.msg.OtherAmounts31.mmSpecialConcession,
					com.tools20022.repository.msg.OtherAmounts35.mmSpecialConcession, com.tools20022.repository.msg.OtherAmounts34.mmSpecialConcession, com.tools20022.repository.msg.OtherAmounts38.mmSpecialConcession);
			elementContext_lazy = () -> ProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SpecialConcessionAmount";
			definition = "Amount of drawdown or other reduction from or in addition to the deal price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected DebitCreditCode creditDebitIndicator;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition
	 * ProceedsDefinition}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption3#mmCreditDebitIndicator
	 * SecuritiesOption3.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption2#mmCreditDebitIndicator
	 * CashOption2.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption8#mmCreditDebitIndicator
	 * SecuritiesOption8.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption9#mmCreditDebitIndicator
	 * CashOption9.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption18#mmCreditDebitIndicator
	 * SecuritiesOption18.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption12#mmCreditDebitIndicator
	 * CashOption12.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption20#mmCreditDebitIndicator
	 * SecuritiesOption20.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption13#mmCreditDebitIndicator
	 * CashOption13.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption26#mmCreditDebitIndicator
	 * SecuritiesOption26.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption18#mmCreditDebitIndicator
	 * CashOption18.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption31#mmCreditDebitIndicator
	 * SecuritiesOption31.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption22#mmCreditDebitIndicator
	 * CashOption22.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption35#mmCreditDebitIndicator
	 * SecuritiesOption35.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption26#mmCreditDebitIndicator
	 * CashOption26.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption36#mmCreditDebitIndicator
	 * SecuritiesOption36.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption27#mmCreditDebitIndicator
	 * CashOption27.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption4#mmCreditDebitIndicator
	 * SecuritiesOption4.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption3#mmCreditDebitIndicator
	 * CashOption3.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption10#mmCreditDebitIndicator
	 * SecuritiesOption10.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption6#mmCreditDebitIndicator
	 * CashOption6.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption13#mmCreditDebitIndicator
	 * SecuritiesOption13.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption11#mmCreditDebitIndicator
	 * CashOption11.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption17#mmCreditDebitIndicator
	 * SecuritiesOption17.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption14#mmCreditDebitIndicator
	 * CashOption14.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption24#mmCreditDebitIndicator
	 * SecuritiesOption24.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption16#mmCreditDebitIndicator
	 * CashOption16.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption29#mmCreditDebitIndicator
	 * SecuritiesOption29.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption20#mmCreditDebitIndicator
	 * CashOption20.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption33#mmCreditDebitIndicator
	 * SecuritiesOption33.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption38#mmCreditDebitIndicator
	 * SecuritiesOption38.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption25#mmCreditDebitIndicator
	 * CashOption25.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption37#mmCreditDebitIndicator
	 * SecuritiesOption37.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption39#mmCreditDebitIndicator
	 * SecuritiesOption39.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption28#mmCreditDebitIndicator
	 * CashOption28.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption5#mmCreditDebitIndicator
	 * SecuritiesOption5.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption5#mmCreditDebitIndicator
	 * CashOption5.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption11#mmCreditDebitIndicator
	 * SecuritiesOption11.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption7#mmCreditDebitIndicator
	 * CashOption7.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption19#mmCreditDebitIndicator
	 * SecuritiesOption19.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption21#mmCreditDebitIndicator
	 * SecuritiesOption21.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption27#mmCreditDebitIndicator
	 * SecuritiesOption27.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption19#mmCreditDebitIndicator
	 * CashOption19.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption32#mmCreditDebitIndicator
	 * SecuritiesOption32.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption23#mmCreditDebitIndicator
	 * CashOption23.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption6#mmCreditDebitIndicator
	 * SecuritiesOption6.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption4#mmCreditDebitIndicator
	 * CashOption4.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption12#mmCreditDebitIndicator
	 * SecuritiesOption12.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption8#mmCreditDebitIndicator
	 * CashOption8.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption14#mmCreditDebitIndicator
	 * SecuritiesOption14.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption10#mmCreditDebitIndicator
	 * CashOption10.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption22#mmCreditDebitIndicator
	 * SecuritiesOption22.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption15#mmCreditDebitIndicator
	 * CashOption15.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption25#mmCreditDebitIndicator
	 * SecuritiesOption25.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption17#mmCreditDebitIndicator
	 * CashOption17.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption30#mmCreditDebitIndicator
	 * SecuritiesOption30.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption21#mmCreditDebitIndicator
	 * CashOption21.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption24#mmCreditDebitIndicator
	 * CashOption24.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption29#mmCreditDebitIndicator
	 * CashOption29.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityOption1#mmCreditDebitIndicator
	 * SecurityOption1.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption1#mmCreditDebitIndicator
	 * CashOption1.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption30#mmCreditDebitIndicator
	 * CashOption30.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption42#mmCreditDebitIndicator
	 * SecuritiesOption42.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption31#mmCreditDebitIndicator
	 * CashOption31.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption40#mmCreditDebitIndicator
	 * SecuritiesOption40.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption32#mmCreditDebitIndicator
	 * CashOption32.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption36#mmCreditDebitIndicator
	 * CashOption36.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption35#mmCreditDebitIndicator
	 * CashOption35.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption38#mmCreditDebitIndicator
	 * CashOption38.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption48#mmCreditDebitIndicator
	 * SecuritiesOption48.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption45#mmCreditDebitIndicator
	 * SecuritiesOption45.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption39#mmCreditDebitIndicator
	 * CashOption39.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption41#mmCreditDebitIndicator
	 * CashOption41.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption44#mmCreditDebitIndicator
	 * CashOption44.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption49#mmCreditDebitIndicator
	 * SecuritiesOption49.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption53#mmCreditDebitIndicator
	 * SecuritiesOption53.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption45#mmCreditDebitIndicator
	 * CashOption45.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption42#mmCreditDebitIndicator
	 * CashOption42.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption43#mmCreditDebitIndicator
	 * CashOption43.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption50#mmCreditDebitIndicator
	 * SecuritiesOption50.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption46#mmCreditDebitIndicator
	 * CashOption46.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption55#mmCreditDebitIndicator
	 * SecuritiesOption55.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption49#mmCreditDebitIndicator
	 * CashOption49.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption47#mmCreditDebitIndicator
	 * CashOption47.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption57#mmCreditDebitIndicator
	 * SecuritiesOption57.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption58#mmCreditDebitIndicator
	 * SecuritiesOption58.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption48#mmCreditDebitIndicator
	 * CashOption48.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption52#mmCreditDebitIndicator
	 * CashOption52.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption60#mmCreditDebitIndicator
	 * SecuritiesOption60.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption51#mmCreditDebitIndicator
	 * CashOption51.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59#mmCreditDebitIndicator
	 * SecuritiesOption59.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption50#mmCreditDebitIndicator
	 * CashOption50.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption53#mmCreditDebitIndicator
	 * CashOption53.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption61#mmCreditDebitIndicator
	 * SecuritiesOption61.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption63#mmCreditDebitIndicator
	 * SecuritiesOption63.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption54#mmCreditDebitIndicator
	 * CashOption54.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption55#mmCreditDebitIndicator
	 * CashOption55.mmCreditDebitIndicator}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmCreditDebitIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesOption3.mmCreditDebitIndicator, com.tools20022.repository.msg.CashOption2.mmCreditDebitIndicator,
					com.tools20022.repository.msg.SecuritiesOption8.mmCreditDebitIndicator, com.tools20022.repository.msg.CashOption9.mmCreditDebitIndicator, com.tools20022.repository.msg.SecuritiesOption18.mmCreditDebitIndicator,
					com.tools20022.repository.msg.CashOption12.mmCreditDebitIndicator, com.tools20022.repository.msg.SecuritiesOption20.mmCreditDebitIndicator, com.tools20022.repository.msg.CashOption13.mmCreditDebitIndicator,
					com.tools20022.repository.msg.SecuritiesOption26.mmCreditDebitIndicator, com.tools20022.repository.msg.CashOption18.mmCreditDebitIndicator, com.tools20022.repository.msg.SecuritiesOption31.mmCreditDebitIndicator,
					com.tools20022.repository.msg.CashOption22.mmCreditDebitIndicator, com.tools20022.repository.msg.SecuritiesOption35.mmCreditDebitIndicator, com.tools20022.repository.msg.CashOption26.mmCreditDebitIndicator,
					com.tools20022.repository.msg.SecuritiesOption36.mmCreditDebitIndicator, com.tools20022.repository.msg.CashOption27.mmCreditDebitIndicator, com.tools20022.repository.msg.SecuritiesOption4.mmCreditDebitIndicator,
					com.tools20022.repository.msg.CashOption3.mmCreditDebitIndicator, com.tools20022.repository.msg.SecuritiesOption10.mmCreditDebitIndicator, com.tools20022.repository.msg.CashOption6.mmCreditDebitIndicator,
					com.tools20022.repository.msg.SecuritiesOption13.mmCreditDebitIndicator, com.tools20022.repository.msg.CashOption11.mmCreditDebitIndicator, com.tools20022.repository.msg.SecuritiesOption17.mmCreditDebitIndicator,
					com.tools20022.repository.msg.CashOption14.mmCreditDebitIndicator, com.tools20022.repository.msg.SecuritiesOption24.mmCreditDebitIndicator, com.tools20022.repository.msg.CashOption16.mmCreditDebitIndicator,
					com.tools20022.repository.msg.SecuritiesOption29.mmCreditDebitIndicator, com.tools20022.repository.msg.CashOption20.mmCreditDebitIndicator, com.tools20022.repository.msg.SecuritiesOption33.mmCreditDebitIndicator,
					com.tools20022.repository.msg.SecuritiesOption38.mmCreditDebitIndicator, com.tools20022.repository.msg.CashOption25.mmCreditDebitIndicator, com.tools20022.repository.msg.SecuritiesOption37.mmCreditDebitIndicator,
					com.tools20022.repository.msg.SecuritiesOption39.mmCreditDebitIndicator, com.tools20022.repository.msg.CashOption28.mmCreditDebitIndicator, com.tools20022.repository.msg.SecuritiesOption5.mmCreditDebitIndicator,
					com.tools20022.repository.msg.CashOption5.mmCreditDebitIndicator, com.tools20022.repository.msg.SecuritiesOption11.mmCreditDebitIndicator, com.tools20022.repository.msg.CashOption7.mmCreditDebitIndicator,
					com.tools20022.repository.msg.SecuritiesOption19.mmCreditDebitIndicator, com.tools20022.repository.msg.SecuritiesOption21.mmCreditDebitIndicator, com.tools20022.repository.msg.SecuritiesOption27.mmCreditDebitIndicator,
					com.tools20022.repository.msg.CashOption19.mmCreditDebitIndicator, com.tools20022.repository.msg.SecuritiesOption32.mmCreditDebitIndicator, com.tools20022.repository.msg.CashOption23.mmCreditDebitIndicator,
					com.tools20022.repository.msg.SecuritiesOption6.mmCreditDebitIndicator, com.tools20022.repository.msg.CashOption4.mmCreditDebitIndicator, com.tools20022.repository.msg.SecuritiesOption12.mmCreditDebitIndicator,
					com.tools20022.repository.msg.CashOption8.mmCreditDebitIndicator, com.tools20022.repository.msg.SecuritiesOption14.mmCreditDebitIndicator, com.tools20022.repository.msg.CashOption10.mmCreditDebitIndicator,
					com.tools20022.repository.msg.SecuritiesOption22.mmCreditDebitIndicator, com.tools20022.repository.msg.CashOption15.mmCreditDebitIndicator, com.tools20022.repository.msg.SecuritiesOption25.mmCreditDebitIndicator,
					com.tools20022.repository.msg.CashOption17.mmCreditDebitIndicator, com.tools20022.repository.msg.SecuritiesOption30.mmCreditDebitIndicator, com.tools20022.repository.msg.CashOption21.mmCreditDebitIndicator,
					com.tools20022.repository.msg.CashOption24.mmCreditDebitIndicator, com.tools20022.repository.msg.CashOption29.mmCreditDebitIndicator, com.tools20022.repository.msg.SecurityOption1.mmCreditDebitIndicator,
					com.tools20022.repository.msg.CashOption1.mmCreditDebitIndicator, com.tools20022.repository.msg.CashOption30.mmCreditDebitIndicator, com.tools20022.repository.msg.SecuritiesOption42.mmCreditDebitIndicator,
					com.tools20022.repository.msg.CashOption31.mmCreditDebitIndicator, com.tools20022.repository.msg.SecuritiesOption40.mmCreditDebitIndicator, com.tools20022.repository.msg.CashOption32.mmCreditDebitIndicator,
					com.tools20022.repository.msg.CashOption36.mmCreditDebitIndicator, com.tools20022.repository.msg.CashOption35.mmCreditDebitIndicator, com.tools20022.repository.msg.CashOption38.mmCreditDebitIndicator,
					com.tools20022.repository.msg.SecuritiesOption48.mmCreditDebitIndicator, com.tools20022.repository.msg.SecuritiesOption45.mmCreditDebitIndicator, com.tools20022.repository.msg.CashOption39.mmCreditDebitIndicator,
					com.tools20022.repository.msg.CashOption41.mmCreditDebitIndicator, com.tools20022.repository.msg.CashOption44.mmCreditDebitIndicator, com.tools20022.repository.msg.SecuritiesOption49.mmCreditDebitIndicator,
					com.tools20022.repository.msg.SecuritiesOption53.mmCreditDebitIndicator, com.tools20022.repository.msg.CashOption45.mmCreditDebitIndicator, com.tools20022.repository.msg.CashOption42.mmCreditDebitIndicator,
					com.tools20022.repository.msg.CashOption43.mmCreditDebitIndicator, com.tools20022.repository.msg.SecuritiesOption50.mmCreditDebitIndicator, com.tools20022.repository.msg.CashOption46.mmCreditDebitIndicator,
					com.tools20022.repository.msg.SecuritiesOption55.mmCreditDebitIndicator, com.tools20022.repository.msg.CashOption49.mmCreditDebitIndicator, com.tools20022.repository.msg.CashOption47.mmCreditDebitIndicator,
					com.tools20022.repository.msg.SecuritiesOption57.mmCreditDebitIndicator, com.tools20022.repository.msg.SecuritiesOption58.mmCreditDebitIndicator, com.tools20022.repository.msg.CashOption48.mmCreditDebitIndicator,
					com.tools20022.repository.msg.CashOption52.mmCreditDebitIndicator, com.tools20022.repository.msg.SecuritiesOption60.mmCreditDebitIndicator, com.tools20022.repository.msg.CashOption51.mmCreditDebitIndicator,
					com.tools20022.repository.msg.SecuritiesOption59.mmCreditDebitIndicator, com.tools20022.repository.msg.CashOption50.mmCreditDebitIndicator, com.tools20022.repository.msg.CashOption53.mmCreditDebitIndicator,
					com.tools20022.repository.msg.SecuritiesOption61.mmCreditDebitIndicator, com.tools20022.repository.msg.SecuritiesOption63.mmCreditDebitIndicator, com.tools20022.repository.msg.CashOption54.mmCreditDebitIndicator,
					com.tools20022.repository.msg.CashOption55.mmCreditDebitIndicator);
			elementContext_lazy = () -> ProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Specifies whether the value is a debit or credit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}
	};
	protected ISODateTime earliestPaymentDate;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition
	 * ProceedsDefinition}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate1#mmEarliestPaymentDate
	 * SecurityDate1.mmEarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate7#mmEarliestPaymentDate
	 * CorporateActionDate7.mmEarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate3#mmEarliestPaymentDate
	 * SecurityDate3.mmEarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate6#mmEarliestPaymentDate
	 * SecurityDate6.mmEarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate7#mmEarliestPaymentDate
	 * SecurityDate7.mmEarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate24#mmEarliestPaymentDate
	 * CorporateActionDate24.mmEarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate2#mmEarliestPaymentDate
	 * SecurityDate2.mmEarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate9#mmEarliestPaymentDate
	 * CorporateActionDate9.mmEarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate4#mmEarliestPaymentDate
	 * SecurityDate4.mmEarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate12#mmEarliestPaymentDate
	 * CorporateActionDate12.mmEarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate5#mmEarliestPaymentDate
	 * SecurityDate5.mmEarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate17#mmEarliestPaymentDate
	 * CorporateActionDate17.mmEarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate8#mmEarliestPaymentDate
	 * SecurityDate8.mmEarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate20#mmEarliestPaymentDate
	 * CorporateActionDate20.mmEarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate23#mmEarliestPaymentDate
	 * CorporateActionDate23.mmEarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate26#mmEarliestPaymentDate
	 * CorporateActionDate26.mmEarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate9#mmEarliestPaymentDate
	 * SecurityDate9.mmEarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate10#mmEarliestPaymentDate
	 * SecurityDate10.mmEarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate4#mmEarliestPaymentDate
	 * CorporateActionDate4.mmEarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate3#mmEarliestPaymentDate
	 * CorporateActionDate3.mmEarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate5#mmEarliestPaymentDate
	 * CorporateActionDate5.mmEarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate12#mmEarliestPaymentDate
	 * SecurityDate12.mmEarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate47#mmEarliestPaymentDate
	 * CorporateActionDate47.mmEarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate11#mmEarliestPaymentDate
	 * SecurityDate11.mmEarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate56#mmEarliestPaymentDate
	 * CorporateActionDate56.mmEarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate14#mmEarliestPaymentDate
	 * SecurityDate14.mmEarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate13#mmEarliestPaymentDate
	 * SecurityDate13.mmEarliestPaymentDate}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmEarliestPaymentDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecurityDate1.mmEarliestPaymentDate, com.tools20022.repository.msg.CorporateActionDate7.mmEarliestPaymentDate,
					com.tools20022.repository.msg.SecurityDate3.mmEarliestPaymentDate, com.tools20022.repository.msg.SecurityDate6.mmEarliestPaymentDate, com.tools20022.repository.msg.SecurityDate7.mmEarliestPaymentDate,
					com.tools20022.repository.msg.CorporateActionDate24.mmEarliestPaymentDate, com.tools20022.repository.msg.SecurityDate2.mmEarliestPaymentDate, com.tools20022.repository.msg.CorporateActionDate9.mmEarliestPaymentDate,
					com.tools20022.repository.msg.SecurityDate4.mmEarliestPaymentDate, com.tools20022.repository.msg.CorporateActionDate12.mmEarliestPaymentDate, com.tools20022.repository.msg.SecurityDate5.mmEarliestPaymentDate,
					com.tools20022.repository.msg.CorporateActionDate17.mmEarliestPaymentDate, com.tools20022.repository.msg.SecurityDate8.mmEarliestPaymentDate, com.tools20022.repository.msg.CorporateActionDate20.mmEarliestPaymentDate,
					com.tools20022.repository.msg.CorporateActionDate23.mmEarliestPaymentDate, com.tools20022.repository.msg.CorporateActionDate26.mmEarliestPaymentDate, com.tools20022.repository.msg.SecurityDate9.mmEarliestPaymentDate,
					com.tools20022.repository.msg.SecurityDate10.mmEarliestPaymentDate, com.tools20022.repository.msg.CorporateActionDate4.mmEarliestPaymentDate, com.tools20022.repository.msg.CorporateActionDate3.mmEarliestPaymentDate,
					com.tools20022.repository.msg.CorporateActionDate5.mmEarliestPaymentDate, com.tools20022.repository.msg.SecurityDate12.mmEarliestPaymentDate, com.tools20022.repository.msg.CorporateActionDate47.mmEarliestPaymentDate,
					com.tools20022.repository.msg.SecurityDate11.mmEarliestPaymentDate, com.tools20022.repository.msg.CorporateActionDate56.mmEarliestPaymentDate, com.tools20022.repository.msg.SecurityDate14.mmEarliestPaymentDate,
					com.tools20022.repository.msg.SecurityDate13.mmEarliestPaymentDate);
			elementContext_lazy = () -> ProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EarliestPaymentDate";
			definition = "Date on which a payment can be made, eg, if payment date is a non-business day or to indicate the first payment date of an offer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime valueDate;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition
	 * ProceedsDefinition}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate7#mmValueDate
	 * CorporateActionDate7.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate24#mmValueDate
	 * CorporateActionDate24.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate9#mmValueDate
	 * CorporateActionDate9.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate12#mmValueDate
	 * CorporateActionDate12.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate17#mmValueDate
	 * CorporateActionDate17.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate20#mmValueDate
	 * CorporateActionDate20.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate23#mmValueDate
	 * CorporateActionDate23.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate26#mmValueDate
	 * CorporateActionDate26.mmValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption5#mmValueDate
	 * CashOption5.mmValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption7#mmValueDate
	 * CashOption7.mmValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption19#mmValueDate
	 * CashOption19.mmValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption23#mmValueDate
	 * CashOption23.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate5#mmValueDate
	 * CorporateActionDate5.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate47#mmValueDate
	 * CorporateActionDate47.mmValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption45#mmValueDate
	 * CashOption45.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate56#mmValueDate
	 * CorporateActionDate56.mmValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption48#mmValueDate
	 * CashOption48.mmValueDate}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmValueDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate7.mmValueDate, com.tools20022.repository.msg.CorporateActionDate24.mmValueDate,
					com.tools20022.repository.msg.CorporateActionDate9.mmValueDate, com.tools20022.repository.msg.CorporateActionDate12.mmValueDate, com.tools20022.repository.msg.CorporateActionDate17.mmValueDate,
					com.tools20022.repository.msg.CorporateActionDate20.mmValueDate, com.tools20022.repository.msg.CorporateActionDate23.mmValueDate, com.tools20022.repository.msg.CorporateActionDate26.mmValueDate,
					com.tools20022.repository.msg.CashOption5.mmValueDate, com.tools20022.repository.msg.CashOption7.mmValueDate, com.tools20022.repository.msg.CashOption19.mmValueDate,
					com.tools20022.repository.msg.CashOption23.mmValueDate, com.tools20022.repository.msg.CorporateActionDate5.mmValueDate, com.tools20022.repository.msg.CorporateActionDate47.mmValueDate,
					com.tools20022.repository.msg.CashOption45.mmValueDate, com.tools20022.repository.msg.CorporateActionDate56.mmValueDate, com.tools20022.repository.msg.CashOption48.mmValueDate);
			elementContext_lazy = () -> ProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValueDate";
			definition = "Date/time at which assets become available to the account owner (in a credit entry), or cease to be available to the account owner (in a debit entry).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected NonEligibleProceedsIndicatorCode nonEligibleProceedsIndicator;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition
	 * ProceedsDefinition}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NonEligibleProceedsIndicator1Choice#mmCode
	 * NonEligibleProceedsIndicator1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NonEligibleProceedsIndicator1Choice#mmProprietary
	 * NonEligibleProceedsIndicator1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption4#mmNonEligibleProceedsIndicator
	 * SecuritiesOption4.mmNonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption3#mmNonEligibleProceedsIndicator
	 * CashOption3.mmNonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NonEligibleProceedsIndicator2Choice#mmCode
	 * NonEligibleProceedsIndicator2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NonEligibleProceedsIndicator2Choice#mmProprietary
	 * NonEligibleProceedsIndicator2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption10#mmNonEligibleProceedsIndicator
	 * SecuritiesOption10.mmNonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption6#mmNonEligibleProceedsIndicator
	 * CashOption6.mmNonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption13#mmNonEligibleProceedsIndicator
	 * SecuritiesOption13.mmNonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption11#mmNonEligibleProceedsIndicator
	 * CashOption11.mmNonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption17#mmNonEligibleProceedsIndicator
	 * SecuritiesOption17.mmNonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption14#mmNonEligibleProceedsIndicator
	 * CashOption14.mmNonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption24#mmNonEligibleProceedsIndicator
	 * SecuritiesOption24.mmNonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption16#mmNonEligibleProceedsIndicator
	 * CashOption16.mmNonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption29#mmNonEligibleProceedsIndicator
	 * SecuritiesOption29.mmNonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption20#mmNonEligibleProceedsIndicator
	 * CashOption20.mmNonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption33#mmNonEligibleProceedsIndicator
	 * SecuritiesOption33.mmNonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption38#mmNonEligibleProceedsIndicator
	 * SecuritiesOption38.mmNonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption25#mmNonEligibleProceedsIndicator
	 * CashOption25.mmNonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption37#mmNonEligibleProceedsIndicator
	 * SecuritiesOption37.mmNonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption39#mmNonEligibleProceedsIndicator
	 * SecuritiesOption39.mmNonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption28#mmNonEligibleProceedsIndicator
	 * CashOption28.mmNonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption6#mmNonEligibleProceedsIndicator
	 * SecuritiesOption6.mmNonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption4#mmNonEligibleProceedsIndicator
	 * CashOption4.mmNonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption12#mmNonEligibleProceedsIndicator
	 * SecuritiesOption12.mmNonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption8#mmNonEligibleProceedsIndicator
	 * CashOption8.mmNonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption14#mmNonEligibleProceedsIndicator
	 * SecuritiesOption14.mmNonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption10#mmNonEligibleProceedsIndicator
	 * CashOption10.mmNonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption22#mmNonEligibleProceedsIndicator
	 * SecuritiesOption22.mmNonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption15#mmNonEligibleProceedsIndicator
	 * CashOption15.mmNonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption25#mmNonEligibleProceedsIndicator
	 * SecuritiesOption25.mmNonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption17#mmNonEligibleProceedsIndicator
	 * CashOption17.mmNonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption30#mmNonEligibleProceedsIndicator
	 * SecuritiesOption30.mmNonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption21#mmNonEligibleProceedsIndicator
	 * CashOption21.mmNonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption24#mmNonEligibleProceedsIndicator
	 * CashOption24.mmNonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption29#mmNonEligibleProceedsIndicator
	 * CashOption29.mmNonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption31#mmNonEligibleProceedsIndicator
	 * CashOption31.mmNonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption40#mmNonEligibleProceedsIndicator
	 * SecuritiesOption40.mmNonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption32#mmNonEligibleProceedsIndicator
	 * CashOption32.mmNonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption36#mmNonEligibleProceedsIndicator
	 * CashOption36.mmNonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption35#mmNonEligibleProceedsIndicator
	 * CashOption35.mmNonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption45#mmNonEligibleProceedsIndicator
	 * SecuritiesOption45.mmNonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NonEligibleProceedsIndicator3Choice#mmCode
	 * NonEligibleProceedsIndicator3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NonEligibleProceedsIndicator3Choice#mmProprietary
	 * NonEligibleProceedsIndicator3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption49#mmNonEligibleProceedsIndicator
	 * SecuritiesOption49.mmNonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption42#mmNonEligibleProceedsIndicator
	 * CashOption42.mmNonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption43#mmNonEligibleProceedsIndicator
	 * CashOption43.mmNonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption49#mmNonEligibleProceedsIndicator
	 * CashOption49.mmNonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NonEligibleProceedsIndicator4Choice#mmCode
	 * NonEligibleProceedsIndicator4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NonEligibleProceedsIndicator4Choice#mmProprietary
	 * NonEligibleProceedsIndicator4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption47#mmNonEligibleProceedsIndicator
	 * CashOption47.mmNonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption57#mmNonEligibleProceedsIndicator
	 * SecuritiesOption57.mmNonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption51#mmNonEligibleProceedsIndicator
	 * CashOption51.mmNonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59#mmNonEligibleProceedsIndicator
	 * SecuritiesOption59.mmNonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption50#mmNonEligibleProceedsIndicator
	 * CashOption50.mmNonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption53#mmNonEligibleProceedsIndicator
	 * CashOption53.mmNonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption61#mmNonEligibleProceedsIndicator
	 * SecuritiesOption61.mmNonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption54#mmNonEligibleProceedsIndicator
	 * CashOption54.mmNonEligibleProceedsIndicator}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmNonEligibleProceedsIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.NonEligibleProceedsIndicator1Choice.mmCode, com.tools20022.repository.choice.NonEligibleProceedsIndicator1Choice.mmProprietary,
					com.tools20022.repository.msg.SecuritiesOption4.mmNonEligibleProceedsIndicator, com.tools20022.repository.msg.CashOption3.mmNonEligibleProceedsIndicator,
					com.tools20022.repository.choice.NonEligibleProceedsIndicator2Choice.mmCode, com.tools20022.repository.choice.NonEligibleProceedsIndicator2Choice.mmProprietary,
					com.tools20022.repository.msg.SecuritiesOption10.mmNonEligibleProceedsIndicator, com.tools20022.repository.msg.CashOption6.mmNonEligibleProceedsIndicator,
					com.tools20022.repository.msg.SecuritiesOption13.mmNonEligibleProceedsIndicator, com.tools20022.repository.msg.CashOption11.mmNonEligibleProceedsIndicator,
					com.tools20022.repository.msg.SecuritiesOption17.mmNonEligibleProceedsIndicator, com.tools20022.repository.msg.CashOption14.mmNonEligibleProceedsIndicator,
					com.tools20022.repository.msg.SecuritiesOption24.mmNonEligibleProceedsIndicator, com.tools20022.repository.msg.CashOption16.mmNonEligibleProceedsIndicator,
					com.tools20022.repository.msg.SecuritiesOption29.mmNonEligibleProceedsIndicator, com.tools20022.repository.msg.CashOption20.mmNonEligibleProceedsIndicator,
					com.tools20022.repository.msg.SecuritiesOption33.mmNonEligibleProceedsIndicator, com.tools20022.repository.msg.SecuritiesOption38.mmNonEligibleProceedsIndicator,
					com.tools20022.repository.msg.CashOption25.mmNonEligibleProceedsIndicator, com.tools20022.repository.msg.SecuritiesOption37.mmNonEligibleProceedsIndicator,
					com.tools20022.repository.msg.SecuritiesOption39.mmNonEligibleProceedsIndicator, com.tools20022.repository.msg.CashOption28.mmNonEligibleProceedsIndicator,
					com.tools20022.repository.msg.SecuritiesOption6.mmNonEligibleProceedsIndicator, com.tools20022.repository.msg.CashOption4.mmNonEligibleProceedsIndicator,
					com.tools20022.repository.msg.SecuritiesOption12.mmNonEligibleProceedsIndicator, com.tools20022.repository.msg.CashOption8.mmNonEligibleProceedsIndicator,
					com.tools20022.repository.msg.SecuritiesOption14.mmNonEligibleProceedsIndicator, com.tools20022.repository.msg.CashOption10.mmNonEligibleProceedsIndicator,
					com.tools20022.repository.msg.SecuritiesOption22.mmNonEligibleProceedsIndicator, com.tools20022.repository.msg.CashOption15.mmNonEligibleProceedsIndicator,
					com.tools20022.repository.msg.SecuritiesOption25.mmNonEligibleProceedsIndicator, com.tools20022.repository.msg.CashOption17.mmNonEligibleProceedsIndicator,
					com.tools20022.repository.msg.SecuritiesOption30.mmNonEligibleProceedsIndicator, com.tools20022.repository.msg.CashOption21.mmNonEligibleProceedsIndicator,
					com.tools20022.repository.msg.CashOption24.mmNonEligibleProceedsIndicator, com.tools20022.repository.msg.CashOption29.mmNonEligibleProceedsIndicator,
					com.tools20022.repository.msg.CashOption31.mmNonEligibleProceedsIndicator, com.tools20022.repository.msg.SecuritiesOption40.mmNonEligibleProceedsIndicator,
					com.tools20022.repository.msg.CashOption32.mmNonEligibleProceedsIndicator, com.tools20022.repository.msg.CashOption36.mmNonEligibleProceedsIndicator,
					com.tools20022.repository.msg.CashOption35.mmNonEligibleProceedsIndicator, com.tools20022.repository.msg.SecuritiesOption45.mmNonEligibleProceedsIndicator,
					com.tools20022.repository.choice.NonEligibleProceedsIndicator3Choice.mmCode, com.tools20022.repository.choice.NonEligibleProceedsIndicator3Choice.mmProprietary,
					com.tools20022.repository.msg.SecuritiesOption49.mmNonEligibleProceedsIndicator, com.tools20022.repository.msg.CashOption42.mmNonEligibleProceedsIndicator,
					com.tools20022.repository.msg.CashOption43.mmNonEligibleProceedsIndicator, com.tools20022.repository.msg.CashOption49.mmNonEligibleProceedsIndicator,
					com.tools20022.repository.choice.NonEligibleProceedsIndicator4Choice.mmCode, com.tools20022.repository.choice.NonEligibleProceedsIndicator4Choice.mmProprietary,
					com.tools20022.repository.msg.CashOption47.mmNonEligibleProceedsIndicator, com.tools20022.repository.msg.SecuritiesOption57.mmNonEligibleProceedsIndicator,
					com.tools20022.repository.msg.CashOption51.mmNonEligibleProceedsIndicator, com.tools20022.repository.msg.SecuritiesOption59.mmNonEligibleProceedsIndicator,
					com.tools20022.repository.msg.CashOption50.mmNonEligibleProceedsIndicator, com.tools20022.repository.msg.CashOption53.mmNonEligibleProceedsIndicator,
					com.tools20022.repository.msg.SecuritiesOption61.mmNonEligibleProceedsIndicator, com.tools20022.repository.msg.CashOption54.mmNonEligibleProceedsIndicator);
			elementContext_lazy = () -> ProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NonEligibleProceedsIndicator";
			definition = "Specifies information regarding outturn resources that cannot be processed by the CSD. Special delivery instruction is required from the account owner for the CA outcome to be credited.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NonEligibleProceedsIndicatorCode.mmObject();
		}
	};
	protected Max35Text issuerOfferorTaxabilityIndicator;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition
	 * ProceedsDefinition}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption24#mmIssuerOfferorTaxabilityIndicator
	 * SecuritiesOption24.mmIssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption16#mmIssuerOfferorTaxabilityIndicator
	 * CashOption16.mmIssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption29#mmIssuerOfferorTaxabilityIndicator
	 * SecuritiesOption29.mmIssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption20#mmIssuerOfferorTaxabilityIndicator
	 * CashOption20.mmIssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption33#mmIssuerOfferorTaxabilityIndicator
	 * SecuritiesOption33.mmIssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption38#mmIssuerOfferorTaxabilityIndicator
	 * SecuritiesOption38.mmIssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption25#mmIssuerOfferorTaxabilityIndicator
	 * CashOption25.mmIssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption37#mmIssuerOfferorTaxabilityIndicator
	 * SecuritiesOption37.mmIssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption39#mmIssuerOfferorTaxabilityIndicator
	 * SecuritiesOption39.mmIssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption28#mmIssuerOfferorTaxabilityIndicator
	 * CashOption28.mmIssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption25#mmIssuerOfferorTaxabilityIndicator
	 * SecuritiesOption25.mmIssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption17#mmIssuerOfferorTaxabilityIndicator
	 * CashOption17.mmIssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption30#mmIssuerOfferorTaxabilityIndicator
	 * SecuritiesOption30.mmIssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption21#mmIssuerOfferorTaxabilityIndicator
	 * CashOption21.mmIssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption24#mmIssuerOfferorTaxabilityIndicator
	 * CashOption24.mmIssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption29#mmIssuerOfferorTaxabilityIndicator
	 * CashOption29.mmIssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption31#mmIssuerOfferorTaxabilityIndicator
	 * CashOption31.mmIssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption40#mmIssuerOfferorTaxabilityIndicator
	 * SecuritiesOption40.mmIssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption32#mmIssuerOfferorTaxabilityIndicator
	 * CashOption32.mmIssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption36#mmIssuerOfferorTaxabilityIndicator
	 * CashOption36.mmIssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption35#mmIssuerOfferorTaxabilityIndicator
	 * CashOption35.mmIssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption45#mmIssuerOfferorTaxabilityIndicator
	 * SecuritiesOption45.mmIssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption44#mmIssuerOfferorTaxabilityIndicator
	 * CashOption44.mmIssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption49#mmIssuerOfferorTaxabilityIndicator
	 * SecuritiesOption49.mmIssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption42#mmIssuerOfferorTaxabilityIndicator
	 * CashOption42.mmIssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption43#mmIssuerOfferorTaxabilityIndicator
	 * CashOption43.mmIssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption50#mmIssuerOfferorTaxabilityIndicator
	 * SecuritiesOption50.mmIssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption46#mmIssuerOfferorTaxabilityIndicator
	 * CashOption46.mmIssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption55#mmIssuerOfferorTaxabilityIndicator
	 * SecuritiesOption55.mmIssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption49#mmIssuerOfferorTaxabilityIndicator
	 * CashOption49.mmIssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption47#mmIssuerOfferorTaxabilityIndicator
	 * CashOption47.mmIssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption57#mmIssuerOfferorTaxabilityIndicator
	 * SecuritiesOption57.mmIssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption52#mmIssuerOfferorTaxabilityIndicator
	 * CashOption52.mmIssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption60#mmIssuerOfferorTaxabilityIndicator
	 * SecuritiesOption60.mmIssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption51#mmIssuerOfferorTaxabilityIndicator
	 * CashOption51.mmIssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59#mmIssuerOfferorTaxabilityIndicator
	 * SecuritiesOption59.mmIssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption50#mmIssuerOfferorTaxabilityIndicator
	 * CashOption50.mmIssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption53#mmIssuerOfferorTaxabilityIndicator
	 * CashOption53.mmIssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption61#mmIssuerOfferorTaxabilityIndicator
	 * SecuritiesOption61.mmIssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption63#mmIssuerOfferorTaxabilityIndicator
	 * SecuritiesOption63.mmIssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption54#mmIssuerOfferorTaxabilityIndicator
	 * CashOption54.mmIssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption55#mmIssuerOfferorTaxabilityIndicator
	 * CashOption55.mmIssuerOfferorTaxabilityIndicator}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmIssuerOfferorTaxabilityIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesOption24.mmIssuerOfferorTaxabilityIndicator, com.tools20022.repository.msg.CashOption16.mmIssuerOfferorTaxabilityIndicator,
					com.tools20022.repository.msg.SecuritiesOption29.mmIssuerOfferorTaxabilityIndicator, com.tools20022.repository.msg.CashOption20.mmIssuerOfferorTaxabilityIndicator,
					com.tools20022.repository.msg.SecuritiesOption33.mmIssuerOfferorTaxabilityIndicator, com.tools20022.repository.msg.SecuritiesOption38.mmIssuerOfferorTaxabilityIndicator,
					com.tools20022.repository.msg.CashOption25.mmIssuerOfferorTaxabilityIndicator, com.tools20022.repository.msg.SecuritiesOption37.mmIssuerOfferorTaxabilityIndicator,
					com.tools20022.repository.msg.SecuritiesOption39.mmIssuerOfferorTaxabilityIndicator, com.tools20022.repository.msg.CashOption28.mmIssuerOfferorTaxabilityIndicator,
					com.tools20022.repository.msg.SecuritiesOption25.mmIssuerOfferorTaxabilityIndicator, com.tools20022.repository.msg.CashOption17.mmIssuerOfferorTaxabilityIndicator,
					com.tools20022.repository.msg.SecuritiesOption30.mmIssuerOfferorTaxabilityIndicator, com.tools20022.repository.msg.CashOption21.mmIssuerOfferorTaxabilityIndicator,
					com.tools20022.repository.msg.CashOption24.mmIssuerOfferorTaxabilityIndicator, com.tools20022.repository.msg.CashOption29.mmIssuerOfferorTaxabilityIndicator,
					com.tools20022.repository.msg.CashOption31.mmIssuerOfferorTaxabilityIndicator, com.tools20022.repository.msg.SecuritiesOption40.mmIssuerOfferorTaxabilityIndicator,
					com.tools20022.repository.msg.CashOption32.mmIssuerOfferorTaxabilityIndicator, com.tools20022.repository.msg.CashOption36.mmIssuerOfferorTaxabilityIndicator,
					com.tools20022.repository.msg.CashOption35.mmIssuerOfferorTaxabilityIndicator, com.tools20022.repository.msg.SecuritiesOption45.mmIssuerOfferorTaxabilityIndicator,
					com.tools20022.repository.msg.CashOption44.mmIssuerOfferorTaxabilityIndicator, com.tools20022.repository.msg.SecuritiesOption49.mmIssuerOfferorTaxabilityIndicator,
					com.tools20022.repository.msg.CashOption42.mmIssuerOfferorTaxabilityIndicator, com.tools20022.repository.msg.CashOption43.mmIssuerOfferorTaxabilityIndicator,
					com.tools20022.repository.msg.SecuritiesOption50.mmIssuerOfferorTaxabilityIndicator, com.tools20022.repository.msg.CashOption46.mmIssuerOfferorTaxabilityIndicator,
					com.tools20022.repository.msg.SecuritiesOption55.mmIssuerOfferorTaxabilityIndicator, com.tools20022.repository.msg.CashOption49.mmIssuerOfferorTaxabilityIndicator,
					com.tools20022.repository.msg.CashOption47.mmIssuerOfferorTaxabilityIndicator, com.tools20022.repository.msg.SecuritiesOption57.mmIssuerOfferorTaxabilityIndicator,
					com.tools20022.repository.msg.CashOption52.mmIssuerOfferorTaxabilityIndicator, com.tools20022.repository.msg.SecuritiesOption60.mmIssuerOfferorTaxabilityIndicator,
					com.tools20022.repository.msg.CashOption51.mmIssuerOfferorTaxabilityIndicator, com.tools20022.repository.msg.SecuritiesOption59.mmIssuerOfferorTaxabilityIndicator,
					com.tools20022.repository.msg.CashOption50.mmIssuerOfferorTaxabilityIndicator, com.tools20022.repository.msg.CashOption53.mmIssuerOfferorTaxabilityIndicator,
					com.tools20022.repository.msg.SecuritiesOption61.mmIssuerOfferorTaxabilityIndicator, com.tools20022.repository.msg.SecuritiesOption63.mmIssuerOfferorTaxabilityIndicator,
					com.tools20022.repository.msg.CashOption54.mmIssuerOfferorTaxabilityIndicator, com.tools20022.repository.msg.CashOption55.mmIssuerOfferorTaxabilityIndicator);
			elementContext_lazy = () -> ProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IssuerOfferorTaxabilityIndicator";
			definition = "Proceeds are taxable according to the information provided by the issuer / offeror.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ISODateTime offerPriceFixingDate;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition
	 * ProceedsDefinition}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#mmFixingDate
	 * CorporateActionDate22.mmFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#mmFixingDate
	 * CorporateActionDate25.mmFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmFixingDate
	 * CorporateActionDate27.mmFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#mmFixingDate
	 * CorporateActionDate28.mmFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmFixingDate
	 * CorporateActionDate44.mmFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmFixingDate
	 * CorporateActionDate58.mmFixingDate}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmOfferPriceFixingDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate22.mmFixingDate, com.tools20022.repository.msg.CorporateActionDate25.mmFixingDate,
					com.tools20022.repository.msg.CorporateActionDate27.mmFixingDate, com.tools20022.repository.msg.CorporateActionDate28.mmFixingDate, com.tools20022.repository.msg.CorporateActionDate44.mmFixingDate,
					com.tools20022.repository.msg.CorporateActionDate58.mmFixingDate);
			elementContext_lazy = () -> ProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OfferPriceFixingDate";
			definition = "Date/time at which an offer price is determined (as compared to its reset date if applicable).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected CorporateActionOption option;
	/**
	 * Option for which proceeds are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmProceedsDefinition
	 * CorporateActionOption.mmProceedsDefinition}</li>
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
	public static final MMBusinessAssociationEnd mmOption = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Option";
			definition = "Option for which proceeds are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmProceedsDefinition;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
		}
	};
	protected CorporateActionEvent corporateAction;
	/**
	 * Corporate action for which the proceeds are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmProceedsDefinition
	 * CorporateActionEvent.mmProceedsDefinition}</li>
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
	public static final MMBusinessAssociationEnd mmCorporateAction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateAction";
			definition = "Corporate action for which the proceeds are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmProceedsDefinition;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
		}
	};
	protected CountryCode countryOfIncomeSource;
	/**
	 * Indicates the country from which the income originates.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition
	 * ProceedsDefinition}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption44#mmCountryOfIncomeSource
	 * CashOption44.mmCountryOfIncomeSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption49#mmCountryOfIncomeSource
	 * SecuritiesOption49.mmCountryOfIncomeSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption43#mmCountryOfIncomeSource
	 * CashOption43.mmCountryOfIncomeSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption50#mmCountryOfIncomeSource
	 * SecuritiesOption50.mmCountryOfIncomeSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption46#mmCountryOfIncomeSource
	 * CashOption46.mmCountryOfIncomeSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption55#mmCountryOfIncomeSource
	 * SecuritiesOption55.mmCountryOfIncomeSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption49#mmCountryOfIncomeSource
	 * CashOption49.mmCountryOfIncomeSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption57#mmCountryOfIncomeSource
	 * SecuritiesOption57.mmCountryOfIncomeSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption52#mmCountryOfIncomeSource
	 * CashOption52.mmCountryOfIncomeSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption60#mmCountryOfIncomeSource
	 * SecuritiesOption60.mmCountryOfIncomeSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59#mmCountryOfIncomeSource
	 * SecuritiesOption59.mmCountryOfIncomeSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption50#mmCountryOfIncomeSource
	 * CashOption50.mmCountryOfIncomeSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption53#mmCountryOfIncomeSource
	 * CashOption53.mmCountryOfIncomeSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption61#mmCountryOfIncomeSource
	 * SecuritiesOption61.mmCountryOfIncomeSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption63#mmCountryOfIncomeSource
	 * SecuritiesOption63.mmCountryOfIncomeSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption55#mmCountryOfIncomeSource
	 * CashOption55.mmCountryOfIncomeSource}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmCountryOfIncomeSource = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashOption44.mmCountryOfIncomeSource, com.tools20022.repository.msg.SecuritiesOption49.mmCountryOfIncomeSource,
					com.tools20022.repository.msg.CashOption43.mmCountryOfIncomeSource, com.tools20022.repository.msg.SecuritiesOption50.mmCountryOfIncomeSource, com.tools20022.repository.msg.CashOption46.mmCountryOfIncomeSource,
					com.tools20022.repository.msg.SecuritiesOption55.mmCountryOfIncomeSource, com.tools20022.repository.msg.CashOption49.mmCountryOfIncomeSource, com.tools20022.repository.msg.SecuritiesOption57.mmCountryOfIncomeSource,
					com.tools20022.repository.msg.CashOption52.mmCountryOfIncomeSource, com.tools20022.repository.msg.SecuritiesOption60.mmCountryOfIncomeSource, com.tools20022.repository.msg.SecuritiesOption59.mmCountryOfIncomeSource,
					com.tools20022.repository.msg.CashOption50.mmCountryOfIncomeSource, com.tools20022.repository.msg.CashOption53.mmCountryOfIncomeSource, com.tools20022.repository.msg.SecuritiesOption61.mmCountryOfIncomeSource,
					com.tools20022.repository.msg.SecuritiesOption63.mmCountryOfIncomeSource, com.tools20022.repository.msg.CashOption55.mmCountryOfIncomeSource);
			elementContext_lazy = () -> ProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CountryOfIncomeSource";
			definition = "Indicates the country from which the income originates.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ProceedsDefinition";
				definition = "Definition of exchanges of cash and/or securities available in the processing of corporate actions.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionEvent.mmProceedsDefinition, com.tools20022.repository.entity.CorporateActionOption.mmProceedsDefinition);
				subType_lazy = () -> Arrays.asList(SecuritiesProceedsDefinition.mmObject(), CashProceedsDefinition.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ProceedsDefinition.mmSpecialConcessionAmount, com.tools20022.repository.entity.ProceedsDefinition.mmCreditDebitIndicator,
						com.tools20022.repository.entity.ProceedsDefinition.mmEarliestPaymentDate, com.tools20022.repository.entity.ProceedsDefinition.mmValueDate,
						com.tools20022.repository.entity.ProceedsDefinition.mmNonEligibleProceedsIndicator, com.tools20022.repository.entity.ProceedsDefinition.mmIssuerOfferorTaxabilityIndicator,
						com.tools20022.repository.entity.ProceedsDefinition.mmOfferPriceFixingDate, com.tools20022.repository.entity.ProceedsDefinition.mmOption, com.tools20022.repository.entity.ProceedsDefinition.mmCorporateAction,
						com.tools20022.repository.entity.ProceedsDefinition.mmCountryOfIncomeSource);
				derivationComponent_lazy = () -> Arrays.asList(NonEligibleProceedsIndicator1Choice.mmObject(), NonEligibleProceedsIndicator2Choice.mmObject(), NonEligibleProceedsIndicator3Choice.mmObject(),
						NonEligibleProceedsIndicator4Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getSpecialConcessionAmount() {
		return specialConcessionAmount;
	}

	public void setSpecialConcessionAmount(CurrencyAndAmount specialConcessionAmount) {
		this.specialConcessionAmount = specialConcessionAmount;
	}

	public DebitCreditCode getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public void setCreditDebitIndicator(DebitCreditCode creditDebitIndicator) {
		this.creditDebitIndicator = creditDebitIndicator;
	}

	public ISODateTime getEarliestPaymentDate() {
		return earliestPaymentDate;
	}

	public void setEarliestPaymentDate(ISODateTime earliestPaymentDate) {
		this.earliestPaymentDate = earliestPaymentDate;
	}

	public ISODateTime getValueDate() {
		return valueDate;
	}

	public void setValueDate(ISODateTime valueDate) {
		this.valueDate = valueDate;
	}

	public NonEligibleProceedsIndicatorCode getNonEligibleProceedsIndicator() {
		return nonEligibleProceedsIndicator;
	}

	public void setNonEligibleProceedsIndicator(NonEligibleProceedsIndicatorCode nonEligibleProceedsIndicator) {
		this.nonEligibleProceedsIndicator = nonEligibleProceedsIndicator;
	}

	public Max35Text getIssuerOfferorTaxabilityIndicator() {
		return issuerOfferorTaxabilityIndicator;
	}

	public void setIssuerOfferorTaxabilityIndicator(Max35Text issuerOfferorTaxabilityIndicator) {
		this.issuerOfferorTaxabilityIndicator = issuerOfferorTaxabilityIndicator;
	}

	public ISODateTime getOfferPriceFixingDate() {
		return offerPriceFixingDate;
	}

	public void setOfferPriceFixingDate(ISODateTime offerPriceFixingDate) {
		this.offerPriceFixingDate = offerPriceFixingDate;
	}

	public CorporateActionOption getOption() {
		return option;
	}

	public void setOption(com.tools20022.repository.entity.CorporateActionOption option) {
		this.option = option;
	}

	public CorporateActionEvent getCorporateAction() {
		return corporateAction;
	}

	public void setCorporateAction(com.tools20022.repository.entity.CorporateActionEvent corporateAction) {
		this.corporateAction = corporateAction;
	}

	public CountryCode getCountryOfIncomeSource() {
		return countryOfIncomeSource;
	}

	public void setCountryOfIncomeSource(CountryCode countryOfIncomeSource) {
		this.countryOfIncomeSource = countryOfIncomeSource;
	}
}