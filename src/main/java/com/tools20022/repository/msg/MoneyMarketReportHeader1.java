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
import com.tools20022.repository.datatype.LEIIdentifier;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.msg.MoneyMarketReportHeader1#ReportingAgent
 * MoneyMarketReportHeader1.ReportingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MoneyMarketReportHeader1#ReferencePeriod
 * MoneyMarketReportHeader1.ReferencePeriod}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketForeignExchangeSwapsStatisticalReportV01#ReportHeader
 * MoneyMarketForeignExchangeSwapsStatisticalReportV01.ReportHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketOvernightIndexSwapsStatisticalReportV01#ReportHeader
 * MoneyMarketOvernightIndexSwapsStatisticalReportV01.ReportHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketUnsecuredMarketStatisticalReportV01#ReportHeader
 * MoneyMarketUnsecuredMarketStatisticalReportV01.ReportHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketSecuredMarketStatisticalReportV01#ReportHeader
 * MoneyMarketSecuredMarketStatisticalReportV01.ReportHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketUnsecuredMarketStatisticalReportV02#ReportHeader
 * MoneyMarketUnsecuredMarketStatisticalReportV02.ReportHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketForeignExchangeSwapsStatisticalReportV02#ReportHeader
 * MoneyMarketForeignExchangeSwapsStatisticalReportV02.ReportHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketSecuredMarketStatisticalReportV02#ReportHeader
 * MoneyMarketSecuredMarketStatisticalReportV02.ReportHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketOvernightIndexSwapsStatisticalReportV02#ReportHeader
 * MoneyMarketOvernightIndexSwapsStatisticalReportV02.ReportHeader}</li>
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
public class MoneyMarketReportHeader1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Agent which is subject to reporting requirements.
	 * <p>
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
	public static final MMMessageAttribute ReportingAgent = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MoneyMarketReportHeader1.mmObject();
			isDerived = false;
			xmlTag = "RptgAgt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingAgent";
			definition = "Agent which is subject to reporting requirements.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> LEIIdentifier.mmObject();
		}
	};
	/**
	 * Beginning and ending date-time to which the transaction data refers
	 * (trade date in case of new transactions and date of amendment in case of
	 * revisions).
	 * <p>
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
	public static final MMMessageAssociationEnd ReferencePeriod = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MoneyMarketReportHeader1.mmObject();
			isDerived = false;
			xmlTag = "RefPrd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferencePeriod";
			definition = "Beginning and ending date-time to which the transaction data refers (trade date in case of new transactions and date of amendment in case of revisions). ";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod1.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MoneyMarketReportHeader1.ReportingAgent, com.tools20022.repository.msg.MoneyMarketReportHeader1.ReferencePeriod);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.auth.MoneyMarketForeignExchangeSwapsStatisticalReportV01.ReportHeader,
						com.tools20022.repository.area.auth.MoneyMarketOvernightIndexSwapsStatisticalReportV01.ReportHeader, com.tools20022.repository.area.auth.MoneyMarketUnsecuredMarketStatisticalReportV01.ReportHeader,
						com.tools20022.repository.area.auth.MoneyMarketSecuredMarketStatisticalReportV01.ReportHeader, com.tools20022.repository.area.auth.MoneyMarketUnsecuredMarketStatisticalReportV02.ReportHeader,
						com.tools20022.repository.area.auth.MoneyMarketForeignExchangeSwapsStatisticalReportV02.ReportHeader, com.tools20022.repository.area.auth.MoneyMarketSecuredMarketStatisticalReportV02.ReportHeader,
						com.tools20022.repository.area.auth.MoneyMarketOvernightIndexSwapsStatisticalReportV02.ReportHeader);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MoneyMarketReportHeader1";
				definition = "Provides the money market statistical report instrument related header details.";
			}
		});
		return mmObject_lazy.get();
	}
}