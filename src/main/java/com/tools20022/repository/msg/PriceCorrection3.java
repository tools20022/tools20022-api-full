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
import com.tools20022.repository.area.reda.PriceReportCorrectionV03;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.msg.PriceCorrection3#mmPreviouslySentPriceDetails
 * PriceCorrection3.mmPreviouslySentPriceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceCorrection3#mmCorrectedPriceDetails
 * PriceCorrection3.mmCorrectedPriceDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceCorrection3#mmExtension
 * PriceCorrection3.mmExtension}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCorrectionV03#mmPriceCorrectionDetails
 * PriceReportCorrectionV03.mmPriceCorrectionDetails}</li>
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
 * "PriceCorrection3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Original and corrected price information of an investment fund."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PriceCorrection3", propOrder = {"previouslySentPriceDetails", "correctedPriceDetails", "extension"})
public class PriceCorrection3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected PriceValuation3 previouslySentPriceDetails;
	/**
	 * Information related to the price valuation of a financial instrument sent
	 * in a previous price report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PriceValuation3
	 * PriceValuation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceCorrection3
	 * PriceCorrection3}</li>
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
	public static final MMMessageAssociationEnd mmPreviouslySentPriceDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PriceCorrection3.mmObject();
			isDerived = false;
			xmlTag = "PrevslySntPricDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviouslySentPriceDetails";
			definition = "Information related to the price valuation of a financial instrument sent in a previous price report.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PriceValuation3.mmObject();
		}
	};
	protected PriceValuation3 correctedPriceDetails;
	/**
	 * Information related to the new price valuation of a financial instrument,
	 * which overrides previously sent information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PriceValuation3
	 * PriceValuation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceCorrection3
	 * PriceCorrection3}</li>
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
	public static final MMMessageAssociationEnd mmCorrectedPriceDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PriceCorrection3.mmObject();
			isDerived = false;
			xmlTag = "CrrctdPricDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorrectedPriceDetails";
			definition = "Information related to the new price valuation of a financial instrument, which overrides previously sent information.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PriceValuation3.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Extension1> extension;
	/**
	 * Additional information that cannot be captured in the structured elements
	 * and/or any other specific block.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Extension1 Extension1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceCorrection3
	 * PriceCorrection3}</li>
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
	public static final MMMessageAssociationEnd mmExtension = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PriceCorrection3.mmObject();
			isDerived = false;
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Extension1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PriceCorrection3.mmPreviouslySentPriceDetails, PriceCorrection3.mmCorrectedPriceDetails, PriceCorrection3.mmExtension);
				messageBuildingBlock_lazy = () -> Arrays.asList(PriceReportCorrectionV03.mmPriceCorrectionDetails);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PriceCorrection3";
				definition = "Original and corrected price information of an investment fund.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PrevslySntPricDtls", required = true)
	public PriceValuation3 getPreviouslySentPriceDetails() {
		return previouslySentPriceDetails;
	}

	public void setPreviouslySentPriceDetails(com.tools20022.repository.msg.PriceValuation3 previouslySentPriceDetails) {
		this.previouslySentPriceDetails = previouslySentPriceDetails;
	}

	@XmlElement(name = "CrrctdPricDtls")
	public PriceValuation3 getCorrectedPriceDetails() {
		return correctedPriceDetails;
	}

	public void setCorrectedPriceDetails(com.tools20022.repository.msg.PriceValuation3 correctedPriceDetails) {
		this.correctedPriceDetails = correctedPriceDetails;
	}

	@XmlElement(name = "Xtnsn")
	public List<Extension1> getExtension() {
		return extension;
	}

	public void setExtension(List<com.tools20022.repository.msg.Extension1> extension) {
		this.extension = extension;
	}
}