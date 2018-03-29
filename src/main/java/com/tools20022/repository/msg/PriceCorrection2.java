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
import com.tools20022.repository.area.reda.PriceReportCorrectionV02;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Extension1;
import com.tools20022.repository.msg.PriceValuation2;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Original and corrected price information of an investment fund.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceCorrection2#mmPreviouslySentPriceDetails
 * PriceCorrection2.mmPreviouslySentPriceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceCorrection2#mmCorrectedPriceDetails
 * PriceCorrection2.mmCorrectedPriceDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceCorrection2#mmExtension
 * PriceCorrection2.mmExtension}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCorrectionV02#mmPriceCorrectionDetails
 * PriceReportCorrectionV02.mmPriceCorrectionDetails}</li>
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
 * "PriceCorrection2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Original and corrected price information of an investment fund."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PriceCorrection2", propOrder = {"previouslySentPriceDetails", "correctedPriceDetails", "extension"})
public class PriceCorrection2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PrevslySntPricDtls", required = true)
	protected PriceValuation2 previouslySentPriceDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PriceValuation2
	 * PriceValuation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceCorrection2
	 * PriceCorrection2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrevslySntPricDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviouslySentPriceDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the price valuation of a financial instrument sent in a previous price report."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PriceCorrection2, PriceValuation2> mmPreviouslySentPriceDetails = new MMMessageAssociationEnd<PriceCorrection2, PriceValuation2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PriceCorrection2.mmObject();
			isDerived = false;
			xmlTag = "PrevslySntPricDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviouslySentPriceDetails";
			definition = "Information related to the price valuation of a financial instrument sent in a previous price report.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PriceValuation2.mmObject();
		}

		@Override
		public PriceValuation2 getValue(PriceCorrection2 obj) {
			return obj.getPreviouslySentPriceDetails();
		}

		@Override
		public void setValue(PriceCorrection2 obj, PriceValuation2 value) {
			obj.setPreviouslySentPriceDetails(value);
		}
	};
	@XmlElement(name = "CrrctdPricDtls")
	protected PriceValuation2 correctedPriceDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PriceValuation2
	 * PriceValuation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceCorrection2
	 * PriceCorrection2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CrrctdPricDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorrectedPriceDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the new price valuation of a financial instrument, which overrides previously sent information."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PriceCorrection2, Optional<PriceValuation2>> mmCorrectedPriceDetails = new MMMessageAssociationEnd<PriceCorrection2, Optional<PriceValuation2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PriceCorrection2.mmObject();
			isDerived = false;
			xmlTag = "CrrctdPricDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorrectedPriceDetails";
			definition = "Information related to the new price valuation of a financial instrument, which overrides previously sent information.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriceValuation2.mmObject();
		}

		@Override
		public Optional<PriceValuation2> getValue(PriceCorrection2 obj) {
			return obj.getCorrectedPriceDetails();
		}

		@Override
		public void setValue(PriceCorrection2 obj, Optional<PriceValuation2> value) {
			obj.setCorrectedPriceDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "Xtnsn")
	protected List<Extension1> extension;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Extension1 Extension1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceCorrection2
	 * PriceCorrection2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Xtnsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Extension"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PriceCorrection2, List<Extension1>> mmExtension = new MMMessageAssociationEnd<PriceCorrection2, List<Extension1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PriceCorrection2.mmObject();
			isDerived = false;
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Extension1.mmObject();
		}

		@Override
		public List<Extension1> getValue(PriceCorrection2 obj) {
			return obj.getExtension();
		}

		@Override
		public void setValue(PriceCorrection2 obj, List<Extension1> value) {
			obj.setExtension(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PriceCorrection2.mmPreviouslySentPriceDetails, com.tools20022.repository.msg.PriceCorrection2.mmCorrectedPriceDetails,
						com.tools20022.repository.msg.PriceCorrection2.mmExtension);
				messageBuildingBlock_lazy = () -> Arrays.asList(PriceReportCorrectionV02.mmPriceCorrectionDetails);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PriceCorrection2";
				definition = "Original and corrected price information of an investment fund.";
			}
		});
		return mmObject_lazy.get();
	}

	public PriceValuation2 getPreviouslySentPriceDetails() {
		return previouslySentPriceDetails;
	}

	public PriceCorrection2 setPreviouslySentPriceDetails(PriceValuation2 previouslySentPriceDetails) {
		this.previouslySentPriceDetails = Objects.requireNonNull(previouslySentPriceDetails);
		return this;
	}

	public Optional<PriceValuation2> getCorrectedPriceDetails() {
		return correctedPriceDetails == null ? Optional.empty() : Optional.of(correctedPriceDetails);
	}

	public PriceCorrection2 setCorrectedPriceDetails(PriceValuation2 correctedPriceDetails) {
		this.correctedPriceDetails = correctedPriceDetails;
		return this;
	}

	public List<Extension1> getExtension() {
		return extension == null ? extension = new ArrayList<>() : extension;
	}

	public PriceCorrection2 setExtension(List<Extension1> extension) {
		this.extension = Objects.requireNonNull(extension);
		return this;
	}
}