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
import com.tools20022.repository.msg.Demand4;
import com.tools20022.repository.msg.Undertaking9;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ExtendOrPayQuery2", propOrder = {"undertakingIdentification", "demandDetails", "status"})
public class ExtendOrPayQuery2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "UdrtkgId", required = true)
	protected Undertaking9 undertakingIdentification;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<ExtendOrPayQuery2, Undertaking9> mmUndertakingIdentification = new MMMessageAssociationEnd<ExtendOrPayQuery2, Undertaking9>() {
		{
			businessElementTrace_lazy = () -> UndertakingStatus.mmUndertaking;
			componentContext_lazy = () -> com.tools20022.repository.msg.ExtendOrPayQuery2.mmObject();
			isDerived = false;
			xmlTag = "UdrtkgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingIdentification";
			definition = "Details related to the identification of the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Undertaking9.mmObject();
		}

		@Override
		public Undertaking9 getValue(ExtendOrPayQuery2 obj) {
			return obj.getUndertakingIdentification();
		}

		@Override
		public void setValue(ExtendOrPayQuery2 obj, Undertaking9 value) {
			obj.setUndertakingIdentification(value);
		}
	};
	@XmlElement(name = "DmndDtls", required = true)
	protected Demand4 demandDetails;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<ExtendOrPayQuery2, Demand4> mmDemandDetails = new MMMessageAssociationEnd<ExtendOrPayQuery2, Demand4>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmDemand;
			componentContext_lazy = () -> com.tools20022.repository.msg.ExtendOrPayQuery2.mmObject();
			isDerived = false;
			xmlTag = "DmndDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DemandDetails";
			definition = "Details related to the demand.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Demand4.mmObject();
		}

		@Override
		public Demand4 getValue(ExtendOrPayQuery2 obj) {
			return obj.getDemandDetails();
		}

		@Override
		public void setValue(ExtendOrPayQuery2 obj, Demand4 value) {
			obj.setDemandDetails(value);
		}
	};
	@XmlElement(name = "Sts", required = true)
	protected DemandStatus1Code status;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<ExtendOrPayQuery2, DemandStatus1Code> mmStatus = new MMMessageAttribute<ExtendOrPayQuery2, DemandStatus1Code>() {
		{
			businessElementTrace_lazy = () -> UndertakingStatus.mmDemandStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.ExtendOrPayQuery2.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Processing status reported by the applicant.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DemandStatus1Code.mmObject();
		}

		@Override
		public DemandStatus1Code getValue(ExtendOrPayQuery2 obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(ExtendOrPayQuery2 obj, DemandStatus1Code value) {
			obj.setStatus(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ExtendOrPayQuery2.mmUndertakingIdentification, com.tools20022.repository.msg.ExtendOrPayQuery2.mmDemandDetails,
						com.tools20022.repository.msg.ExtendOrPayQuery2.mmStatus);
				messageBuildingBlock_lazy = () -> Arrays.asList(ExtendOrPayResponseV01.mmExtendOrPayResponseDetails);
				trace_lazy = () -> UndertakingStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ExtendOrPayQuery2";
				definition = "Undertaking extend or pay query details.";
			}
		});
		return mmObject_lazy.get();
	}

	public Undertaking9 getUndertakingIdentification() {
		return undertakingIdentification;
	}

	public ExtendOrPayQuery2 setUndertakingIdentification(Undertaking9 undertakingIdentification) {
		this.undertakingIdentification = Objects.requireNonNull(undertakingIdentification);
		return this;
	}

	public Demand4 getDemandDetails() {
		return demandDetails;
	}

	public ExtendOrPayQuery2 setDemandDetails(Demand4 demandDetails) {
		this.demandDetails = Objects.requireNonNull(demandDetails);
		return this;
	}

	public DemandStatus1Code getStatus() {
		return status;
	}

	public ExtendOrPayQuery2 setStatus(DemandStatus1Code status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}
}