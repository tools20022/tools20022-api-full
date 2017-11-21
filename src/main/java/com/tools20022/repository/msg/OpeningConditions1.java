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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.CurrencyExchange;
import com.tools20022.repository.entity.FixingCondition;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the conditions for the NDF opening.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OpeningConditions1#mmSettlementCurrency
 * OpeningConditions1.mmSettlementCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OpeningConditions1#mmValuationDate
 * OpeningConditions1.mmValuationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OpeningConditions1#mmSettlementRateSource
 * OpeningConditions1.mmSettlementRateSource}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.FixingCondition
 * FixingCondition}</li>
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
 * "OpeningConditions1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the conditions for the NDF opening."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "OpeningConditions1", propOrder = {"settlementCurrency", "valuationDate", "settlementRateSource"})
public class OpeningConditions1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ActiveCurrencyCode settlementCurrency;
	/**
	 * Specifies the settlement currency of the non deliverable trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmQuotedCurrency
	 * CurrencyExchange.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OpeningConditions1
	 * OpeningConditions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the settlement currency of the non deliverable trade."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmQuotedCurrency;
			componentContext_lazy = () -> OpeningConditions1.mmObject();
			isDerived = false;
			xmlTag = "SttlmCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementCurrency";
			definition = "Specifies the settlement currency of the non deliverable trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}
	};
	protected ISODate valuationDate;
	/**
	 * Specifies the valuation date for a non deliverable trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.FixingCondition#mmFixingDateTime
	 * FixingCondition.mmFixingDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OpeningConditions1
	 * OpeningConditions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValtnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValuationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the valuation date for a non deliverable trade."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValuationDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> FixingCondition.mmFixingDateTime;
			componentContext_lazy = () -> OpeningConditions1.mmObject();
			isDerived = false;
			xmlTag = "ValtnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValuationDate";
			definition = "Specifies the valuation date for a non deliverable trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.SettlementRateSource1> settlementRateSource;
	/**
	 * Specifies the rate source associated with the non deliverable trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementRateSource1
	 * SettlementRateSource1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.FixingCondition#mmSettlementRateOption
	 * FixingCondition.mmSettlementRateOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OpeningConditions1
	 * OpeningConditions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmRateSrc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementRateSource"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the rate source associated with the non deliverable trade."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementRateSource = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> FixingCondition.mmSettlementRateOption;
			componentContext_lazy = () -> OpeningConditions1.mmObject();
			isDerived = false;
			xmlTag = "SttlmRateSrc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementRateSource";
			definition = "Specifies the rate source associated with the non deliverable trade.";
			maxOccurs = 2;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SettlementRateSource1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(OpeningConditions1.mmSettlementCurrency, OpeningConditions1.mmValuationDate, OpeningConditions1.mmSettlementRateSource);
				trace_lazy = () -> FixingCondition.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OpeningConditions1";
				definition = "Specifies the conditions for the NDF opening.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "SttlmCcy", required = true)
	public ActiveCurrencyCode getSettlementCurrency() {
		return settlementCurrency;
	}

	public void setSettlementCurrency(ActiveCurrencyCode settlementCurrency) {
		this.settlementCurrency = settlementCurrency;
	}

	@XmlElement(name = "ValtnDt", required = true)
	public ISODate getValuationDate() {
		return valuationDate;
	}

	public void setValuationDate(ISODate valuationDate) {
		this.valuationDate = valuationDate;
	}

	@XmlElement(name = "SttlmRateSrc", required = true)
	public List<SettlementRateSource1> getSettlementRateSource() {
		return settlementRateSource;
	}

	public void setSettlementRateSource(List<com.tools20022.repository.msg.SettlementRateSource1> settlementRateSource) {
		this.settlementRateSource = settlementRateSource;
	}
}