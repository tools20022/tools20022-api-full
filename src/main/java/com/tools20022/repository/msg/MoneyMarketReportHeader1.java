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
import com.tools20022.repository.area.auth.*;
import com.tools20022.repository.datatype.LEIIdentifier;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides the money market statistical report instrument related header
 * details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MoneyMarketReportHeader1#mmReportingAgent
 * MoneyMarketReportHeader1.mmReportingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MoneyMarketReportHeader1#mmReferencePeriod
 * MoneyMarketReportHeader1.mmReferencePeriod}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketForeignExchangeSwapsStatisticalReportV01#mmReportHeader
 * MoneyMarketForeignExchangeSwapsStatisticalReportV01.mmReportHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketOvernightIndexSwapsStatisticalReportV01#mmReportHeader
 * MoneyMarketOvernightIndexSwapsStatisticalReportV01.mmReportHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketUnsecuredMarketStatisticalReportV01#mmReportHeader
 * MoneyMarketUnsecuredMarketStatisticalReportV01.mmReportHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketSecuredMarketStatisticalReportV01#mmReportHeader
 * MoneyMarketSecuredMarketStatisticalReportV01.mmReportHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketUnsecuredMarketStatisticalReportV02#mmReportHeader
 * MoneyMarketUnsecuredMarketStatisticalReportV02.mmReportHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketForeignExchangeSwapsStatisticalReportV02#mmReportHeader
 * MoneyMarketForeignExchangeSwapsStatisticalReportV02.mmReportHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketSecuredMarketStatisticalReportV02#mmReportHeader
 * MoneyMarketSecuredMarketStatisticalReportV02.mmReportHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketOvernightIndexSwapsStatisticalReportV02#mmReportHeader
 * MoneyMarketOvernightIndexSwapsStatisticalReportV02.mmReportHeader}</li>
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
 * "MoneyMarketReportHeader1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the money market statistical report instrument related header details."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MoneyMarketReportHeader1", propOrder = {"reportingAgent", "referencePeriod"})
public class MoneyMarketReportHeader1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RptgAgt", required = true)
	protected LEIIdentifier reportingAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.LEIIdentifier
	 * LEIIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MoneyMarketReportHeader1
	 * MoneyMarketReportHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptgAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Agent which is subject to reporting requirements."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReportingAgent = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MoneyMarketReportHeader1.mmObject();
			isDerived = false;
			xmlTag = "RptgAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingAgent";
			definition = "Agent which is subject to reporting requirements.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LEIIdentifier.mmObject();
		}
	};
	@XmlElement(name = "RefPrd", required = true)
	protected DateTimePeriod1 referencePeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DateTimePeriod1
	 * DateTimePeriod1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MoneyMarketReportHeader1
	 * MoneyMarketReportHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RefPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferencePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Beginning and ending date-time to which the transaction data refers (trade date in case of new transactions and date of amendment in case of revisions). "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReferencePeriod = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MoneyMarketReportHeader1.mmObject();
			isDerived = false;
			xmlTag = "RefPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferencePeriod";
			definition = "Beginning and ending date-time to which the transaction data refers (trade date in case of new transactions and date of amendment in case of revisions). ";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DateTimePeriod1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MoneyMarketReportHeader1.mmReportingAgent, com.tools20022.repository.msg.MoneyMarketReportHeader1.mmReferencePeriod);
				messageBuildingBlock_lazy = () -> Arrays.asList(MoneyMarketForeignExchangeSwapsStatisticalReportV01.mmReportHeader, MoneyMarketOvernightIndexSwapsStatisticalReportV01.mmReportHeader,
						MoneyMarketUnsecuredMarketStatisticalReportV01.mmReportHeader, MoneyMarketSecuredMarketStatisticalReportV01.mmReportHeader, MoneyMarketUnsecuredMarketStatisticalReportV02.mmReportHeader,
						MoneyMarketForeignExchangeSwapsStatisticalReportV02.mmReportHeader, MoneyMarketSecuredMarketStatisticalReportV02.mmReportHeader, MoneyMarketOvernightIndexSwapsStatisticalReportV02.mmReportHeader);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MoneyMarketReportHeader1";
				definition = "Provides the money market statistical report instrument related header details.";
			}
		});
		return mmObject_lazy.get();
	}

	public LEIIdentifier getReportingAgent() {
		return reportingAgent;
	}

	public MoneyMarketReportHeader1 setReportingAgent(LEIIdentifier reportingAgent) {
		this.reportingAgent = Objects.requireNonNull(reportingAgent);
		return this;
	}

	public DateTimePeriod1 getReferencePeriod() {
		return referencePeriod;
	}

	public MoneyMarketReportHeader1 setReferencePeriod(com.tools20022.repository.msg.DateTimePeriod1 referencePeriod) {
		this.referencePeriod = Objects.requireNonNull(referencePeriod);
		return this;
	}
}