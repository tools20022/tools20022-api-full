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
import com.tools20022.repository.area.seev.CorporateActionCancellationAdvice002V06;
import com.tools20022.repository.area.seev.CorporateActionCancellationAdvice002V08;
import com.tools20022.repository.codeset.CorporateActionCancellationReason1Code;
import com.tools20022.repository.datatype.RestrictedFINXMax140Text;
import com.tools20022.repository.entity.CorporateActionNotification;
import com.tools20022.repository.entity.CorporateActionStatus;
import com.tools20022.repository.entity.CorporateActionStatusReason;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CorporateActionEventStatus1;
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
 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellation4#mmCancellationReasonCode
 * CorporateActionCancellation4.mmCancellationReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellation4#mmCancellationReason
 * CorporateActionCancellation4.mmCancellationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellation4#mmProcessingStatus
 * CorporateActionCancellation4.mmProcessingStatus}</li>
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
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdvice002V06#mmCancellationAdviceGeneralInformation
 * CorporateActionCancellationAdvice002V06.
 * mmCancellationAdviceGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdvice002V08#mmCancellationAdviceGeneralInformation
 * CorporateActionCancellationAdvice002V08.
 * mmCancellationAdviceGeneralInformation}</li>
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
 * "CorporateActionCancellation4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Corporate action event cancellation status and reason."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionCancellation4", propOrder = {"cancellationReasonCode", "cancellationReason", "processingStatus"})
public class CorporateActionCancellation4 {

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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellation4
	 * CorporateActionCancellation4}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionCancellation4, CorporateActionCancellationReason1Code> mmCancellationReasonCode = new MMMessageAttribute<CorporateActionCancellation4, CorporateActionCancellationReason1Code>() {
		{
			businessElementTrace_lazy = () -> CorporateActionStatusReason.mmCorporateActionCancellationReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionCancellation4.mmObject();
			isDerived = false;
			xmlTag = "CxlRsnCd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":24B::CAND//4!c"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationReasonCode";
			definition = "Specifies reasons for cancellation of a corporate action event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionCancellationReason1Code.mmObject();
		}

		@Override
		public CorporateActionCancellationReason1Code getValue(CorporateActionCancellation4 obj) {
			return obj.getCancellationReasonCode();
		}

		@Override
		public void setValue(CorporateActionCancellation4 obj, CorporateActionCancellationReason1Code value) {
			obj.setCancellationReasonCode(value);
		}
	};
	@XmlElement(name = "CxlRsn")
	protected RestrictedFINXMax140Text cancellationReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax140Text
	 * RestrictedFINXMax140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason#mmCorporateActionCancellationReason
	 * CorporateActionStatusReason.mmCorporateActionCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellation4
	 * CorporateActionCancellation4}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionCancellation4, Optional<RestrictedFINXMax140Text>> mmCancellationReason = new MMMessageAttribute<CorporateActionCancellation4, Optional<RestrictedFINXMax140Text>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionStatusReason.mmCorporateActionCancellationReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionCancellation4.mmObject();
			isDerived = false;
			xmlTag = "CxlRsn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":24B::CAND"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationReason";
			definition = "Additional information about cancellation of a corporate action event.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax140Text.mmObject();
		}

		@Override
		public Optional<RestrictedFINXMax140Text> getValue(CorporateActionCancellation4 obj) {
			return obj.getCancellationReason();
		}

		@Override
		public void setValue(CorporateActionCancellation4 obj, Optional<RestrictedFINXMax140Text> value) {
			obj.setCancellationReason(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellation4
	 * CorporateActionCancellation4}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionCancellation4, CorporateActionEventStatus1> mmProcessingStatus = new MMMessageAssociationEnd<CorporateActionCancellation4, CorporateActionEventStatus1>() {
		{
			businessComponentTrace_lazy = () -> CorporateActionStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionCancellation4.mmObject();
			isDerived = false;
			xmlTag = "PrcgSts";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::PROC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingStatus";
			definition = "Specifies the status of the details of the event.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CorporateActionEventStatus1.mmObject();
		}

		@Override
		public CorporateActionEventStatus1 getValue(CorporateActionCancellation4 obj) {
			return obj.getProcessingStatus();
		}

		@Override
		public void setValue(CorporateActionCancellation4 obj, CorporateActionEventStatus1 value) {
			obj.setProcessingStatus(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionCancellation4.mmCancellationReasonCode, com.tools20022.repository.msg.CorporateActionCancellation4.mmCancellationReason,
						com.tools20022.repository.msg.CorporateActionCancellation4.mmProcessingStatus);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionCancellationAdvice002V06.mmCancellationAdviceGeneralInformation, CorporateActionCancellationAdvice002V08.mmCancellationAdviceGeneralInformation);
				trace_lazy = () -> CorporateActionNotification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionCancellation4";
				definition = "Corporate action event cancellation status and reason.";
			}
		});
		return mmObject_lazy.get();
	}

	public CorporateActionCancellationReason1Code getCancellationReasonCode() {
		return cancellationReasonCode;
	}

	public CorporateActionCancellation4 setCancellationReasonCode(CorporateActionCancellationReason1Code cancellationReasonCode) {
		this.cancellationReasonCode = Objects.requireNonNull(cancellationReasonCode);
		return this;
	}

	public Optional<RestrictedFINXMax140Text> getCancellationReason() {
		return cancellationReason == null ? Optional.empty() : Optional.of(cancellationReason);
	}

	public CorporateActionCancellation4 setCancellationReason(RestrictedFINXMax140Text cancellationReason) {
		this.cancellationReason = cancellationReason;
		return this;
	}

	public CorporateActionEventStatus1 getProcessingStatus() {
		return processingStatus;
	}

	public CorporateActionCancellation4 setProcessingStatus(CorporateActionEventStatus1 processingStatus) {
		this.processingStatus = Objects.requireNonNull(processingStatus);
		return this;
	}
}