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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV05;
import com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV06;
import com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV07;
import com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV08;
import com.tools20022.repository.codeset.CorporateActionCancellationReason1Code;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.entity.CorporateActionNotification;
import com.tools20022.repository.entity.CorporateActionStatus;
import com.tools20022.repository.entity.CorporateActionStatusReason;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Corporate action event cancellation status and reason.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellation3#mmCancellationReasonCode
 * CorporateActionCancellation3.mmCancellationReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellation3#mmCancellationReason
 * CorporateActionCancellation3.mmCancellationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellation3#mmProcessingStatus
 * CorporateActionCancellation3.mmProcessingStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.CorporateActionNotification
 * CorporateActionNotification}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV05#mmCancellationAdviceGeneralInformation
 * CorporateActionCancellationAdviceV05.mmCancellationAdviceGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV06#mmCancellationAdviceGeneralInformation
 * CorporateActionCancellationAdviceV06.mmCancellationAdviceGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV07#mmCancellationAdviceGeneralInformation
 * CorporateActionCancellationAdviceV07.mmCancellationAdviceGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV08#mmCancellationAdviceGeneralInformation
 * CorporateActionCancellationAdviceV08.mmCancellationAdviceGeneralInformation}</li>
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
 * "CorporateActionCancellation3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Corporate action event cancellation status and reason."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellation1
 * CorporateActionCancellation1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionCancellation3", propOrder = {"cancellationReasonCode", "cancellationReason", "processingStatus"})
public class CorporateActionCancellation3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CxlRsnCd", required = true)
	protected CorporateActionCancellationReason1Code cancellationReasonCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionCancellationReason1Code
	 * CorporateActionCancellationReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason#mmCorporateActionCancellationReason
	 * CorporateActionStatusReason.mmCorporateActionCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellation3
	 * CorporateActionCancellation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlRsnCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :24B::CAND//4!c</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationReasonCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies reasons for cancellation of a corporate action event."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellation1#mmCancellationReasonCode
	 * CorporateActionCancellation1.mmCancellationReasonCode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCancellationReasonCode = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionStatusReason.mmCorporateActionCancellationReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionCancellation3.mmObject();
			isDerived = false;
			xmlTag = "CxlRsnCd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":24B::CAND//4!c"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationReasonCode";
			definition = "Specifies reasons for cancellation of a corporate action event.";
			previousVersion_lazy = () -> CorporateActionCancellation1.mmCancellationReasonCode;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionCancellationReason1Code.mmObject();
		}
	};
	@XmlElement(name = "CxlRsn")
	protected Max140Text cancellationReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason#mmCorporateActionCancellationReason
	 * CorporateActionStatusReason.mmCorporateActionCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellation3
	 * CorporateActionCancellation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :24B::CAND</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information about cancellation of a corporate action event."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellation1#mmCancellationReason
	 * CorporateActionCancellation1.mmCancellationReason}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCancellationReason = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionStatusReason.mmCorporateActionCancellationReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionCancellation3.mmObject();
			isDerived = false;
			xmlTag = "CxlRsn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":24B::CAND"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationReason";
			definition = "Additional information about cancellation of a corporate action event.";
			previousVersion_lazy = () -> CorporateActionCancellation1.mmCancellationReason;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	@XmlElement(name = "PrcgSts", required = true)
	protected CorporateActionEventStatus1 processingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventStatus1
	 * CorporateActionEventStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellation3
	 * CorporateActionCancellation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcgSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::PROC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the status of the details of the event."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellation1#mmProcessingStatus
	 * CorporateActionCancellation1.mmProcessingStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProcessingStatus = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CorporateActionStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionCancellation3.mmObject();
			isDerived = false;
			xmlTag = "PrcgSts";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::PROC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingStatus";
			definition = "Specifies the status of the details of the event.";
			previousVersion_lazy = () -> CorporateActionCancellation1.mmProcessingStatus;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionEventStatus1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionCancellation3.mmCancellationReasonCode, com.tools20022.repository.msg.CorporateActionCancellation3.mmCancellationReason,
						com.tools20022.repository.msg.CorporateActionCancellation3.mmProcessingStatus);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionCancellationAdviceV05.mmCancellationAdviceGeneralInformation, CorporateActionCancellationAdviceV06.mmCancellationAdviceGeneralInformation,
						CorporateActionCancellationAdviceV07.mmCancellationAdviceGeneralInformation, CorporateActionCancellationAdviceV08.mmCancellationAdviceGeneralInformation);
				trace_lazy = () -> CorporateActionNotification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionCancellation3";
				definition = "Corporate action event cancellation status and reason.";
				previousVersion_lazy = () -> CorporateActionCancellation1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public CorporateActionCancellationReason1Code getCancellationReasonCode() {
		return cancellationReasonCode;
	}

	public CorporateActionCancellation3 setCancellationReasonCode(CorporateActionCancellationReason1Code cancellationReasonCode) {
		this.cancellationReasonCode = Objects.requireNonNull(cancellationReasonCode);
		return this;
	}

	public Optional<Max140Text> getCancellationReason() {
		return cancellationReason == null ? Optional.empty() : Optional.of(cancellationReason);
	}

	public CorporateActionCancellation3 setCancellationReason(Max140Text cancellationReason) {
		this.cancellationReason = cancellationReason;
		return this;
	}

	public CorporateActionEventStatus1 getProcessingStatus() {
		return processingStatus;
	}

	public CorporateActionCancellation3 setProcessingStatus(com.tools20022.repository.msg.CorporateActionEventStatus1 processingStatus) {
		this.processingStatus = Objects.requireNonNull(processingStatus);
		return this;
	}
}