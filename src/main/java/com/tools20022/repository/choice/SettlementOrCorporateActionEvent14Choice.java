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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.CorporateActionEvent;
import com.tools20022.repository.entity.SecuritiesTrade;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of transaction type, corporate action event or settlement transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent14Choice#mmSecuritiesTransactionType
 * SettlementOrCorporateActionEvent14Choice.mmSecuritiesTransactionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent14Choice#mmCorporateActionEventType
 * SettlementOrCorporateActionEvent14Choice.mmCorporateActionEventType}</li>
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
 * "SettlementOrCorporateActionEvent14Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice of transaction type, corporate action event or settlement transaction."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent17Choice
 * SettlementOrCorporateActionEvent17Choice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent10Choice
 * SettlementOrCorporateActionEvent10Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SettlementOrCorporateActionEvent14Choice", propOrder = {"securitiesTransactionType", "corporateActionEventType"})
public class SettlementOrCorporateActionEvent14Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected SecuritiesTransactionType19Choice securitiesTransactionType;
	/**
	 * Identifies the type of securities transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType19Choice
	 * SecuritiesTransactionType19Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesTransactionType
	 * SecuritiesTrade.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent14Choice
	 * SettlementOrCorporateActionEvent14Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesTxTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTransactionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the type of securities transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent17Choice#mmSecuritiesTransactionType
	 * SettlementOrCorporateActionEvent17Choice.mmSecuritiesTransactionType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent10Choice#mmSecuritiesTransactionType
	 * SettlementOrCorporateActionEvent10Choice.mmSecuritiesTransactionType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecuritiesTransactionType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmSecuritiesTransactionType;
			componentContext_lazy = () -> SettlementOrCorporateActionEvent14Choice.mmObject();
			isDerived = false;
			xmlTag = "SctiesTxTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesTransactionType";
			definition = "Identifies the type of securities transaction.";
			nextVersions_lazy = () -> Arrays.asList(SettlementOrCorporateActionEvent17Choice.mmSecuritiesTransactionType);
			previousVersion_lazy = () -> SettlementOrCorporateActionEvent10Choice.mmSecuritiesTransactionType;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.choice.SecuritiesTransactionType19Choice.mmObject();
		}
	};
	protected CorporateActionEventType30Choice corporateActionEventType;
	/**
	 * Specifies the type of corporate event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType30Choice
	 * CorporateActionEventType30Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmType
	 * CorporateActionEvent.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent14Choice
	 * SettlementOrCorporateActionEvent14Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnEvtTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEventType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of corporate event."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent17Choice#mmCorporateActionEventType
	 * SettlementOrCorporateActionEvent17Choice.mmCorporateActionEventType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent10Choice#mmCorporateActionEventType
	 * SettlementOrCorporateActionEvent10Choice.mmCorporateActionEventType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCorporateActionEventType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmType;
			componentContext_lazy = () -> SettlementOrCorporateActionEvent14Choice.mmObject();
			isDerived = false;
			xmlTag = "CorpActnEvtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEventType";
			definition = "Specifies the type of corporate event.";
			nextVersions_lazy = () -> Arrays.asList(SettlementOrCorporateActionEvent17Choice.mmCorporateActionEventType);
			previousVersion_lazy = () -> SettlementOrCorporateActionEvent10Choice.mmCorporateActionEventType;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.choice.CorporateActionEventType30Choice.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SettlementOrCorporateActionEvent14Choice.mmSecuritiesTransactionType, SettlementOrCorporateActionEvent14Choice.mmCorporateActionEventType);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementOrCorporateActionEvent14Choice";
				definition = "Choice of transaction type, corporate action event or settlement transaction.";
				nextVersions_lazy = () -> Arrays.asList(SettlementOrCorporateActionEvent17Choice.mmObject());
				previousVersion_lazy = () -> SettlementOrCorporateActionEvent10Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "SctiesTxTp", required = true)
	public SecuritiesTransactionType19Choice getSecuritiesTransactionType() {
		return securitiesTransactionType;
	}

	public void setSecuritiesTransactionType(com.tools20022.repository.choice.SecuritiesTransactionType19Choice securitiesTransactionType) {
		this.securitiesTransactionType = securitiesTransactionType;
	}

	@XmlElement(name = "CorpActnEvtTp", required = true)
	public CorporateActionEventType30Choice getCorporateActionEventType() {
		return corporateActionEventType;
	}

	public void setCorporateActionEventType(com.tools20022.repository.choice.CorporateActionEventType30Choice corporateActionEventType) {
		this.corporateActionEventType = corporateActionEventType;
	}
}