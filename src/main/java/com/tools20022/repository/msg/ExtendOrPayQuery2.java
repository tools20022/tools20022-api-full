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
import com.tools20022.repository.area.tsrv.ExtendOrPayResponseV01;
import com.tools20022.repository.codeset.DemandStatus1Code;
import com.tools20022.repository.entity.Undertaking;
import com.tools20022.repository.entity.UndertakingStatus;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Undertaking extend or pay query details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendOrPayQuery2#mmUndertakingIdentification
 * ExtendOrPayQuery2.mmUndertakingIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendOrPayQuery2#mmDemandDetails
 * ExtendOrPayQuery2.mmDemandDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ExtendOrPayQuery2#mmStatus
 * ExtendOrPayQuery2.mmStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.UndertakingStatus
 * UndertakingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.ExtendOrPayResponseV01#mmExtendOrPayResponseDetails
 * ExtendOrPayResponseV01.mmExtendOrPayResponseDetails}</li>
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
 * "ExtendOrPayQuery2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Undertaking extend or pay query details."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ExtendOrPayQuery2", propOrder = {"undertakingIdentification", "demandDetails", "status"})
public class ExtendOrPayQuery2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Undertaking9 undertakingIdentification;
	/**
	 * Details related to the identification of the undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Undertaking9
	 * Undertaking9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingStatus#mmUndertaking
	 * UndertakingStatus.mmUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ExtendOrPayQuery2
	 * ExtendOrPayQuery2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UdrtkgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details related to the identification of the undertaking."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUndertakingIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> UndertakingStatus.mmUndertaking;
			componentContext_lazy = () -> ExtendOrPayQuery2.mmObject();
			isDerived = false;
			xmlTag = "UdrtkgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingIdentification";
			definition = "Details related to the identification of the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Undertaking9.mmObject();
		}
	};
	protected Demand4 demandDetails;
	/**
	 * Details related to the demand.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Demand4 Demand4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmDemand
	 * Undertaking.mmDemand}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ExtendOrPayQuery2
	 * ExtendOrPayQuery2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DmndDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DemandDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details related to the demand."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDemandDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmDemand;
			componentContext_lazy = () -> ExtendOrPayQuery2.mmObject();
			isDerived = false;
			xmlTag = "DmndDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DemandDetails";
			definition = "Details related to the demand.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Demand4.mmObject();
		}
	};
	protected DemandStatus1Code status;
	/**
	 * Processing status reported by the applicant.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DemandStatus1Code
	 * DemandStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingStatus#mmDemandStatus
	 * UndertakingStatus.mmDemandStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ExtendOrPayQuery2
	 * ExtendOrPayQuery2}</li>
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
	 * definition} = "Processing status reported by the applicant."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> UndertakingStatus.mmDemandStatus;
			componentContext_lazy = () -> ExtendOrPayQuery2.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Processing status reported by the applicant.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DemandStatus1Code.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ExtendOrPayQuery2.mmUndertakingIdentification, ExtendOrPayQuery2.mmDemandDetails, ExtendOrPayQuery2.mmStatus);
				messageBuildingBlock_lazy = () -> Arrays.asList(ExtendOrPayResponseV01.mmExtendOrPayResponseDetails);
				trace_lazy = () -> UndertakingStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ExtendOrPayQuery2";
				definition = "Undertaking extend or pay query details.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "UdrtkgId", required = true)
	public Undertaking9 getUndertakingIdentification() {
		return undertakingIdentification;
	}

	public void setUndertakingIdentification(com.tools20022.repository.msg.Undertaking9 undertakingIdentification) {
		this.undertakingIdentification = undertakingIdentification;
	}

	@XmlElement(name = "DmndDtls", required = true)
	public Demand4 getDemandDetails() {
		return demandDetails;
	}

	public void setDemandDetails(com.tools20022.repository.msg.Demand4 demandDetails) {
		this.demandDetails = demandDetails;
	}

	@XmlElement(name = "Sts", required = true)
	public DemandStatus1Code getStatus() {
		return status;
	}

	public void setStatus(DemandStatus1Code status) {
		this.status = status;
	}
}