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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.reda.NettingCutOffReferenceDataReportV01;
import com.tools20022.repository.choice.PartyIdentification73Choice;
import com.tools20022.repository.entity.ClearingMemberRole;
import com.tools20022.repository.entity.Netting;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.NettingCutOff1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Contains the new, current and previous cut offs for a netting cut off held at
 * the central system.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CutOffData1#mmParticipantIdentification
 * CutOffData1.mmParticipantIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CutOffData1#mmNettingCutOffDetails
 * CutOffData1.mmNettingCutOffDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Netting Netting}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.NettingCutOffReferenceDataReportV01#mmParticipantNettingCutOffData
 * NettingCutOffReferenceDataReportV01.mmParticipantNettingCutOffData}</li>
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
 * "CutOffData1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Contains the new, current and previous cut offs for a netting cut off held at the central system."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CutOffData1", propOrder = {"participantIdentification", "nettingCutOffDetails"})
public class CutOffData1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PtcptId", required = true)
	protected PartyIdentification73Choice participantIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification73Choice
	 * PartyIdentification73Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole
	 * ClearingMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CutOffData1 CutOffData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtcptId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParticipantIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Describes the participant receiving the net report."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CutOffData1, PartyIdentification73Choice> mmParticipantIdentification = new MMMessageAssociationEnd<CutOffData1, PartyIdentification73Choice>() {
		{
			businessComponentTrace_lazy = () -> ClearingMemberRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CutOffData1.mmObject();
			isDerived = false;
			xmlTag = "PtcptId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParticipantIdentification";
			definition = "Describes the participant receiving the net report.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification73Choice.mmObject();
		}

		@Override
		public PartyIdentification73Choice getValue(CutOffData1 obj) {
			return obj.getParticipantIdentification();
		}

		@Override
		public void setValue(CutOffData1 obj, PartyIdentification73Choice value) {
			obj.setParticipantIdentification(value);
		}
	};
	@XmlElement(name = "NetgCutOffDtls", required = true)
	protected List<NettingCutOff1> nettingCutOffDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NettingCutOff1
	 * NettingCutOff1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Netting Netting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CutOffData1 CutOffData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetgCutOffDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NettingCutOffDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the information regarding the updated netting cut off."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CutOffData1, List<NettingCutOff1>> mmNettingCutOffDetails = new MMMessageAssociationEnd<CutOffData1, List<NettingCutOff1>>() {
		{
			businessComponentTrace_lazy = () -> Netting.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CutOffData1.mmObject();
			isDerived = false;
			xmlTag = "NetgCutOffDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NettingCutOffDetails";
			definition = "Specifies the information regarding the updated netting cut off.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> NettingCutOff1.mmObject();
		}

		@Override
		public List<NettingCutOff1> getValue(CutOffData1 obj) {
			return obj.getNettingCutOffDetails();
		}

		@Override
		public void setValue(CutOffData1 obj, List<NettingCutOff1> value) {
			obj.setNettingCutOffDetails(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CutOffData1.mmParticipantIdentification, com.tools20022.repository.msg.CutOffData1.mmNettingCutOffDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(NettingCutOffReferenceDataReportV01.mmParticipantNettingCutOffData);
				trace_lazy = () -> Netting.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CutOffData1";
				definition = "Contains the new, current and previous cut offs for a netting cut off held at the central system.";
			}
		});
		return mmObject_lazy.get();
	}

	public PartyIdentification73Choice getParticipantIdentification() {
		return participantIdentification;
	}

	public CutOffData1 setParticipantIdentification(PartyIdentification73Choice participantIdentification) {
		this.participantIdentification = Objects.requireNonNull(participantIdentification);
		return this;
	}

	public List<NettingCutOff1> getNettingCutOffDetails() {
		return nettingCutOffDetails == null ? nettingCutOffDetails = new ArrayList<>() : nettingCutOffDetails;
	}

	public CutOffData1 setNettingCutOffDetails(List<NettingCutOff1> nettingCutOffDetails) {
		this.nettingCutOffDetails = Objects.requireNonNull(nettingCutOffDetails);
		return this;
	}
}