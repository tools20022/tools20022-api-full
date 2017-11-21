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
import com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportStatusAdviceV01;
import com.tools20022.repository.codeset.ReportItemStatus1Code;
import com.tools20022.repository.datatype.Max15NumericText;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides detailed information on the number of reported items with their
 * respective acceptance status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NumberOfItemsPerStatus1#mmStatus
 * NumberOfItemsPerStatus1.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NumberOfItemsPerStatus1#mmNumberOfItems
 * NumberOfItemsPerStatus1.mmNumberOfItems}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportStatusAdviceV01#mmNumberOfItemsPerStatus
 * SecuritiesBalanceTransparencyReportStatusAdviceV01.mmNumberOfItemsPerStatus}</li>
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
 * "NumberOfItemsPerStatus1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides detailed information on the number of reported items with their respective acceptance status."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.NumberOfTransactionsPerStatus3
 * NumberOfTransactionsPerStatus3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "NumberOfItemsPerStatus1", propOrder = {"status", "numberOfItems"})
public class NumberOfItemsPerStatus1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ReportItemStatus1Code status;
	/**
	 * Common status of the report items for which the number of report items is
	 * specified in NumberOfItems.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ReportItemStatus1Code
	 * ReportItemStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NumberOfItemsPerStatus1
	 * NumberOfItemsPerStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Common status of the report items for which the number of report items is specified in NumberOfItems."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.NumberOfTransactionsPerStatus3#mmDetailedStatus
	 * NumberOfTransactionsPerStatus3.mmDetailedStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatus = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NumberOfItemsPerStatus1.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Common status of the report items for which the number of report items is specified in NumberOfItems.";
			previousVersion_lazy = () -> NumberOfTransactionsPerStatus3.mmDetailedStatus;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ReportItemStatus1Code.mmObject();
		}
	};
	protected Max15NumericText numberOfItems;
	/**
	 * Number of items for the status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15NumericText
	 * Max15NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NumberOfItemsPerStatus1
	 * NumberOfItemsPerStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfItms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfItems"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of items for the status."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.NumberOfTransactionsPerStatus3#mmDetailedNumberOfTransactions
	 * NumberOfTransactionsPerStatus3.mmDetailedNumberOfTransactions}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNumberOfItems = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NumberOfItemsPerStatus1.mmObject();
			isDerived = false;
			xmlTag = "NbOfItms";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfItems";
			definition = "Number of items for the status.";
			previousVersion_lazy = () -> NumberOfTransactionsPerStatus3.mmDetailedNumberOfTransactions;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(NumberOfItemsPerStatus1.mmStatus, NumberOfItemsPerStatus1.mmNumberOfItems);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesBalanceTransparencyReportStatusAdviceV01.mmNumberOfItemsPerStatus);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NumberOfItemsPerStatus1";
				definition = "Provides detailed information on the number of reported items with their respective acceptance status.";
				previousVersion_lazy = () -> NumberOfTransactionsPerStatus3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Sts", required = true)
	public ReportItemStatus1Code getStatus() {
		return status;
	}

	public void setStatus(ReportItemStatus1Code status) {
		this.status = status;
	}

	@XmlElement(name = "NbOfItms", required = true)
	public Max15NumericText getNumberOfItems() {
		return numberOfItems;
	}

	public void setNumberOfItems(Max15NumericText numberOfItems) {
		this.numberOfItems = numberOfItems;
	}
}