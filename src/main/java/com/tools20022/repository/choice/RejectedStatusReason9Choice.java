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
import com.tools20022.repository.codeset.RejectedStatusReason9Code;
import com.tools20022.repository.datatype.Extended350Code;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Reason for which a transaction report is rejected.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectedStatusReason9Choice#mmReason
 * RejectedStatusReason9Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectedStatusReason9Choice#mmExtendedReason
 * RejectedStatusReason9Choice.mmExtendedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectedStatusReason9Choice#mmDataSourceScheme
 * RejectedStatusReason9Choice.mmDataSourceScheme}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.StatusReason
 * StatusReason}</li>
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
 * "RejectedStatusReason9Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Reason for which a transaction report is rejected."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "RejectedStatusReason9Choice", propOrder = {"reason", "extendedReason", "dataSourceScheme"})
public class RejectedStatusReason9Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected RejectedStatusReason9Code reason;
	/**
	 * Reason for the rejected status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason9Code
	 * RejectedStatusReason9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmRejectedStatusReason
	 * StatusReason.mmRejectedStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.RejectedStatusReason9Choice
	 * RejectedStatusReason9Choice}</li>
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
	 * definition} = "Reason for the rejected status."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReason = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmRejectedStatusReason;
			componentContext_lazy = () -> RejectedStatusReason9Choice.mmObject();
			isDerived = false;
			xmlTag = "Rsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reason";
			definition = "Reason for the rejected status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RejectedStatusReason9Code.mmObject();
		}
	};
	protected Extended350Code extendedReason;
	/**
	 * Reason for the rejected status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Extended350Code
	 * Extended350Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.RejectedStatusReason9Choice
	 * RejectedStatusReason9Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndedRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendedReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the rejected status."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExtendedReason = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RejectedStatusReason9Choice.mmObject();
			isDerived = false;
			xmlTag = "XtndedRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedReason";
			definition = "Reason for the rejected status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Extended350Code.mmObject();
		}
	};
	protected GenericIdentification1 dataSourceScheme;
	/**
	 * Proprietary identification of the reason for the rejected status.
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
	 * {@linkplain com.tools20022.repository.choice.RejectedStatusReason9Choice
	 * RejectedStatusReason9Choice}</li>
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
	 * "Proprietary identification of the reason for the rejected status."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDataSourceScheme = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmDataSourceScheme;
			componentContext_lazy = () -> RejectedStatusReason9Choice.mmObject();
			isDerived = false;
			xmlTag = "DataSrcSchme";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSourceScheme";
			definition = "Proprietary identification of the reason for the rejected status.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericIdentification1.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(RejectedStatusReason9Choice.mmReason, RejectedStatusReason9Choice.mmExtendedReason, RejectedStatusReason9Choice.mmDataSourceScheme);
				trace_lazy = () -> StatusReason.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RejectedStatusReason9Choice";
				definition = "Reason for which a transaction report is rejected.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Rsn", required = true)
	public RejectedStatusReason9Code getReason() {
		return reason;
	}

	public void setReason(RejectedStatusReason9Code reason) {
		this.reason = reason;
	}

	@XmlElement(name = "XtndedRsn", required = true)
	public Extended350Code getExtendedReason() {
		return extendedReason;
	}

	public void setExtendedReason(Extended350Code extendedReason) {
		this.extendedReason = extendedReason;
	}

	@XmlElement(name = "DataSrcSchme", required = true)
	public GenericIdentification1 getDataSourceScheme() {
		return dataSourceScheme;
	}

	public void setDataSourceScheme(GenericIdentification1 dataSourceScheme) {
		this.dataSourceScheme = dataSourceScheme;
	}
}