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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.codeset.DistributionInstructionTypeCode;
import com.tools20022.repository.codeset.DistributionTypeCode;
import com.tools20022.repository.codeset.RoundingDirectionCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.msg.CorporateActionMovement1;
import com.tools20022.repository.msg.GlobalDistributionRequest1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Distribution of the proceeds of a CA event.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CorporateActionDistribution"
 * src="doc-files/CorporateActionDistribution.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#PostingQuantity
 * CorporateActionDistribution.PostingQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#PostingDateTime
 * CorporateActionDistribution.PostingDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#MovementDate
 * CorporateActionDistribution.MovementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#PostingAmount
 * CorporateActionDistribution.PostingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#TaxVoucher
 * CorporateActionDistribution.TaxVoucher}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#RelatedServicing
 * CorporateActionDistribution.RelatedServicing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#OrderType
 * CorporateActionDistribution.OrderType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#MovementType
 * CorporateActionDistribution.MovementType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#HighPriorityIndicator
 * CorporateActionDistribution.HighPriorityIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#RequestedExecutionDate
 * CorporateActionDistribution.RequestedExecutionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#FractionTreatment
 * CorporateActionDistribution.FractionTreatment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#CreditDebitIndicator
 * CorporateActionDistribution.CreditDebitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#Option
 * CorporateActionDistribution.Option}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#NetAmount
 * CorporateActionDistribution.NetAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#GrossAmount
 * CorporateActionDistribution.GrossAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#FinancialTransaction
 * CorporateActionDistribution.FinancialTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#CorporateActionProceedsDeliveryInstruction
 * CorporateActionDistribution.CorporateActionProceedsDeliveryInstruction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#CorporateActionDistribution
 * SecuritiesQuantity.CorporateActionDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#Distribution
 * CorporateActionOption.Distribution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxVoucher#Distribution
 * TaxVoucher.Distribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#CorporateActionDistribution
 * CorporateActionServicing.CorporateActionDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#RelatedDistribution
 * CorporateActionProceedsDeliveryInstruction.RelatedDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FinancialTransaction#CorporateActionDistribution
 * FinancialTransaction.CorporateActionDistribution}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DistributionTypeFormat1Choice
 * DistributionTypeFormat1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DistributionTypeFormat2Choice
 * DistributionTypeFormat2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DistributionTypeFormat3Choice
 * DistributionTypeFormat3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DistributionType1FormatChoice
 * DistributionType1FormatChoice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GlobalDistributionRequest1
 * GlobalDistributionRequest1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionMovement1
 * CorporateActionMovement1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DistributionTypeFormat4Choice
 * DistributionTypeFormat4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DistributionTypeFormat6Choice
 * DistributionTypeFormat6Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DistributionTypeFormat7Choice
 * DistributionTypeFormat7Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DistributionTypeFormat8Choice
 * DistributionTypeFormat8Choice}</li>
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
 * "CorporateActionDistribution"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Distribution of the proceeds of a CA event."</li>
 * </ul>
 */
public class CorporateActionDistribution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Quantity of securities that have been posted (credit or debit) to the
	 * account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#CorporateActionDistribution
	 * SecuritiesQuantity.CorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption3#PostingQuantity
	 * SecuritiesOption3.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption8#PostingQuantity
	 * SecuritiesOption8.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption18#PostingQuantity
	 * SecuritiesOption18.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption20#PostingQuantity
	 * SecuritiesOption20.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption26#PostingQuantity
	 * SecuritiesOption26.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption31#PostingQuantity
	 * SecuritiesOption31.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption35#PostingQuantity
	 * SecuritiesOption35.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption36#PostingQuantity
	 * SecuritiesOption36.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption5#PostingQuantity
	 * SecuritiesOption5.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption11#PostingQuantity
	 * SecuritiesOption11.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption19#PostingQuantity
	 * SecuritiesOption19.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption21#PostingQuantity
	 * SecuritiesOption21.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption27#PostingQuantity
	 * SecuritiesOption27.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption32#PostingQuantity
	 * SecuritiesOption32.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSecuritiesMovement2#PostingQuantity
	 * CorporateActionSecuritiesMovement2.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovement1#ConfirmedBalanceSecuritiesQuantity
	 * CorporateActionMovement1.ConfirmedBalanceSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesProceeds1#PostingQuantity
	 * SecuritiesProceeds1.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption42#PostingQuantity
	 * SecuritiesOption42.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption48#PostingQuantity
	 * SecuritiesOption48.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption53#PostingQuantity
	 * SecuritiesOption53.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption50#PostingQuantity
	 * SecuritiesOption50.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption55#PostingQuantity
	 * SecuritiesOption55.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption58#PostingQuantity
	 * SecuritiesOption58.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption60#PostingQuantity
	 * SecuritiesOption60.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption63#PostingQuantity
	 * SecuritiesOption63.PostingQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostingQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of securities that have been posted (credit or debit) to the account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PostingQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesOption3.PostingQuantity, com.tools20022.repository.msg.SecuritiesOption8.PostingQuantity,
					com.tools20022.repository.msg.SecuritiesOption18.PostingQuantity, com.tools20022.repository.msg.SecuritiesOption20.PostingQuantity, com.tools20022.repository.msg.SecuritiesOption26.PostingQuantity,
					com.tools20022.repository.msg.SecuritiesOption31.PostingQuantity, com.tools20022.repository.msg.SecuritiesOption35.PostingQuantity, com.tools20022.repository.msg.SecuritiesOption36.PostingQuantity,
					com.tools20022.repository.msg.SecuritiesOption5.PostingQuantity, com.tools20022.repository.msg.SecuritiesOption11.PostingQuantity, com.tools20022.repository.msg.SecuritiesOption19.PostingQuantity,
					com.tools20022.repository.msg.SecuritiesOption21.PostingQuantity, com.tools20022.repository.msg.SecuritiesOption27.PostingQuantity, com.tools20022.repository.msg.SecuritiesOption32.PostingQuantity,
					com.tools20022.repository.msg.CorporateActionSecuritiesMovement2.PostingQuantity, com.tools20022.repository.msg.CorporateActionMovement1.ConfirmedBalanceSecuritiesQuantity,
					com.tools20022.repository.msg.SecuritiesProceeds1.PostingQuantity, com.tools20022.repository.msg.SecuritiesOption42.PostingQuantity, com.tools20022.repository.msg.SecuritiesOption48.PostingQuantity,
					com.tools20022.repository.msg.SecuritiesOption53.PostingQuantity, com.tools20022.repository.msg.SecuritiesOption50.PostingQuantity, com.tools20022.repository.msg.SecuritiesOption55.PostingQuantity,
					com.tools20022.repository.msg.SecuritiesOption58.PostingQuantity, com.tools20022.repository.msg.SecuritiesOption60.PostingQuantity, com.tools20022.repository.msg.SecuritiesOption63.PostingQuantity);
			elementContext_lazy = () -> CorporateActionDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PostingQuantity";
			definition = "Quantity of securities that have been posted (credit or debit) to the account.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.CorporateActionDistribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date of the posting (credit or debit) to the account.
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
	 * <li>{@linkplain com.tools20022.repository.msg.SecurityDate1#PostingDate
	 * SecurityDate1.PostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate7#PostingDate
	 * CorporateActionDate7.PostingDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecurityDate3#PostingDate
	 * SecurityDate3.PostingDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecurityDate6#PostingDate
	 * SecurityDate6.PostingDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecurityDate7#PostingDate
	 * SecurityDate7.PostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate24#PostingDate
	 * CorporateActionDate24.PostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption5#PostingDate
	 * SecuritiesOption5.PostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption5#OriginalPostingDate
	 * SecuritiesOption5.OriginalPostingDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption5#PostingDate
	 * CashOption5.PostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption5#OriginalPostingDate
	 * CashOption5.OriginalPostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption11#PostingDate
	 * SecuritiesOption11.PostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption11#OriginalPostingDate
	 * SecuritiesOption11.OriginalPostingDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption7#PostingDate
	 * CashOption7.PostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption7#OriginalPostingDate
	 * CashOption7.OriginalPostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption19#PostingDate
	 * SecuritiesOption19.PostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption19#OriginalPostingDate
	 * SecuritiesOption19.OriginalPostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption21#PostingDate
	 * SecuritiesOption21.PostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption21#OriginalPostingDate
	 * SecuritiesOption21.OriginalPostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption27#PostingDate
	 * SecuritiesOption27.PostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption27#OriginalPostingDate
	 * SecuritiesOption27.OriginalPostingDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption19#PostingDate
	 * CashOption19.PostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption19#OriginalPostingDate
	 * CashOption19.OriginalPostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption32#PostingDate
	 * SecuritiesOption32.PostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption32#OriginalPostingDate
	 * SecuritiesOption32.OriginalPostingDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption23#PostingDate
	 * CashOption23.PostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption23#OriginalPostingDate
	 * CashOption23.OriginalPostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes3#PostingDate
	 * FinancialInstrumentAttributes3.PostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes12#PostingDate
	 * FinancialInstrumentAttributes12.PostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes17#PostingDate
	 * FinancialInstrumentAttributes17.PostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes25#PostingDate
	 * FinancialInstrumentAttributes25.PostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes46#PostingDate
	 * FinancialInstrumentAttributes46.PostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes47#PostingDate
	 * FinancialInstrumentAttributes47.PostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSecuritiesMovement2#PostingDateTime
	 * CorporateActionSecuritiesMovement2.PostingDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSecuritiesMovement1#PostingDateTime
	 * CorporateActionSecuritiesMovement1.PostingDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSecuritiesMovement1#PostingQuantity
	 * CorporateActionSecuritiesMovement1.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes68#PostingDate
	 * FinancialInstrumentAttributes68.PostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption53#PostingDate
	 * SecuritiesOption53.PostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption53#OriginalPostingDate
	 * SecuritiesOption53.OriginalPostingDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption45#PostingDate
	 * CashOption45.PostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption45#OriginalPostingDate
	 * CashOption45.OriginalPostingDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecurityDate11#PostingDate
	 * SecurityDate11.PostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes73#PostingDate
	 * FinancialInstrumentAttributes73.PostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption58#PostingDate
	 * SecuritiesOption58.PostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption58#OriginalPostingDate
	 * SecuritiesOption58.OriginalPostingDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecurityDate13#PostingDate
	 * SecurityDate13.PostingDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption48#PostingDate
	 * CashOption48.PostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption48#OriginalPostingDate
	 * CashOption48.OriginalPostingDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostingDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of the posting (credit or debit) to the account."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PostingDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecurityDate1.PostingDate, com.tools20022.repository.msg.CorporateActionDate7.PostingDate, com.tools20022.repository.msg.SecurityDate3.PostingDate,
					com.tools20022.repository.msg.SecurityDate6.PostingDate, com.tools20022.repository.msg.SecurityDate7.PostingDate, com.tools20022.repository.msg.CorporateActionDate24.PostingDate,
					com.tools20022.repository.msg.SecuritiesOption5.PostingDate, com.tools20022.repository.msg.SecuritiesOption5.OriginalPostingDate, com.tools20022.repository.msg.CashOption5.PostingDate,
					com.tools20022.repository.msg.CashOption5.OriginalPostingDate, com.tools20022.repository.msg.SecuritiesOption11.PostingDate, com.tools20022.repository.msg.SecuritiesOption11.OriginalPostingDate,
					com.tools20022.repository.msg.CashOption7.PostingDate, com.tools20022.repository.msg.CashOption7.OriginalPostingDate, com.tools20022.repository.msg.SecuritiesOption19.PostingDate,
					com.tools20022.repository.msg.SecuritiesOption19.OriginalPostingDate, com.tools20022.repository.msg.SecuritiesOption21.PostingDate, com.tools20022.repository.msg.SecuritiesOption21.OriginalPostingDate,
					com.tools20022.repository.msg.SecuritiesOption27.PostingDate, com.tools20022.repository.msg.SecuritiesOption27.OriginalPostingDate, com.tools20022.repository.msg.CashOption19.PostingDate,
					com.tools20022.repository.msg.CashOption19.OriginalPostingDate, com.tools20022.repository.msg.SecuritiesOption32.PostingDate, com.tools20022.repository.msg.SecuritiesOption32.OriginalPostingDate,
					com.tools20022.repository.msg.CashOption23.PostingDate, com.tools20022.repository.msg.CashOption23.OriginalPostingDate, com.tools20022.repository.msg.FinancialInstrumentAttributes3.PostingDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes12.PostingDate, com.tools20022.repository.msg.FinancialInstrumentAttributes17.PostingDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes25.PostingDate, com.tools20022.repository.msg.FinancialInstrumentAttributes46.PostingDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes47.PostingDate, com.tools20022.repository.msg.CorporateActionSecuritiesMovement2.PostingDateTime,
					com.tools20022.repository.msg.CorporateActionSecuritiesMovement1.PostingDateTime, com.tools20022.repository.msg.CorporateActionSecuritiesMovement1.PostingQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes68.PostingDate, com.tools20022.repository.msg.SecuritiesOption53.PostingDate, com.tools20022.repository.msg.SecuritiesOption53.OriginalPostingDate,
					com.tools20022.repository.msg.CashOption45.PostingDate, com.tools20022.repository.msg.CashOption45.OriginalPostingDate, com.tools20022.repository.msg.SecurityDate11.PostingDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes73.PostingDate, com.tools20022.repository.msg.SecuritiesOption58.PostingDate, com.tools20022.repository.msg.SecuritiesOption58.OriginalPostingDate,
					com.tools20022.repository.msg.SecurityDate13.PostingDate, com.tools20022.repository.msg.CashOption48.PostingDate, com.tools20022.repository.msg.CashOption48.OriginalPostingDate);
			elementContext_lazy = () -> CorporateActionDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PostingDateTime";
			definition = "Date of the posting (credit or debit) to the account.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date/time at which the movement is due to take place (cash and/or
	 * securities).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.SecurityDate1#PaymentDate
	 * SecurityDate1.PaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate7#PaymentDate
	 * CorporateActionDate7.PaymentDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecurityDate3#PaymentDate
	 * SecurityDate3.PaymentDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecurityDate6#PaymentDate
	 * SecurityDate6.PaymentDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecurityDate7#PaymentDate
	 * SecurityDate7.PaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate24#PaymentDate
	 * CorporateActionDate24.PaymentDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecurityDate2#PaymentDate
	 * SecurityDate2.PaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate9#PaymentDate
	 * CorporateActionDate9.PaymentDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecurityDate4#PaymentDate
	 * SecurityDate4.PaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate12#PaymentDate
	 * CorporateActionDate12.PaymentDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecurityDate5#PaymentDate
	 * SecurityDate5.PaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate17#PaymentDate
	 * CorporateActionDate17.PaymentDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecurityDate8#PaymentDate
	 * SecurityDate8.PaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate20#PaymentDate
	 * CorporateActionDate20.PaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate23#PaymentDate
	 * CorporateActionDate23.PaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate26#PaymentDate
	 * CorporateActionDate26.PaymentDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecurityDate9#PaymentDate
	 * SecurityDate9.PaymentDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecurityDate10#PaymentDate
	 * SecurityDate10.PaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#PaymentDate
	 * CorporateActionDate1.PaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#PaymentDate
	 * CorporateActionDate13.PaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#PaymentDate
	 * CorporateActionDate14.PaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#PaymentDate
	 * CorporateActionDate21.PaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#PaymentDate
	 * CorporateActionDate22.PaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#PaymentDate
	 * CorporateActionDate25.PaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#PaymentDate
	 * CorporateActionDate27.PaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#PaymentDate
	 * CorporateActionDate28.PaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate4#PaymentDate
	 * CorporateActionDate4.PaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate3#PaymentDate
	 * CorporateActionDate3.PaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate5#PaymentDate
	 * CorporateActionDate5.PaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAdvice1#PaymentDate
	 * EntitlementAdvice1.PaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GlobalDistributionRequest1#PaymentDate
	 * GlobalDistributionRequest1.PaymentDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecurityDate12#PaymentDate
	 * SecurityDate12.PaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate47#PaymentDate
	 * CorporateActionDate47.PaymentDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecurityDate11#PaymentDate
	 * SecurityDate11.PaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#PaymentDate
	 * CorporateActionDate44.PaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate56#PaymentDate
	 * CorporateActionDate56.PaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#PaymentDate
	 * CorporateActionDate58.PaymentDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecurityDate14#PaymentDate
	 * SecurityDate14.PaymentDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecurityDate13#PaymentDate
	 * SecurityDate13.PaymentDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MovementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the movement is due to take place (cash and/or securities)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MovementDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecurityDate1.PaymentDate, com.tools20022.repository.msg.CorporateActionDate7.PaymentDate, com.tools20022.repository.msg.SecurityDate3.PaymentDate,
					com.tools20022.repository.msg.SecurityDate6.PaymentDate, com.tools20022.repository.msg.SecurityDate7.PaymentDate, com.tools20022.repository.msg.CorporateActionDate24.PaymentDate,
					com.tools20022.repository.msg.SecurityDate2.PaymentDate, com.tools20022.repository.msg.CorporateActionDate9.PaymentDate, com.tools20022.repository.msg.SecurityDate4.PaymentDate,
					com.tools20022.repository.msg.CorporateActionDate12.PaymentDate, com.tools20022.repository.msg.SecurityDate5.PaymentDate, com.tools20022.repository.msg.CorporateActionDate17.PaymentDate,
					com.tools20022.repository.msg.SecurityDate8.PaymentDate, com.tools20022.repository.msg.CorporateActionDate20.PaymentDate, com.tools20022.repository.msg.CorporateActionDate23.PaymentDate,
					com.tools20022.repository.msg.CorporateActionDate26.PaymentDate, com.tools20022.repository.msg.SecurityDate9.PaymentDate, com.tools20022.repository.msg.SecurityDate10.PaymentDate,
					com.tools20022.repository.msg.CorporateActionDate1.PaymentDate, com.tools20022.repository.msg.CorporateActionDate13.PaymentDate, com.tools20022.repository.msg.CorporateActionDate14.PaymentDate,
					com.tools20022.repository.msg.CorporateActionDate21.PaymentDate, com.tools20022.repository.msg.CorporateActionDate22.PaymentDate, com.tools20022.repository.msg.CorporateActionDate25.PaymentDate,
					com.tools20022.repository.msg.CorporateActionDate27.PaymentDate, com.tools20022.repository.msg.CorporateActionDate28.PaymentDate, com.tools20022.repository.msg.CorporateActionDate4.PaymentDate,
					com.tools20022.repository.msg.CorporateActionDate3.PaymentDate, com.tools20022.repository.msg.CorporateActionDate5.PaymentDate, com.tools20022.repository.msg.EntitlementAdvice1.PaymentDate,
					com.tools20022.repository.msg.GlobalDistributionRequest1.PaymentDate, com.tools20022.repository.msg.SecurityDate12.PaymentDate, com.tools20022.repository.msg.CorporateActionDate47.PaymentDate,
					com.tools20022.repository.msg.SecurityDate11.PaymentDate, com.tools20022.repository.msg.CorporateActionDate44.PaymentDate, com.tools20022.repository.msg.CorporateActionDate56.PaymentDate,
					com.tools20022.repository.msg.CorporateActionDate58.PaymentDate, com.tools20022.repository.msg.SecurityDate14.PaymentDate, com.tools20022.repository.msg.SecurityDate13.PaymentDate);
			elementContext_lazy = () -> CorporateActionDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MovementDate";
			definition = "Date/time at which the movement is due to take place (cash and/or securities).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Amount of money that is to be/was posted to the account.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#PostingAmount
	 * CorporateActionAmounts2.PostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#PostingAmount
	 * CorporateActionAmounts5.PostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#PostingAmount
	 * CorporateActionAmounts11.PostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#PostingAmount
	 * CorporateActionAmounts12.PostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#PostingAmount
	 * CorporateActionAmounts17.PostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#PostingAmount
	 * CorporateActionAmounts20.PostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#PostingAmount
	 * CorporateActionAmounts23.PostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#PostingAmount
	 * CorporateActionAmounts24.PostingAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption5#PostingAmount
	 * CashOption5.PostingAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption7#PostingAmount
	 * CashOption7.PostingAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption19#PostingAmount
	 * CashOption19.PostingAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption23#PostingAmount
	 * CashOption23.PostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange2#AnnouncedPostingAmount
	 * AmountAndCurrencyExchange2.AnnouncedPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange3#AnnouncedPostingAmount
	 * AmountAndCurrencyExchange3.AnnouncedPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#PostingAmount
	 * CorporateActionAmounts29.PostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#PostingAmount
	 * CorporateActionAmounts35.PostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#PostingAmount
	 * CorporateActionAmounts37.PostingAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption45#PostingAmount
	 * CashOption45.PostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#PostingAmount
	 * CorporateActionAmounts39.PostingAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption48#PostingAmount
	 * CashOption48.PostingAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money that is to be/was posted to the account."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PostingAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionAmounts2.PostingAmount, com.tools20022.repository.msg.CorporateActionAmounts5.PostingAmount,
					com.tools20022.repository.msg.CorporateActionAmounts11.PostingAmount, com.tools20022.repository.msg.CorporateActionAmounts12.PostingAmount, com.tools20022.repository.msg.CorporateActionAmounts17.PostingAmount,
					com.tools20022.repository.msg.CorporateActionAmounts20.PostingAmount, com.tools20022.repository.msg.CorporateActionAmounts23.PostingAmount, com.tools20022.repository.msg.CorporateActionAmounts24.PostingAmount,
					com.tools20022.repository.msg.CashOption5.PostingAmount, com.tools20022.repository.msg.CashOption7.PostingAmount, com.tools20022.repository.msg.CashOption19.PostingAmount,
					com.tools20022.repository.msg.CashOption23.PostingAmount, com.tools20022.repository.msg.AmountAndCurrencyExchange2.AnnouncedPostingAmount, com.tools20022.repository.msg.AmountAndCurrencyExchange3.AnnouncedPostingAmount,
					com.tools20022.repository.msg.CorporateActionAmounts29.PostingAmount, com.tools20022.repository.msg.CorporateActionAmounts35.PostingAmount, com.tools20022.repository.msg.CorporateActionAmounts37.PostingAmount,
					com.tools20022.repository.msg.CashOption45.PostingAmount, com.tools20022.repository.msg.CorporateActionAmounts39.PostingAmount, com.tools20022.repository.msg.CashOption48.PostingAmount);
			elementContext_lazy = () -> CorporateActionDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PostingAmount";
			definition = "Amount of money that is to be/was posted to the account.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies tax vouchers in the framework of a corporate action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#Distribution
	 * TaxVoucher.Distribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TaxVoucher
	 * TaxVoucher}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption2#TaxVoucherDetails
	 * CashOption2.TaxVoucherDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption9#TaxVoucherDetails
	 * CashOption9.TaxVoucherDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails2#AdditionalTax
	 * RateDetails2.AdditionalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption12#TaxVoucherDetails
	 * CashOption12.TaxVoucherDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails4#AdditionalTax
	 * RateDetails4.AdditionalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption13#TaxVoucherDetails
	 * CashOption13.TaxVoucherDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails7#AdditionalTax
	 * RateDetails7.AdditionalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption18#TaxVoucherDetails
	 * CashOption18.TaxVoucherDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails9#AdditionalTax
	 * RateDetails9.AdditionalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption22#TaxVoucherDetails
	 * CashOption22.TaxVoucherDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails11#AdditionalTax
	 * RateDetails11.AdditionalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption26#TaxVoucherDetails
	 * CashOption26.TaxVoucherDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails12#AdditionalTax
	 * RateDetails12.AdditionalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption27#TaxVoucherDetails
	 * CashOption27.TaxVoucherDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails3#AdditionalTax
	 * RateDetails3.AdditionalTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails5#AdditionalTax
	 * RateDetails5.AdditionalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#AdditionalTax
	 * RateDetails10.AdditionalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails13#AdditionalTax
	 * RateDetails13.AdditionalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption30#TaxVoucherDetails
	 * CashOption30.TaxVoucherDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails15#AdditionalTax
	 * RateDetails15.AdditionalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails14#AdditionalTax
	 * RateDetails14.AdditionalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails18#AdditionalTax
	 * RateDetails18.AdditionalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption38#TaxVoucherDetails
	 * CashOption38.TaxVoucherDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails21#AdditionalTax
	 * RateDetails21.AdditionalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption39#TaxVoucherDetails
	 * CashOption39.TaxVoucherDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption41#TaxVoucherDetails
	 * CashOption41.TaxVoucherDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption44#TaxVoucherDetails
	 * CashOption44.TaxVoucherDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails23#AdditionalTax
	 * RateDetails23.AdditionalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails22#AdditionalTax
	 * RateDetails22.AdditionalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption46#TaxVoucherDetails
	 * CashOption46.TaxVoucherDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails24#AdditionalTax
	 * RateDetails24.AdditionalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails25#AdditionalTax
	 * RateDetails25.AdditionalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails26#AdditionalTax
	 * RateDetails26.AdditionalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption52#TaxVoucherDetails
	 * CashOption52.TaxVoucherDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails27#AdditionalTax
	 * RateDetails27.AdditionalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails28#AdditionalTax
	 * RateDetails28.AdditionalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails30#AdditionalTax
	 * RateDetails30.AdditionalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption55#TaxVoucherDetails
	 * CashOption55.TaxVoucherDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxVoucher"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies tax vouchers in the framework of a corporate action event."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TaxVoucher = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashOption2.TaxVoucherDetails, com.tools20022.repository.msg.CashOption9.TaxVoucherDetails, com.tools20022.repository.msg.RateDetails2.AdditionalTax,
					com.tools20022.repository.msg.CashOption12.TaxVoucherDetails, com.tools20022.repository.msg.RateDetails4.AdditionalTax, com.tools20022.repository.msg.CashOption13.TaxVoucherDetails,
					com.tools20022.repository.msg.RateDetails7.AdditionalTax, com.tools20022.repository.msg.CashOption18.TaxVoucherDetails, com.tools20022.repository.msg.RateDetails9.AdditionalTax,
					com.tools20022.repository.msg.CashOption22.TaxVoucherDetails, com.tools20022.repository.msg.RateDetails11.AdditionalTax, com.tools20022.repository.msg.CashOption26.TaxVoucherDetails,
					com.tools20022.repository.msg.RateDetails12.AdditionalTax, com.tools20022.repository.msg.CashOption27.TaxVoucherDetails, com.tools20022.repository.msg.RateDetails3.AdditionalTax,
					com.tools20022.repository.msg.RateDetails5.AdditionalTax, com.tools20022.repository.msg.RateDetails10.AdditionalTax, com.tools20022.repository.msg.RateDetails13.AdditionalTax,
					com.tools20022.repository.msg.CashOption30.TaxVoucherDetails, com.tools20022.repository.msg.RateDetails15.AdditionalTax, com.tools20022.repository.msg.RateDetails14.AdditionalTax,
					com.tools20022.repository.msg.RateDetails18.AdditionalTax, com.tools20022.repository.msg.CashOption38.TaxVoucherDetails, com.tools20022.repository.msg.RateDetails21.AdditionalTax,
					com.tools20022.repository.msg.CashOption39.TaxVoucherDetails, com.tools20022.repository.msg.CashOption41.TaxVoucherDetails, com.tools20022.repository.msg.CashOption44.TaxVoucherDetails,
					com.tools20022.repository.msg.RateDetails23.AdditionalTax, com.tools20022.repository.msg.RateDetails22.AdditionalTax, com.tools20022.repository.msg.CashOption46.TaxVoucherDetails,
					com.tools20022.repository.msg.RateDetails24.AdditionalTax, com.tools20022.repository.msg.RateDetails25.AdditionalTax, com.tools20022.repository.msg.RateDetails26.AdditionalTax,
					com.tools20022.repository.msg.CashOption52.TaxVoucherDetails, com.tools20022.repository.msg.RateDetails27.AdditionalTax, com.tools20022.repository.msg.RateDetails28.AdditionalTax,
					com.tools20022.repository.msg.RateDetails30.AdditionalTax, com.tools20022.repository.msg.CashOption55.TaxVoucherDetails);
			elementContext_lazy = () -> CorporateActionDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxVoucher";
			definition = "Specifies tax vouchers in the framework of a corporate action event.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TaxVoucher.Distribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Process which groups the activities related to corporate action
	 * servicing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#CorporateActionDistribution
	 * CorporateActionServicing.CorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing
	 * CorporateActionServicing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedServicing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Process which groups the activities related to corporate action servicing."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedServicing = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedServicing";
			definition = "Process which groups the activities related to corporate action servicing.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionServicing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionServicing.CorporateActionDistribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Type of movement instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DistributionTypeCode
	 * DistributionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DistributionTypeFormat1Choice#Code
	 * DistributionTypeFormat1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DistributionTypeFormat1Choice#Proprietary
	 * DistributionTypeFormat1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DistributionTypeFormat2Choice#Code
	 * DistributionTypeFormat2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DistributionTypeFormat2Choice#Proprietary
	 * DistributionTypeFormat2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DistributionTypeFormat3Choice#Code
	 * DistributionTypeFormat3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DistributionTypeFormat3Choice#Proprietary
	 * DistributionTypeFormat3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DistributionType1FormatChoice#Code
	 * DistributionType1FormatChoice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DistributionType1FormatChoice#Proprietary
	 * DistributionType1FormatChoice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DistributionTypeFormat4Choice#Code
	 * DistributionTypeFormat4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DistributionTypeFormat4Choice#Proprietary
	 * DistributionTypeFormat4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DistributionTypeFormat6Choice#Code
	 * DistributionTypeFormat6Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DistributionTypeFormat6Choice#Proprietary
	 * DistributionTypeFormat6Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DistributionTypeFormat7Choice#Code
	 * DistributionTypeFormat7Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DistributionTypeFormat7Choice#Proprietary
	 * DistributionTypeFormat7Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DistributionTypeFormat8Choice#Code
	 * DistributionTypeFormat8Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DistributionTypeFormat8Choice#Proprietary
	 * DistributionTypeFormat8Choice.Proprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of movement instruction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OrderType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays
					.asList(com.tools20022.repository.choice.DistributionTypeFormat1Choice.Code, com.tools20022.repository.choice.DistributionTypeFormat1Choice.Proprietary,
							com.tools20022.repository.choice.DistributionTypeFormat2Choice.Code, com.tools20022.repository.choice.DistributionTypeFormat2Choice.Proprietary,
							com.tools20022.repository.choice.DistributionTypeFormat3Choice.Code, com.tools20022.repository.choice.DistributionTypeFormat3Choice.Proprietary,
							com.tools20022.repository.choice.DistributionType1FormatChoice.Code, com.tools20022.repository.choice.DistributionType1FormatChoice.Proprietary,
							com.tools20022.repository.choice.DistributionTypeFormat4Choice.Code, com.tools20022.repository.choice.DistributionTypeFormat4Choice.Proprietary,
							com.tools20022.repository.choice.DistributionTypeFormat6Choice.Code, com.tools20022.repository.choice.DistributionTypeFormat6Choice.Proprietary,
							com.tools20022.repository.choice.DistributionTypeFormat7Choice.Code, com.tools20022.repository.choice.DistributionTypeFormat7Choice.Proprietary,
							com.tools20022.repository.choice.DistributionTypeFormat8Choice.Code, com.tools20022.repository.choice.DistributionTypeFormat8Choice.Proprietary);
			elementContext_lazy = () -> CorporateActionDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderType";
			definition = "Type of movement instruction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DistributionTypeCode.mmObject();
		}
	};
	/**
	 * Type of movement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DistributionInstructionTypeCode
	 * DistributionInstructionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovement1#OrderType
	 * CorporateActionMovement1.OrderType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MovementType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of movement."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MovementType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionMovement1.OrderType);
			elementContext_lazy = () -> CorporateActionDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MovementType";
			definition = "Type of movement.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DistributionInstructionTypeCode.mmObject();
		}
	};
	/**
	 * Indicates whether the movement is a high priority or not.<br>
	 * Meaning when true: High priority<br>
	 * Meaning when false: Standard
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovement1#HighPriorityIndicator
	 * CorporateActionMovement1.HighPriorityIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HighPriorityIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the movement is a high priority or not.\r\nMeaning when true: High priority\r\nMeaning when false: Standard"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute HighPriorityIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionMovement1.HighPriorityIndicator);
			elementContext_lazy = () -> CorporateActionDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HighPriorityIndicator";
			definition = "Indicates whether the movement is a high priority or not.\r\nMeaning when true: High priority\r\nMeaning when false: Standard";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Date at which the distribution movement must be executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovement1#RequestedExecutionDate
	 * CorporateActionMovement1.RequestedExecutionDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedExecutionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date at which the distribution movement must be executed."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RequestedExecutionDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionMovement1.RequestedExecutionDate);
			elementContext_lazy = () -> CorporateActionDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RequestedExecutionDate";
			definition = "Date at which the distribution movement must be executed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Specifies the rounding direction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RoundingDirectionCode
	 * RoundingDirectionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FractionTreatment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the rounding direction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FractionTreatment = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FractionTreatment";
			definition = "Specifies the rounding direction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> RoundingDirectionCode.mmObject();
		}
	};
	/**
	 * Specifies whether the posting amount is a debit or credit.
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the posting amount is a debit or credit."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CreditDebitIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Specifies whether the posting amount is a debit or credit.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}
	};
	/**
	 * Option on which the distribution is based.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#Distribution
	 * CorporateActionOption.Distribution}</li>
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Option"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Option on which the distribution is based."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Option = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Option";
			definition = "Option on which the distribution is based.";
			minOccurs = 0;
			type_lazy = () -> CorporateActionOption.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.Distribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cash amount after any deductions and allowances have been made
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
	 * <li>{@linkplain com.tools20022.repository.msg.TaxVoucher1#NetAmount
	 * TaxVoucher1.NetAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash amount after any deductions and allowances have been made"</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute NetAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxVoucher1.NetAmount);
			elementContext_lazy = () -> CorporateActionDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetAmount";
			definition = "Cash amount after any deductions and allowances have been made";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Cash amount before any deductions and allowances have been made.
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
	 * <li>{@linkplain com.tools20022.repository.msg.TaxVoucher1#GrossAmount
	 * TaxVoucher1.GrossAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash amount before any deductions and allowances have been made."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute GrossAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxVoucher1.GrossAmount);
			elementContext_lazy = () -> CorporateActionDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GrossAmount";
			definition = "Cash amount before any deductions and allowances have been made.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Financial transaction to which the CA distribution belongs.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FinancialTransaction#CorporateActionDistribution
	 * FinancialTransaction.CorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.FinancialTransaction
	 * FinancialTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial transaction to which the CA distribution belongs."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd FinancialTransaction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinancialTransaction";
			definition = "Financial transaction to which the CA distribution belongs.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.FinancialTransaction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.FinancialTransaction.CorporateActionDistribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the delivery instructions for the securities and cash proceeds
	 * at any stage of the Corporate Action process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#RelatedDistribution
	 * CorporateActionProceedsDeliveryInstruction.RelatedDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction
	 * CorporateActionProceedsDeliveryInstruction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative8#DeliveryDetails
	 * CorporateActionNarrative8.DeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative13#DeliveryDetails
	 * CorporateActionNarrative13.DeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAdditionalInformation1#DeliveryDetails
	 * CorporateActionAdditionalInformation1.DeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative32#DeliveryDetails
	 * CorporateActionNarrative32.DeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative33#DeliveryDetails
	 * CorporateActionNarrative33.DeliveryDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionProceedsDeliveryInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the delivery instructions for the securities and cash proceeds at any stage of the Corporate Action process."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CorporateActionProceedsDeliveryInstruction = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionNarrative8.DeliveryDetails, com.tools20022.repository.msg.CorporateActionNarrative13.DeliveryDetails,
					com.tools20022.repository.msg.CorporateActionAdditionalInformation1.DeliveryDetails, com.tools20022.repository.msg.CorporateActionNarrative32.DeliveryDetails,
					com.tools20022.repository.msg.CorporateActionNarrative33.DeliveryDetails);
			elementContext_lazy = () -> CorporateActionDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionProceedsDeliveryInstruction";
			definition = "Specifies the delivery instructions for the securities and cash proceeds at any stage of the Corporate Action process.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.RelatedDistribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionDistribution";
				definition = "Distribution of the proceeds of a CA event.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesQuantity.CorporateActionDistribution, com.tools20022.repository.entity.CorporateActionOption.Distribution,
						com.tools20022.repository.entity.TaxVoucher.Distribution, com.tools20022.repository.entity.CorporateActionServicing.CorporateActionDistribution,
						com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.RelatedDistribution, com.tools20022.repository.entity.FinancialTransaction.CorporateActionDistribution);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionDistribution.PostingQuantity, com.tools20022.repository.entity.CorporateActionDistribution.PostingDateTime,
						com.tools20022.repository.entity.CorporateActionDistribution.MovementDate, com.tools20022.repository.entity.CorporateActionDistribution.PostingAmount,
						com.tools20022.repository.entity.CorporateActionDistribution.TaxVoucher, com.tools20022.repository.entity.CorporateActionDistribution.RelatedServicing,
						com.tools20022.repository.entity.CorporateActionDistribution.OrderType, com.tools20022.repository.entity.CorporateActionDistribution.MovementType,
						com.tools20022.repository.entity.CorporateActionDistribution.HighPriorityIndicator, com.tools20022.repository.entity.CorporateActionDistribution.RequestedExecutionDate,
						com.tools20022.repository.entity.CorporateActionDistribution.FractionTreatment, com.tools20022.repository.entity.CorporateActionDistribution.CreditDebitIndicator,
						com.tools20022.repository.entity.CorporateActionDistribution.Option, com.tools20022.repository.entity.CorporateActionDistribution.NetAmount, com.tools20022.repository.entity.CorporateActionDistribution.GrossAmount,
						com.tools20022.repository.entity.CorporateActionDistribution.FinancialTransaction, com.tools20022.repository.entity.CorporateActionDistribution.CorporateActionProceedsDeliveryInstruction);
				derivationComponent_lazy = () -> Arrays.asList(DistributionTypeFormat1Choice.mmObject(), DistributionTypeFormat2Choice.mmObject(), DistributionTypeFormat3Choice.mmObject(), DistributionType1FormatChoice.mmObject(),
						GlobalDistributionRequest1.mmObject(), CorporateActionMovement1.mmObject(), DistributionTypeFormat4Choice.mmObject(), DistributionTypeFormat6Choice.mmObject(), DistributionTypeFormat7Choice.mmObject(),
						DistributionTypeFormat8Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}