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

package com.tools20022.repository.area.tsrv;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.TradeServicesLatestVersion;
import com.tools20022.repository.msg.ExtendOrPayQuery1;
import com.tools20022.repository.msg.PartyAndSignature2;
import com.tools20022.repository.msgset.DemandGuaranteesandStandbyLettersofCreditISOLatestversion;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * The ExtendOrPayRequest message is sent by the party that issued the
 * undertaking to the party that requested issuance of the undertaking
 * (applicant or obligor), to request the applicant's response to a beneficiary
 * request to extend or pay.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TradeServicesLatestVersion
 * TradeServicesLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.DemandGuaranteesandStandbyLettersofCreditISOLatestversion
 * DemandGuaranteesandStandbyLettersofCreditISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "XtndOrPayReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.ExtendOrPayRequestV01#mmExtendOrPayRequestDetails
 * ExtendOrPayRequestV01.mmExtendOrPayRequestDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.ExtendOrPayRequestV01#mmDigitalSignature
 * ExtendOrPayRequestV01.mmDigitalSignature}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code tsrv.014.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ExtendOrPayRequestV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The ExtendOrPayRequest message is sent by the party that issued the undertaking to the party that requested issuance of the undertaking (applicant or obligor), to request the applicant's response to a beneficiary request to extend or pay."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ExtendOrPayRequestV01", propOrder = {"extendOrPayRequestDetails", "digitalSignature"})
public class ExtendOrPayRequestV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected ExtendOrPayQuery1 extendOrPayRequestDetails;
	/**
	 * Details of the extend or pay request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ExtendOrPayQuery1
	 * ExtendOrPayQuery1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndOrPayReqDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendOrPayRequestDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the extend or pay request."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmExtendOrPayRequestDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "XtndOrPayReqDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendOrPayRequestDetails";
			definition = "Details of the extend or pay request.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ExtendOrPayQuery1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ExtendOrPayRequestV01.class.getMethod("getExtendOrPayRequestDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PartyAndSignature2 digitalSignature;
	/**
	 * Digital signature of the request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyAndSignature2
	 * PartyAndSignature2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DgtlSgntr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DigitalSignature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Digital signature of the request."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmDigitalSignature = new MMMessageBuildingBlock() {
		{
			xmlTag = "DgtlSgntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DigitalSignature";
			definition = "Digital signature of the request.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyAndSignature2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ExtendOrPayRequestV01.class.getMethod("getDigitalSignature", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ExtendOrPayRequestV01";
				definition = "The ExtendOrPayRequest message is sent by the party that issued the undertaking to the party that requested issuance of the undertaking (applicant or obligor), to request the applicant's response to a beneficiary request to extend or pay.";
				messageSet_lazy = () -> Arrays.asList(DemandGuaranteesandStandbyLettersofCreditISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "XtndOrPayReq";
				businessArea_lazy = () -> TradeServicesLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsrv.ExtendOrPayRequestV01.mmExtendOrPayRequestDetails, com.tools20022.repository.area.tsrv.ExtendOrPayRequestV01.mmDigitalSignature);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "tsrv";
						messageFunctionality = "014";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return ExtendOrPayRequestV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "XtndOrPayReqDtls", required = true)
	public ExtendOrPayQuery1 getExtendOrPayRequestDetails() {
		return extendOrPayRequestDetails;
	}

	public void setExtendOrPayRequestDetails(ExtendOrPayQuery1 extendOrPayRequestDetails) {
		this.extendOrPayRequestDetails = extendOrPayRequestDetails;
	}

	@XmlElement(name = "DgtlSgntr")
	public PartyAndSignature2 getDigitalSignature() {
		return digitalSignature;
	}

	public void setDigitalSignature(PartyAndSignature2 digitalSignature) {
		this.digitalSignature = digitalSignature;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:tsrv.014.01.01")
	static public class Document {
		@XmlElement(name = "XtndOrPayReq", required = true)
		public ExtendOrPayRequestV01 messageBody;
	}
}