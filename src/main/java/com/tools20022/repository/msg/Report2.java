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
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PartyIdentificationAndAccount31;
import com.tools20022.repository.msg.SettlementObligation4;
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
 * Provides details on the settlement obligation report.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Report2#mmNonClearingMember
 * Report2.mmNonClearingMember}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Report2#mmSettlementObligationDetails
 * Report2.mmSettlementObligationDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Report2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides details on the settlement obligation report."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Report5 Report5}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Report2", propOrder = {"nonClearingMember", "settlementObligationDetails"})
public class Report2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "NonClrMmb")
	protected List<PartyIdentificationAndAccount31> nonClearingMember;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount31
	 * PartyIdentificationAndAccount31}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Report2
	 * Report2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NonClrMmb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonClearingMember"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the identification for the non-clearing member. This is mandatory if the clearing member identification equals a general clearing member."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Report5#mmNonClearingMember
	 * Report5.mmNonClearingMember}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Report2, List<PartyIdentificationAndAccount31>> mmNonClearingMember = new MMMessageAssociationEnd<Report2, List<PartyIdentificationAndAccount31>>() {
		{
			businessComponentTrace_lazy = () -> Party.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Report2.mmObject();
			isDerived = false;
			xmlTag = "NonClrMmb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonClearingMember";
			definition = "Provides the identification for the non-clearing member. This is mandatory if the clearing member identification equals a general clearing member.";
			nextVersions_lazy = () -> Arrays.asList(Report5.mmNonClearingMember);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentificationAndAccount31.mmObject();
		}

		@Override
		public List<PartyIdentificationAndAccount31> getValue(Report2 obj) {
			return obj.getNonClearingMember();
		}

		@Override
		public void setValue(Report2 obj, List<PartyIdentificationAndAccount31> value) {
			obj.setNonClearingMember(value);
		}
	};
	@XmlElement(name = "SttlmOblgtnDtls", required = true)
	protected List<SettlementObligation4> settlementObligationDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementObligation4
	 * SettlementObligation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Report2
	 * Report2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmOblgtnDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementObligationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the settlement obligation details."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Report5#mmSettlementObligationDetails
	 * Report5.mmSettlementObligationDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Report2, List<SettlementObligation4>> mmSettlementObligationDetails = new MMMessageAssociationEnd<Report2, List<SettlementObligation4>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Report2.mmObject();
			isDerived = false;
			xmlTag = "SttlmOblgtnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementObligationDetails";
			definition = "Provides information about the settlement obligation details.";
			nextVersions_lazy = () -> Arrays.asList(Report5.mmSettlementObligationDetails);
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SettlementObligation4.mmObject();
		}

		@Override
		public List<SettlementObligation4> getValue(Report2 obj) {
			return obj.getSettlementObligationDetails();
		}

		@Override
		public void setValue(Report2 obj, List<SettlementObligation4> value) {
			obj.setSettlementObligationDetails(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Report2.mmNonClearingMember, com.tools20022.repository.msg.Report2.mmSettlementObligationDetails);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Report2";
				definition = "Provides details on the settlement obligation report.";
				nextVersions_lazy = () -> Arrays.asList(Report5.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public List<PartyIdentificationAndAccount31> getNonClearingMember() {
		return nonClearingMember == null ? nonClearingMember = new ArrayList<>() : nonClearingMember;
	}

	public Report2 setNonClearingMember(List<PartyIdentificationAndAccount31> nonClearingMember) {
		this.nonClearingMember = Objects.requireNonNull(nonClearingMember);
		return this;
	}

	public List<SettlementObligation4> getSettlementObligationDetails() {
		return settlementObligationDetails == null ? settlementObligationDetails = new ArrayList<>() : settlementObligationDetails;
	}

	public Report2 setSettlementObligationDetails(List<SettlementObligation4> settlementObligationDetails) {
		this.settlementObligationDetails = Objects.requireNonNull(settlementObligationDetails);
		return this;
	}
}