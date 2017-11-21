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
import com.tools20022.repository.choice.CorporateActionRateSD6Choice;
import com.tools20022.repository.choice.PriceFormatSD2Choice;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides additional information regarding corporate action option securities
 * movement rate details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRateSD8#mmPlaceAndName
 * CorporateActionRateSD8.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRateSD8#mmDeclaredSecurityRate
 * CorporateActionRateSD8.mmDeclaredSecurityRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRateSD8#mmEstimatedRateFlag
 * CorporateActionRateSD8.mmEstimatedRateFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRateSD8#mmDeclaredFeeRate
 * CorporateActionRateSD8.mmDeclaredFeeRate}</li>
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
 * "CorporateActionRateSD8"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action option securities movement rate details."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionRateSD6
 * CorporateActionRateSD6}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CorporateActionRateSD8", propOrder = {"placeAndName", "declaredSecurityRate", "estimatedRateFlag", "declaredFeeRate"})
public class CorporateActionRateSD8 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max350Text placeAndName;
	/**
	 * xPath to the element that is being extended.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRateSD8
	 * CorporateActionRateSD8}</li>
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
	 * definition} = "xPath to the element that is being extended."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRateSD6#mmPlaceAndName
	 * CorporateActionRateSD6.mmPlaceAndName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionRateSD8.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			previousVersion_lazy = () -> CorporateActionRateSD6.mmPlaceAndName;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected CorporateActionRateSD6Choice declaredSecurityRate;
	/**
	 * Corresponding rate of the security being disbursed as a result of the
	 * corporate action as declared by the issuer or offeror on the market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionRateSD6Choice
	 * CorporateActionRateSD6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRateSD8
	 * CorporateActionRateSD8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DclrdSctyRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclaredSecurityRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corresponding rate of the security being disbursed as a result of the corporate action as declared by the issuer or offeror on the market."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRateSD6#mmDeclaredSecurityRate
	 * CorporateActionRateSD6.mmDeclaredSecurityRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeclaredSecurityRate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionRateSD8.mmObject();
			isDerived = false;
			xmlTag = "DclrdSctyRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredSecurityRate";
			definition = "Corresponding rate of the security being disbursed as a result of the corporate action as declared by the issuer or offeror on the market.";
			previousVersion_lazy = () -> CorporateActionRateSD6.mmDeclaredSecurityRate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionRateSD6Choice.mmObject();
		}
	};
	protected YesNoIndicator estimatedRateFlag;
	/**
	 * Denotes whether the rate is approximate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRateSD8
	 * CorporateActionRateSD8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EstmtdRateFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EstimatedRateFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Denotes whether the rate is approximate."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRateSD6#mmEstimatedRateFlag
	 * CorporateActionRateSD6.mmEstimatedRateFlag}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEstimatedRateFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionRateSD8.mmObject();
			isDerived = false;
			xmlTag = "EstmtdRateFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EstimatedRateFlag";
			definition = "Denotes whether the rate is approximate.";
			previousVersion_lazy = () -> CorporateActionRateSD6.mmEstimatedRateFlag;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected PriceFormatSD2Choice declaredFeeRate;
	/**
	 * Rate at which the fee will be charged to a DTC participant.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormatSD2Choice
	 * PriceFormatSD2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRateSD8
	 * CorporateActionRateSD8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DclrdFeeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclaredFeeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate at which the fee will be charged to a DTC participant."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRateSD6#mmDeclaredFeeRate
	 * CorporateActionRateSD6.mmDeclaredFeeRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeclaredFeeRate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionRateSD8.mmObject();
			isDerived = false;
			xmlTag = "DclrdFeeRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredFeeRate";
			definition = "Rate at which the fee will be charged to a DTC participant.";
			previousVersion_lazy = () -> CorporateActionRateSD6.mmDeclaredFeeRate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriceFormatSD2Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionRateSD8.mmPlaceAndName, CorporateActionRateSD8.mmDeclaredSecurityRate, CorporateActionRateSD8.mmEstimatedRateFlag, CorporateActionRateSD8.mmDeclaredFeeRate);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionRateSD8";
				definition = "Provides additional information regarding corporate action option securities movement rate details.";
				previousVersion_lazy = () -> CorporateActionRateSD6.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PlcAndNm", required = true)
	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public void setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
	}

	@XmlElement(name = "DclrdSctyRate")
	public CorporateActionRateSD6Choice getDeclaredSecurityRate() {
		return declaredSecurityRate;
	}

	public void setDeclaredSecurityRate(CorporateActionRateSD6Choice declaredSecurityRate) {
		this.declaredSecurityRate = declaredSecurityRate;
	}

	@XmlElement(name = "EstmtdRateFlg")
	public YesNoIndicator getEstimatedRateFlag() {
		return estimatedRateFlag;
	}

	public void setEstimatedRateFlag(YesNoIndicator estimatedRateFlag) {
		this.estimatedRateFlag = estimatedRateFlag;
	}

	@XmlElement(name = "DclrdFeeRate")
	public PriceFormatSD2Choice getDeclaredFeeRate() {
		return declaredFeeRate;
	}

	public void setDeclaredFeeRate(PriceFormatSD2Choice declaredFeeRate) {
		this.declaredFeeRate = declaredFeeRate;
	}
}