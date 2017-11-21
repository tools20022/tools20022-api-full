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
import com.tools20022.repository.area.pain.MandateCancellationRequestV04;
import com.tools20022.repository.choice.OriginalMandate3Choice;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identifies the mandate to be cancelled.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateCancellation4#mmOriginalMessageInformation
 * MandateCancellation4.mmOriginalMessageInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateCancellation4#mmCancellationReason
 * MandateCancellation4.mmCancellationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateCancellation4#mmOriginalMandate
 * MandateCancellation4.mmOriginalMandate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateCancellation4#mmSupplementaryData
 * MandateCancellation4.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateCancellationRequestV04#mmUnderlyingCancellationDetails
 * MandateCancellationRequestV04.mmUnderlyingCancellationDetails}</li>
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
 * "MandateCancellation4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the mandate to be cancelled."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.MandateCancellation5
 * MandateCancellation5}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.MandateCancellation3
 * MandateCancellation3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "MandateCancellation4", propOrder = {"originalMessageInformation", "cancellationReason", "originalMandate", "supplementaryData"})
public class MandateCancellation4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected OriginalMessageInformation1 originalMessageInformation;
	/**
	 * Provides information on the original message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.OriginalMessageInformation1
	 * OriginalMessageInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateCancellation4
	 * MandateCancellation4}</li>
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
	 * {@linkplain com.tools20022.repository.msg.MandateCancellation5#mmOriginalMessageInformation
	 * MandateCancellation5.mmOriginalMessageInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MandateCancellation3#mmOriginalMessageInformation
	 * MandateCancellation3.mmOriginalMessageInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalMessageInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MandateCancellation4.mmObject();
			isDerived = false;
			xmlTag = "OrgnlMsgInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalMessageInformation";
			definition = "Provides information on the original message.";
			nextVersions_lazy = () -> Arrays.asList(MandateCancellation5.mmOriginalMessageInformation);
			previousVersion_lazy = () -> MandateCancellation3.mmOriginalMessageInformation;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.OriginalMessageInformation1.mmObject();
		}
	};
	protected PaymentCancellationReason1 cancellationReason;
	/**
	 * Provides detailed information on the cancellation reason.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCancellationReason1
	 * PaymentCancellationReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateCancellation4
	 * MandateCancellation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides detailed information on the cancellation reason."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateCancellation5#mmCancellationReason
	 * MandateCancellation5.mmCancellationReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MandateCancellation3#mmCancellationReason
	 * MandateCancellation3.mmCancellationReason}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCancellationReason = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MandateCancellation4.mmObject();
			isDerived = false;
			xmlTag = "CxlRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationReason";
			definition = "Provides detailed information on the cancellation reason.";
			nextVersions_lazy = () -> Arrays.asList(MandateCancellation5.mmCancellationReason);
			previousVersion_lazy = () -> MandateCancellation3.mmCancellationReason;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentCancellationReason1.mmObject();
		}
	};
	protected OriginalMandate3Choice originalMandate;
	/**
	 * Provides the original mandate data.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.OriginalMandate3Choice
	 * OriginalMandate3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateCancellation4
	 * MandateCancellation4}</li>
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
	 * {@linkplain com.tools20022.repository.msg.MandateCancellation5#mmOriginalMandate
	 * MandateCancellation5.mmOriginalMandate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MandateCancellation3#mmOriginalMandate
	 * MandateCancellation3.mmOriginalMandate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalMandate = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MandateCancellation4.mmObject();
			isDerived = false;
			xmlTag = "OrgnlMndt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalMandate";
			definition = "Provides the original mandate data.";
			nextVersions_lazy = () -> Arrays.asList(MandateCancellation5.mmOriginalMandate);
			previousVersion_lazy = () -> MandateCancellation3.mmOriginalMandate;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> OriginalMandate3Choice.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.SupplementaryData1> supplementaryData;
	/**
	 * Additional information that cannot be captured in the structured elements
	 * and/or any other specific block.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.MandateCancellation4
	 * MandateCancellation4}</li>
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
	 * {@linkplain com.tools20022.repository.msg.MandateCancellation5#mmSupplementaryData
	 * MandateCancellation5.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MandateCancellation3#mmSupplementaryData
	 * MandateCancellation3.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSupplementaryData = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MandateCancellation4.mmObject();
			isDerived = false;
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(MandateCancellation5.mmSupplementaryData);
			previousVersion_lazy = () -> MandateCancellation3.mmSupplementaryData;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.SupplementaryData1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(MandateCancellation4.mmOriginalMessageInformation, MandateCancellation4.mmCancellationReason, MandateCancellation4.mmOriginalMandate, MandateCancellation4.mmSupplementaryData);
				messageBuildingBlock_lazy = () -> Arrays.asList(MandateCancellationRequestV04.mmUnderlyingCancellationDetails);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MandateCancellation4";
				definition = "Identifies the mandate to be cancelled.";
				nextVersions_lazy = () -> Arrays.asList(MandateCancellation5.mmObject());
				previousVersion_lazy = () -> MandateCancellation3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "OrgnlMsgInf")
	public OriginalMessageInformation1 getOriginalMessageInformation() {
		return originalMessageInformation;
	}

	public void setOriginalMessageInformation(com.tools20022.repository.msg.OriginalMessageInformation1 originalMessageInformation) {
		this.originalMessageInformation = originalMessageInformation;
	}

	@XmlElement(name = "CxlRsn", required = true)
	public PaymentCancellationReason1 getCancellationReason() {
		return cancellationReason;
	}

	public void setCancellationReason(com.tools20022.repository.msg.PaymentCancellationReason1 cancellationReason) {
		this.cancellationReason = cancellationReason;
	}

	@XmlElement(name = "OrgnlMndt", required = true)
	public OriginalMandate3Choice getOriginalMandate() {
		return originalMandate;
	}

	public void setOriginalMandate(OriginalMandate3Choice originalMandate) {
		this.originalMandate = originalMandate;
	}

	@XmlElement(name = "SplmtryData")
	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<com.tools20022.repository.msg.SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}
}