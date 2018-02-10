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
import com.tools20022.repository.area.pain.MandateAmendmentRequestV04;
import com.tools20022.repository.choice.OriginalMandate3Choice;
import com.tools20022.repository.entity.DirectDebitMandate;
import com.tools20022.repository.entity.Mandate;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identifies the mandate to be amended and gives details of the new mandate.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateAmendment4#mmOriginalMessageInformation
 * MandateAmendment4.mmOriginalMessageInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateAmendment4#mmAmendmentReason
 * MandateAmendment4.mmAmendmentReason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateAmendment4#mmMandate
 * MandateAmendment4.mmMandate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateAmendment4#mmOriginalMandate
 * MandateAmendment4.mmOriginalMandate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateAmendment4#mmSupplementaryData
 * MandateAmendment4.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Mandate Mandate}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateAmendmentRequestV04#mmUnderlyingAmendmentDetails
 * MandateAmendmentRequestV04.mmUnderlyingAmendmentDetails}</li>
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
 * "MandateAmendment4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the mandate to be amended and gives details of the new mandate."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.MandateAmendment5
 * MandateAmendment5}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.MandateAmendment3
 * MandateAmendment3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MandateAmendment4", propOrder = {"originalMessageInformation", "amendmentReason", "mandate", "originalMandate", "supplementaryData"})
public class MandateAmendment4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OrgnlMsgInf")
	protected OriginalMessageInformation1 originalMessageInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.OriginalMessageInformation1
	 * OriginalMessageInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateAmendment4
	 * MandateAmendment4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlMsgInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalMessageInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides information on the original message."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateAmendment5#mmOriginalMessageInformation
	 * MandateAmendment5.mmOriginalMessageInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MandateAmendment3#mmOriginalMessageInformation
	 * MandateAmendment3.mmOriginalMessageInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalMessageInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MandateAmendment4.mmObject();
			isDerived = false;
			xmlTag = "OrgnlMsgInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalMessageInformation";
			definition = "Provides information on the original message.";
			nextVersions_lazy = () -> Arrays.asList(MandateAmendment5.mmOriginalMessageInformation);
			previousVersion_lazy = () -> MandateAmendment3.mmOriginalMessageInformation;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.OriginalMessageInformation1.mmObject();
		}
	};
	@XmlElement(name = "AmdmntRsn", required = true)
	protected MandateAmendmentReason1 amendmentReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.MandateAmendmentReason1
	 * MandateAmendmentReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmStatusReason
	 * Status.mmStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateAmendment4
	 * MandateAmendment4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmdmntRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmendmentReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides detailed information on the amendment reason."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateAmendment5#mmAmendmentReason
	 * MandateAmendment5.mmAmendmentReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MandateAmendment3#mmAmendmentReason
	 * MandateAmendment3.mmAmendmentReason}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAmendmentReason = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.MandateAmendment4.mmObject();
			isDerived = false;
			xmlTag = "AmdmntRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmendmentReason";
			definition = "Provides detailed information on the amendment reason.";
			nextVersions_lazy = () -> Arrays.asList(MandateAmendment5.mmAmendmentReason);
			previousVersion_lazy = () -> MandateAmendment3.mmAmendmentReason;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.MandateAmendmentReason1.mmObject();
		}
	};
	@XmlElement(name = "Mndt", required = true)
	protected Mandate6 mandate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Mandate6 Mandate6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate
	 * DirectDebitMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateAmendment4
	 * MandateAmendment4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mndt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mandate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the amended mandate data."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateAmendment5#mmMandate
	 * MandateAmendment5.mmMandate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MandateAmendment3#mmMandate
	 * MandateAmendment3.mmMandate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMandate = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> DirectDebitMandate.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.MandateAmendment4.mmObject();
			isDerived = false;
			xmlTag = "Mndt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Mandate";
			definition = "Provides the amended mandate data.";
			nextVersions_lazy = () -> Arrays.asList(MandateAmendment5.mmMandate);
			previousVersion_lazy = () -> MandateAmendment3.mmMandate;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Mandate6.mmObject();
		}
	};
	@XmlElement(name = "OrgnlMndt", required = true)
	protected OriginalMandate3Choice originalMandate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.OriginalMandate3Choice
	 * OriginalMandate3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Mandate Mandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateAmendment4
	 * MandateAmendment4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlMndt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalMandate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the original mandate data."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateAmendment5#mmOriginalMandate
	 * MandateAmendment5.mmOriginalMandate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MandateAmendment3#mmOriginalMandate
	 * MandateAmendment3.mmOriginalMandate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalMandate = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Mandate.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.MandateAmendment4.mmObject();
			isDerived = false;
			xmlTag = "OrgnlMndt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalMandate";
			definition = "Provides the original mandate data.";
			nextVersions_lazy = () -> Arrays.asList(MandateAmendment5.mmOriginalMandate);
			previousVersion_lazy = () -> MandateAmendment3.mmOriginalMandate;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> OriginalMandate3Choice.mmObject();
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<com.tools20022.repository.msg.SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateAmendment4
	 * MandateAmendment4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateAmendment5#mmSupplementaryData
	 * MandateAmendment5.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MandateAmendment3#mmSupplementaryData
	 * MandateAmendment3.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSupplementaryData = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MandateAmendment4.mmObject();
			isDerived = false;
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(MandateAmendment5.mmSupplementaryData);
			previousVersion_lazy = () -> MandateAmendment3.mmSupplementaryData;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.SupplementaryData1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateAmendment4.mmOriginalMessageInformation, com.tools20022.repository.msg.MandateAmendment4.mmAmendmentReason,
						com.tools20022.repository.msg.MandateAmendment4.mmMandate, com.tools20022.repository.msg.MandateAmendment4.mmOriginalMandate, com.tools20022.repository.msg.MandateAmendment4.mmSupplementaryData);
				messageBuildingBlock_lazy = () -> Arrays.asList(MandateAmendmentRequestV04.mmUnderlyingAmendmentDetails);
				trace_lazy = () -> Mandate.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MandateAmendment4";
				definition = "Identifies the mandate to be amended and gives details of the new mandate.";
				nextVersions_lazy = () -> Arrays.asList(MandateAmendment5.mmObject());
				previousVersion_lazy = () -> MandateAmendment3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<OriginalMessageInformation1> getOriginalMessageInformation() {
		return originalMessageInformation == null ? Optional.empty() : Optional.of(originalMessageInformation);
	}

	public MandateAmendment4 setOriginalMessageInformation(com.tools20022.repository.msg.OriginalMessageInformation1 originalMessageInformation) {
		this.originalMessageInformation = originalMessageInformation;
		return this;
	}

	public MandateAmendmentReason1 getAmendmentReason() {
		return amendmentReason;
	}

	public MandateAmendment4 setAmendmentReason(com.tools20022.repository.msg.MandateAmendmentReason1 amendmentReason) {
		this.amendmentReason = Objects.requireNonNull(amendmentReason);
		return this;
	}

	public Mandate6 getMandate() {
		return mandate;
	}

	public MandateAmendment4 setMandate(com.tools20022.repository.msg.Mandate6 mandate) {
		this.mandate = Objects.requireNonNull(mandate);
		return this;
	}

	public OriginalMandate3Choice getOriginalMandate() {
		return originalMandate;
	}

	public MandateAmendment4 setOriginalMandate(OriginalMandate3Choice originalMandate) {
		this.originalMandate = Objects.requireNonNull(originalMandate);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public MandateAmendment4 setSupplementaryData(List<com.tools20022.repository.msg.SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}
}