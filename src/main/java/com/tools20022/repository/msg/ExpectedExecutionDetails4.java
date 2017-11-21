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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.InvestmentFundOrderExecution;
import com.tools20022.repository.entity.Obligation;
import com.tools20022.repository.entity.Trade;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Expected trade date and expected settlement date of the order execution.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails4#mmExpectedTradeDateTime
 * ExpectedExecutionDetails4.mmExpectedTradeDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails4#mmExpectedCashSettlementDate
 * ExpectedExecutionDetails4.mmExpectedCashSettlementDate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
 * InvestmentFundOrderExecution}</li>
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
 * "ExpectedExecutionDetails4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Expected trade date and expected settlement date of the order execution."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails2
 * ExpectedExecutionDetails2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ExpectedExecutionDetails4", propOrder = {"expectedTradeDateTime", "expectedCashSettlementDate"})
public class ExpectedExecutionDetails4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected DateAndDateTimeChoice expectedTradeDateTime;
	/**
	 * Expected date or expected date and time at which a price will be applied
	 * according to the terms of the prospectus.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeDateTime
	 * Trade.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails4
	 * ExpectedExecutionDetails4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpctdTradDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpectedTradeDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Expected date or expected date and time at which a price will be applied according to the terms of the prospectus."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails2#mmExpectedTradeDateTime
	 * ExpectedExecutionDetails2.mmExpectedTradeDateTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExpectedTradeDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> ExpectedExecutionDetails4.mmObject();
			isDerived = false;
			xmlTag = "XpctdTradDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedTradeDateTime";
			definition = "Expected date or expected date and time at which a price will be applied according to the terms of the prospectus.";
			previousVersion_lazy = () -> ExpectedExecutionDetails2.mmExpectedTradeDateTime;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	protected ISODate expectedCashSettlementDate;
	/**
	 * Date of a payment, for example, a prepayment date.
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
	 * {@linkplain com.tools20022.repository.entity.Obligation#mmRequestedSettlementDate
	 * Obligation.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails4
	 * ExpectedExecutionDetails4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpctdCshSttlmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpectedCashSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of a payment, for example, a prepayment date. "</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails2#mmExpectedCashSettlementDate
	 * ExpectedExecutionDetails2.mmExpectedCashSettlementDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExpectedCashSettlementDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Obligation.mmRequestedSettlementDate;
			componentContext_lazy = () -> ExpectedExecutionDetails4.mmObject();
			isDerived = false;
			xmlTag = "XpctdCshSttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedCashSettlementDate";
			definition = "Date of a payment, for example, a prepayment date. ";
			previousVersion_lazy = () -> ExpectedExecutionDetails2.mmExpectedCashSettlementDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ExpectedExecutionDetails4.mmExpectedTradeDateTime, ExpectedExecutionDetails4.mmExpectedCashSettlementDate);
				trace_lazy = () -> InvestmentFundOrderExecution.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ExpectedExecutionDetails4";
				definition = "Expected trade date and expected settlement date of the order execution.";
				previousVersion_lazy = () -> ExpectedExecutionDetails2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "XpctdTradDtTm")
	public DateAndDateTimeChoice getExpectedTradeDateTime() {
		return expectedTradeDateTime;
	}

	public void setExpectedTradeDateTime(DateAndDateTimeChoice expectedTradeDateTime) {
		this.expectedTradeDateTime = expectedTradeDateTime;
	}

	@XmlElement(name = "XpctdCshSttlmDt")
	public ISODate getExpectedCashSettlementDate() {
		return expectedCashSettlementDate;
	}

	public void setExpectedCashSettlementDate(ISODate expectedCashSettlementDate) {
		this.expectedCashSettlementDate = expectedCashSettlementDate;
	}
}