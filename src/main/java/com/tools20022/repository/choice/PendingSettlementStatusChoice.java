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
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.NoReasonCode;
import com.tools20022.repository.entity.SecuritiesTradeStatusReason;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification1;
import com.tools20022.repository.msg.PendingSettlementStatusReason1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Reason for the pending settlement status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PendingSettlementStatusChoice#mmReason
 * PendingSettlementStatusChoice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PendingSettlementStatusChoice#mmDataSourceScheme
 * PendingSettlementStatusChoice.mmDataSourceScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PendingSettlementStatusChoice#mmNoReason
 * PendingSettlementStatusChoice.mmNoReason}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
 * SecuritiesTradeStatusReason}</li>
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
 * "PendingSettlementStatusChoice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Reason for the pending settlement status."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PendingSettlementStatusChoice", propOrder = {"reason", "dataSourceScheme", "noReason"})
public class PendingSettlementStatusChoice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected PendingSettlementStatusReason1 reason;
	/**
	 * Reason for a pending status in the report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PendingSettlementStatusReason1
	 * PendingSettlementStatusReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmPendingSettlementReason
	 * SecuritiesTradeStatusReason.mmPendingSettlementReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PendingSettlementStatusChoice
	 * PendingSettlementStatusChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for a pending status in the report."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReason = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatusReason.mmPendingSettlementReason;
			componentContext_lazy = () -> PendingSettlementStatusChoice.mmObject();
			isDerived = false;
			xmlTag = "Rsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reason";
			definition = "Reason for a pending status in the report.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PendingSettlementStatusReason1.mmObject();
		}
	};
	protected GenericIdentification1 dataSourceScheme;
	/**
	 * Proprietary identification for a reason of a specific status in the
	 * report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.GenericIdentification1
	 * GenericIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmDataSourceScheme
	 * StatusReason.mmDataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PendingSettlementStatusChoice
	 * PendingSettlementStatusChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DataSrcSchme"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataSourceScheme"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Proprietary identification for a reason of a specific status in the report."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDataSourceScheme = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmDataSourceScheme;
			componentContext_lazy = () -> PendingSettlementStatusChoice.mmObject();
			isDerived = false;
			xmlTag = "DataSrcSchme";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSourceScheme";
			definition = "Proprietary identification for a reason of a specific status in the report.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericIdentification1.mmObject();
		}
	};
	protected NoReasonCode noReason;
	/**
	 * Indicates that there is no reason available or to report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.NoReasonCode
	 * NoReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmNoSpecifiedReason
	 * StatusReason.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PendingSettlementStatusChoice
	 * PendingSettlementStatusChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NoRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that there is no reason available or to report."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNoReason = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmNoSpecifiedReason;
			componentContext_lazy = () -> PendingSettlementStatusChoice.mmObject();
			isDerived = false;
			xmlTag = "NoRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoReason";
			definition = "Indicates that there is no reason available or to report.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NoReasonCode.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PendingSettlementStatusChoice.mmReason, PendingSettlementStatusChoice.mmDataSourceScheme, PendingSettlementStatusChoice.mmNoReason);
				trace_lazy = () -> SecuritiesTradeStatusReason.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PendingSettlementStatusChoice";
				definition = "Reason for the pending settlement status.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Rsn", required = true)
	public PendingSettlementStatusReason1 getReason() {
		return reason;
	}

	public void setReason(PendingSettlementStatusReason1 reason) {
		this.reason = reason;
	}

	@XmlElement(name = "DataSrcSchme", required = true)
	public GenericIdentification1 getDataSourceScheme() {
		return dataSourceScheme;
	}

	public void setDataSourceScheme(GenericIdentification1 dataSourceScheme) {
		this.dataSourceScheme = dataSourceScheme;
	}

	@XmlElement(name = "NoRsn", required = true)
	public NoReasonCode getNoReason() {
		return noReason;
	}

	public void setNoReason(NoReasonCode noReason) {
		this.noReason = noReason;
	}
}