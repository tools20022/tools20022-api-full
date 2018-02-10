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
import com.tools20022.repository.area.camt.ClaimNonReceiptV03;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.PaymentInvestigationCase;
import com.tools20022.repository.entity.PaymentInvestigationCaseResolution;
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
 * Set of elements used to provide additional cover details for the claim non
 * receipt.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MissingCover2#mmMissingCoverIndicator
 * MissingCover2.mmMissingCoverIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MissingCover2#mmCoverCorrection
 * MissingCover2.mmCoverCorrection}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase
 * PaymentInvestigationCase}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ClaimNonReceiptV03#mmCoverDetails
 * ClaimNonReceiptV03.mmCoverDetails}</li>
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
 * "MissingCover2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements used to provide additional cover details for the claim non receipt."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MissingCover2", propOrder = {"missingCoverIndicator", "coverCorrection"})
public class MissingCover2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MssngCoverInd", required = true)
	protected YesNoIndicator missingCoverIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase#mmMissingCoverIndication
	 * PaymentInvestigationCase.mmMissingCoverIndication}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MissingCover2 MissingCover2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MssngCoverInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingCoverIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether or not the claim is related to a missing cover."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMissingCoverIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentInvestigationCase.mmMissingCoverIndication;
			componentContext_lazy = () -> com.tools20022.repository.msg.MissingCover2.mmObject();
			isDerived = false;
			xmlTag = "MssngCoverInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingCoverIndicator";
			definition = "Indicates whether or not the claim is related to a missing cover.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "CoverCrrctn")
	protected SettlementInformation15 coverCorrection;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation15
	 * SettlementInformation15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#mmCoverCorrection
	 * PaymentInvestigationCaseResolution.mmCoverCorrection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MissingCover2 MissingCover2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CoverCrrctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoverCorrection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements provided to update incorrect settlement information for the cover related to the received payment instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCoverCorrection = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentInvestigationCaseResolution.mmCoverCorrection;
			componentContext_lazy = () -> com.tools20022.repository.msg.MissingCover2.mmObject();
			isDerived = false;
			xmlTag = "CoverCrrctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoverCorrection";
			definition = "Set of elements provided to update incorrect settlement information for the cover related to the received payment instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SettlementInformation15.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MissingCover2.mmMissingCoverIndicator, com.tools20022.repository.msg.MissingCover2.mmCoverCorrection);
				messageBuildingBlock_lazy = () -> Arrays.asList(ClaimNonReceiptV03.mmCoverDetails);
				trace_lazy = () -> PaymentInvestigationCase.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MissingCover2";
				definition = "Set of elements used to provide additional cover details for the claim non receipt.";
			}
		});
		return mmObject_lazy.get();
	}

	public YesNoIndicator getMissingCoverIndicator() {
		return missingCoverIndicator;
	}

	public MissingCover2 setMissingCoverIndicator(YesNoIndicator missingCoverIndicator) {
		this.missingCoverIndicator = Objects.requireNonNull(missingCoverIndicator);
		return this;
	}

	public Optional<SettlementInformation15> getCoverCorrection() {
		return coverCorrection == null ? Optional.empty() : Optional.of(coverCorrection);
	}

	public MissingCover2 setCoverCorrection(com.tools20022.repository.msg.SettlementInformation15 coverCorrection) {
		this.coverCorrection = coverCorrection;
		return this;
	}
}