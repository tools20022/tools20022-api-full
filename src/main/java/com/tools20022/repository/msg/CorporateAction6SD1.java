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
import com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice;
import com.tools20022.repository.codeset.TargetCompanyAgreementCode;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Extension for mergers.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction6SD1#mmPlaceAndName
 * CorporateAction6SD1.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction6SD1#mmMergerDetails
 * CorporateAction6SD1.mmMergerDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction6SD1#mmTargetCompanyAgreement
 * CorporateAction6SD1.mmTargetCompanyAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction6SD1#mmTotalNumberOfNewSharesIssued
 * CorporateAction6SD1.mmTotalNumberOfNewSharesIssued}</li>
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
 * "CorporateAction6SD1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Extension for mergers."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CorporateAction6SD1", propOrder = {"placeAndName", "mergerDetails", "targetCompanyAgreement", "totalNumberOfNewSharesIssued"})
public class CorporateAction6SD1 {

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
	 * {@linkplain com.tools20022.repository.msg.CorporateAction6SD1
	 * CorporateAction6SD1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateAction6SD1.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "Unambiguous reference to the location where the supplementary data must be inserted in the message instance. \r\n\r\nIn the case of XML, this is expressed by a valid XPath.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected MergerDetailsType1 mergerDetails;
	/**
	 * Provides additional information about mergers.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MergerDetailsType1
	 * MergerDetailsType1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction6SD1
	 * CorporateAction6SD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrgrDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MergerDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides additional information about mergers."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMergerDetails = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateAction6SD1.mmObject();
			isDerived = false;
			xmlTag = "MrgrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MergerDetails";
			definition = "Provides additional information about mergers.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.MergerDetailsType1.mmObject();
		}
	};
	protected TargetCompanyAgreementCode targetCompanyAgreement;
	/**
	 * Agreement of the target company.<br>
	 * TargetCompanyAgreement should only be used for corporate action event
	 * type code TEND. It is not necessary for corporate action event type code
	 * BIDS. <br>
	 * 対象会社の同意の有無<br>
	 * 公開買付のときのみ。（自己株買付のときは無し）
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TargetCompanyAgreementCode
	 * TargetCompanyAgreementCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction6SD1
	 * CorporateAction6SD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrgtCpnyAgrmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TargetCompanyAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agreement of the target company.\r\nTargetCompanyAgreement should only be used for corporate action event type code TEND. It is not necessary for  corporate action event type code BIDS.   \r\n 対象会社の同意の有無\r\n公開買付のときのみ。（自己株買付のときは無し）"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTargetCompanyAgreement = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateAction6SD1.mmObject();
			isDerived = false;
			xmlTag = "TrgtCpnyAgrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TargetCompanyAgreement";
			definition = "Agreement of the target company.\r\nTargetCompanyAgreement should only be used for corporate action event type code TEND. It is not necessary for  corporate action event type code BIDS.   \r\n 対象会社の同意の有無\r\n公開買付のときのみ。（自己株買付のときは無し）";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TargetCompanyAgreementCode.mmObject();
		}
	};
	protected FinancialInstrumentQuantity15Choice totalNumberOfNewSharesIssued;
	/**
	 * Total number of new shares to be issued.<br>
	 * 発行新株式数
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice
	 * FinancialInstrumentQuantity15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction6SD1
	 * CorporateAction6SD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlNbOfNewShrsIssd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNumberOfNewSharesIssued"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total number of new shares to be issued.\r\n発行新株式数"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalNumberOfNewSharesIssued = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateAction6SD1.mmObject();
			isDerived = false;
			xmlTag = "TtlNbOfNewShrsIssd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumberOfNewSharesIssued";
			definition = "Total number of new shares to be issued.\r\n発行新株式数";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateAction6SD1.mmPlaceAndName, CorporateAction6SD1.mmMergerDetails, CorporateAction6SD1.mmTargetCompanyAgreement, CorporateAction6SD1.mmTotalNumberOfNewSharesIssued);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateAction6SD1";
				definition = "Extension for mergers.";
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

	@XmlElement(name = "MrgrDtls")
	public MergerDetailsType1 getMergerDetails() {
		return mergerDetails;
	}

	public void setMergerDetails(com.tools20022.repository.msg.MergerDetailsType1 mergerDetails) {
		this.mergerDetails = mergerDetails;
	}

	@XmlElement(name = "TrgtCpnyAgrmt")
	public TargetCompanyAgreementCode getTargetCompanyAgreement() {
		return targetCompanyAgreement;
	}

	public void setTargetCompanyAgreement(TargetCompanyAgreementCode targetCompanyAgreement) {
		this.targetCompanyAgreement = targetCompanyAgreement;
	}

	@XmlElement(name = "TtlNbOfNewShrsIssd")
	public FinancialInstrumentQuantity15Choice getTotalNumberOfNewSharesIssued() {
		return totalNumberOfNewSharesIssued;
	}

	public void setTotalNumberOfNewSharesIssued(FinancialInstrumentQuantity15Choice totalNumberOfNewSharesIssued) {
		this.totalNumberOfNewSharesIssued = totalNumberOfNewSharesIssued;
	}
}