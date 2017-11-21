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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.RateAndAmountFormat36Choice;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.Dividend;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Extension for updated additional information
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation5SD3#mmPlaceAndName
 * UpdatedAdditionalInformation5SD3.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation5SD3#mmDistributionAmountPerShare
 * UpdatedAdditionalInformation5SD3.mmDistributionAmountPerShare}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation5SD3#mmNetAssetDecreaseRatio
 * UpdatedAdditionalInformation5SD3.mmNetAssetDecreaseRatio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation5SD3#mmAccumulatedProfitPerShare
 * UpdatedAdditionalInformation5SD3.mmAccumulatedProfitPerShare}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation5SD3#mmDeemedDividendPerShare
 * UpdatedAdditionalInformation5SD3.mmDeemedDividendPerShare}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation5SD3#mmResidualDistributionAmountPerShare
 * UpdatedAdditionalInformation5SD3.mmResidualDistributionAmountPerShare}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Dividend Dividend}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UpdatedAdditionalInformation5SD3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Extension for updated additional information"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation5SD1
 * UpdatedAdditionalInformation5SD1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "UpdatedAdditionalInformation5SD3", propOrder = {"placeAndName", "distributionAmountPerShare", "netAssetDecreaseRatio", "accumulatedProfitPerShare", "deemedDividendPerShare", "residualDistributionAmountPerShare"})
public class UpdatedAdditionalInformation5SD3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max350Text placeAndName;
	/**
	 * Unambiguous reference to the location where the supplementary data must
	 * be inserted in the message instance. <br>
	 * <br>
	 * In the case of XML, this is expressed by a valid XPath.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation5SD3
	 * UpdatedAdditionalInformation5SD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous reference to the location where the supplementary data must be inserted in the message instance. \r\n\r\nIn the case of XML, this is expressed by a valid XPath."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation5SD1#mmPlaceAndName
	 * UpdatedAdditionalInformation5SD1.mmPlaceAndName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> UpdatedAdditionalInformation5SD3.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "Unambiguous reference to the location where the supplementary data must be inserted in the message instance. \r\n\r\nIn the case of XML, this is expressed by a valid XPath.";
			previousVersion_lazy = () -> UpdatedAdditionalInformation5SD1.mmPlaceAndName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected RateAndAmountFormat36Choice distributionAmountPerShare;
	/**
	 * Total distribution fund rate per share.<br>
	 * 一株あたりの交付金先等の額
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat36Choice
	 * RateAndAmountFormat36Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation5SD3
	 * UpdatedAdditionalInformation5SD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DstrbtnAmtPerShr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DistributionAmountPerShare"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total distribution fund rate per share.\r\n一株あたりの交付金先等の額"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation5SD1#mmDistributionAmountPerShare
	 * UpdatedAdditionalInformation5SD1.mmDistributionAmountPerShare}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDistributionAmountPerShare = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> UpdatedAdditionalInformation5SD3.mmObject();
			isDerived = false;
			xmlTag = "DstrbtnAmtPerShr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DistributionAmountPerShare";
			definition = "Total distribution fund rate per share.\r\n一株あたりの交付金先等の額";
			previousVersion_lazy = () -> UpdatedAdditionalInformation5SD1.mmDistributionAmountPerShare;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat36Choice.mmObject();
		}
	};
	protected PercentageRate netAssetDecreaseRatio;
	/**
	 * Rate information of how much net asset decrease happens as a result of
	 * the fund distribution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmGrossDividend
	 * Dividend.mmGrossDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation5SD3
	 * UpdatedAdditionalInformation5SD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetAsstDcrRatio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAssetDecreaseRatio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate information of how much net asset decrease happens as a result of the fund distribution."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation5SD1#mmNetAssetDecreaseRatio
	 * UpdatedAdditionalInformation5SD1.mmNetAssetDecreaseRatio}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNetAssetDecreaseRatio = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Dividend.mmGrossDividend;
			componentContext_lazy = () -> UpdatedAdditionalInformation5SD3.mmObject();
			isDerived = false;
			xmlTag = "NetAsstDcrRatio";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetAssetDecreaseRatio";
			definition = "Rate information of how much net asset decrease happens as a result of the fund distribution.";
			previousVersion_lazy = () -> UpdatedAdditionalInformation5SD1.mmNetAssetDecreaseRatio;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected RateAndAmountFormat36Choice accumulatedProfitPerShare;
	/**
	 * Distribution amount of accumulated profit per share.<br>
	 * 一株あたり利益剰余金の額
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat36Choice
	 * RateAndAmountFormat36Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmGrossDividend
	 * Dividend.mmGrossDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation5SD3
	 * UpdatedAdditionalInformation5SD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcmltdPrftPerShr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccumulatedProfitPerShare"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Distribution amount of accumulated profit per share.\r\n一株あたり利益剰余金の額"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation5SD1#mmAccumulatedProfitPerShare
	 * UpdatedAdditionalInformation5SD1.mmAccumulatedProfitPerShare}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccumulatedProfitPerShare = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Dividend.mmGrossDividend;
			componentContext_lazy = () -> UpdatedAdditionalInformation5SD3.mmObject();
			isDerived = false;
			xmlTag = "AcmltdPrftPerShr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccumulatedProfitPerShare";
			definition = "Distribution amount of accumulated profit per share.\r\n一株あたり利益剰余金の額";
			previousVersion_lazy = () -> UpdatedAdditionalInformation5SD1.mmAccumulatedProfitPerShare;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat36Choice.mmObject();
		}
	};
	protected RateAndAmountFormat36Choice deemedDividendPerShare;
	/**
	 * Taxable distribution amount of dividend.<br>
	 * 一株あたりみなし配当の額
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat36Choice
	 * RateAndAmountFormat36Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation5SD3
	 * UpdatedAdditionalInformation5SD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DmdDvddPerShr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeemedDividendPerShare"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Taxable distribution amount of dividend.\r\n一株あたりみなし配当の額"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation5SD1#mmDeemedDividendPerShare
	 * UpdatedAdditionalInformation5SD1.mmDeemedDividendPerShare}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeemedDividendPerShare = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> UpdatedAdditionalInformation5SD3.mmObject();
			isDerived = false;
			xmlTag = "DmdDvddPerShr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeemedDividendPerShare";
			definition = "Taxable distribution amount of dividend.\r\n一株あたりみなし配当の額";
			previousVersion_lazy = () -> UpdatedAdditionalInformation5SD1.mmDeemedDividendPerShare;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat36Choice.mmObject();
		}
	};
	protected RateAndAmountFormat36Choice residualDistributionAmountPerShare;
	/**
	 * Tax exempted distribution amount of dividend. <br>
	 * 一株あたりみなし譲渡収入の額
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat36Choice
	 * RateAndAmountFormat36Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation5SD3
	 * UpdatedAdditionalInformation5SD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RsdlDstrbtnAmtPerShr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResidualDistributionAmountPerShare"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax exempted distribution amount of dividend.  \r\n一株あたりみなし譲渡収入の額"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation5SD1#mmResidualDistributionAmountPerShare
	 * UpdatedAdditionalInformation5SD1.mmResidualDistributionAmountPerShare}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmResidualDistributionAmountPerShare = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> UpdatedAdditionalInformation5SD3.mmObject();
			isDerived = false;
			xmlTag = "RsdlDstrbtnAmtPerShr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResidualDistributionAmountPerShare";
			definition = "Tax exempted distribution amount of dividend.  \r\n一株あたりみなし譲渡収入の額";
			previousVersion_lazy = () -> UpdatedAdditionalInformation5SD1.mmResidualDistributionAmountPerShare;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat36Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(UpdatedAdditionalInformation5SD3.mmPlaceAndName, UpdatedAdditionalInformation5SD3.mmDistributionAmountPerShare, UpdatedAdditionalInformation5SD3.mmNetAssetDecreaseRatio,
						UpdatedAdditionalInformation5SD3.mmAccumulatedProfitPerShare, UpdatedAdditionalInformation5SD3.mmDeemedDividendPerShare, UpdatedAdditionalInformation5SD3.mmResidualDistributionAmountPerShare);
				trace_lazy = () -> Dividend.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "UpdatedAdditionalInformation5SD3";
				definition = "Extension for updated additional information";
				previousVersion_lazy = () -> UpdatedAdditionalInformation5SD1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PlcAndNm")
	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public void setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
	}

	@XmlElement(name = "DstrbtnAmtPerShr")
	public RateAndAmountFormat36Choice getDistributionAmountPerShare() {
		return distributionAmountPerShare;
	}

	public void setDistributionAmountPerShare(RateAndAmountFormat36Choice distributionAmountPerShare) {
		this.distributionAmountPerShare = distributionAmountPerShare;
	}

	@XmlElement(name = "NetAsstDcrRatio")
	public PercentageRate getNetAssetDecreaseRatio() {
		return netAssetDecreaseRatio;
	}

	public void setNetAssetDecreaseRatio(PercentageRate netAssetDecreaseRatio) {
		this.netAssetDecreaseRatio = netAssetDecreaseRatio;
	}

	@XmlElement(name = "AcmltdPrftPerShr")
	public RateAndAmountFormat36Choice getAccumulatedProfitPerShare() {
		return accumulatedProfitPerShare;
	}

	public void setAccumulatedProfitPerShare(RateAndAmountFormat36Choice accumulatedProfitPerShare) {
		this.accumulatedProfitPerShare = accumulatedProfitPerShare;
	}

	@XmlElement(name = "DmdDvddPerShr")
	public RateAndAmountFormat36Choice getDeemedDividendPerShare() {
		return deemedDividendPerShare;
	}

	public void setDeemedDividendPerShare(RateAndAmountFormat36Choice deemedDividendPerShare) {
		this.deemedDividendPerShare = deemedDividendPerShare;
	}

	@XmlElement(name = "RsdlDstrbtnAmtPerShr")
	public RateAndAmountFormat36Choice getResidualDistributionAmountPerShare() {
		return residualDistributionAmountPerShare;
	}

	public void setResidualDistributionAmountPerShare(RateAndAmountFormat36Choice residualDistributionAmountPerShare) {
		this.residualDistributionAmountPerShare = residualDistributionAmountPerShare;
	}
}