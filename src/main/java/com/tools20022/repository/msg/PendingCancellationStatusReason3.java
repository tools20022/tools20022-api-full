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
import com.tools20022.repository.choice.PendingCancellationReason1Choice;
import com.tools20022.repository.datatype.Max210Text;
import com.tools20022.repository.entity.CorporateActionStatusReason;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies reasons for the pending cancellation status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason3#mmReasonCode
 * PendingCancellationStatusReason3.mmReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason3#mmAdditionalReasonInformation
 * PendingCancellationStatusReason3.mmAdditionalReasonInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason
 * CorporateActionStatusReason}</li>
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
 * "PendingCancellationStatusReason3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies reasons for the pending cancellation status."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason5
 * PendingCancellationStatusReason5}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason1
 * PendingCancellationStatusReason1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PendingCancellationStatusReason3", propOrder = {"reasonCode", "additionalReasonInformation"})
public class PendingCancellationStatusReason3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected PendingCancellationReason1Choice reasonCode;
	/**
	 * Specifies the reason why the cancellation request is pending.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationReason1Choice
	 * PendingCancellationReason1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmPendingReason
	 * StatusReason.mmPendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason3
	 * PendingCancellationStatusReason3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RsnCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReasonCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason why the cancellation request is pending."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason5#mmReasonCode
	 * PendingCancellationStatusReason5.mmReasonCode}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReasonCode = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmPendingReason;
			componentContext_lazy = () -> PendingCancellationStatusReason3.mmObject();
			isDerived = false;
			xmlTag = "RsnCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReasonCode";
			definition = "Specifies the reason why the cancellation request is pending.";
			nextVersions_lazy = () -> Arrays.asList(PendingCancellationStatusReason5.mmReasonCode);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PendingCancellationReason1Choice.mmObject();
		}
	};
	protected Max210Text additionalReasonInformation;
	/**
	 * Provides additional information about the processed instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max210Text
	 * Max210Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmReason
	 * StatusReason.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason3
	 * PendingCancellationStatusReason3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlRsnInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional information about the processed instruction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason5#mmAdditionalReasonInformation
	 * PendingCancellationStatusReason5.mmAdditionalReasonInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalReasonInformation = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmReason;
			componentContext_lazy = () -> PendingCancellationStatusReason3.mmObject();
			isDerived = false;
			xmlTag = "AddtlRsnInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInformation";
			definition = "Provides additional information about the processed instruction.";
			nextVersions_lazy = () -> Arrays.asList(PendingCancellationStatusReason5.mmAdditionalReasonInformation);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max210Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PendingCancellationStatusReason3.mmReasonCode, PendingCancellationStatusReason3.mmAdditionalReasonInformation);
				trace_lazy = () -> CorporateActionStatusReason.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PendingCancellationStatusReason3";
				definition = "Specifies reasons for the pending cancellation status.";
				nextVersions_lazy = () -> Arrays.asList(PendingCancellationStatusReason5.mmObject());
				previousVersion_lazy = () -> PendingCancellationStatusReason1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "RsnCd", required = true)
	public PendingCancellationReason1Choice getReasonCode() {
		return reasonCode;
	}

	public void setReasonCode(PendingCancellationReason1Choice reasonCode) {
		this.reasonCode = reasonCode;
	}

	@XmlElement(name = "AddtlRsnInf")
	public Max210Text getAdditionalReasonInformation() {
		return additionalReasonInformation;
	}

	public void setAdditionalReasonInformation(Max210Text additionalReasonInformation) {
		this.additionalReasonInformation = additionalReasonInformation;
	}
}