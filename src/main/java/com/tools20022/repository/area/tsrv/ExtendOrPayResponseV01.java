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
import com.tools20022.repository.msg.ExtendOrPayQuery2;
import com.tools20022.repository.msg.PartyAndSignature2;
import com.tools20022.repository.msgset.DemandGuaranteesandStandbyLettersofCreditISOLatestversion;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.*;

/**
 * The ExtendOrPayResponse message is sent by the party that requested issuance
 * of the undertaking (applicant or obligor) to the party that issued the
 * undertaking, in response to the issuer's request for the applicant's response
 * to the beneficiary’s request to extend or pay.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.ExtendOrPayResponseV01#mmExtendOrPayResponseDetails
 * ExtendOrPayResponseV01.mmExtendOrPayResponseDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.ExtendOrPayResponseV01#mmDigitalSignature
 * ExtendOrPayResponseV01.mmDigitalSignature}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.DemandGuaranteesandStandbyLettersofCreditISOLatestversion
 * DemandGuaranteesandStandbyLettersofCreditISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "XtndOrPayRspn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TradeServicesLatestVersion
 * TradeServicesLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code tsrv.015.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ExtendOrPayResponseV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The ExtendOrPayResponse message is sent by the party that requested issuance of the undertaking (applicant or obligor) to the party that issued the undertaking, in response to the issuer's request for the applicant's response to the beneficiary’s request to extend or pay."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ExtendOrPayResponseV01", propOrder = {"extendOrPayResponseDetails", "digitalSignature"})
public class ExtendOrPayResponseV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "XtndOrPayRspnDtls", required = true)
	protected ExtendOrPayQuery2 extendOrPayResponseDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ExtendOrPayQuery2
	 * ExtendOrPayQuery2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndOrPayRspnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendOrPayResponseDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the extend or pay response."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmExtendOrPayResponseDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "XtndOrPayRspnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendOrPayResponseDetails";
			definition = "Details of the extend or pay response.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ExtendOrPayQuery2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ExtendOrPayResponseV01.class.getMethod("getExtendOrPayResponseDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "DgtlSgntr")
	protected PartyAndSignature2 digitalSignature;
	/**
	 * 
	 <p>
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
	 * definition} = "Digital signature of the response."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmDigitalSignature = new MMMessageBuildingBlock() {
		{
			xmlTag = "DgtlSgntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DigitalSignature";
			definition = "Digital signature of the response.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyAndSignature2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ExtendOrPayResponseV01.class.getMethod("getDigitalSignature", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ExtendOrPayResponseV01";
				definition = "The ExtendOrPayResponse message is sent by the party that requested issuance of the undertaking (applicant or obligor) to the party that issued the undertaking, in response to the issuer's request for the applicant's response to the beneficiary’s request to extend or pay.";
				messageSet_lazy = () -> Arrays.asList(DemandGuaranteesandStandbyLettersofCreditISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "XtndOrPayRspn";
				businessArea_lazy = () -> TradeServicesLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsrv.ExtendOrPayResponseV01.mmExtendOrPayResponseDetails, com.tools20022.repository.area.tsrv.ExtendOrPayResponseV01.mmDigitalSignature);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "tsrv";
						messageFunctionality = "015";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return ExtendOrPayResponseV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ExtendOrPayQuery2 getExtendOrPayResponseDetails() {
		return extendOrPayResponseDetails;
	}

	public ExtendOrPayResponseV01 setExtendOrPayResponseDetails(ExtendOrPayQuery2 extendOrPayResponseDetails) {
		this.extendOrPayResponseDetails = Objects.requireNonNull(extendOrPayResponseDetails);
		return this;
	}

	public Optional<PartyAndSignature2> getDigitalSignature() {
		return digitalSignature == null ? Optional.empty() : Optional.of(digitalSignature);
	}

	public ExtendOrPayResponseV01 setDigitalSignature(PartyAndSignature2 digitalSignature) {
		this.digitalSignature = digitalSignature;
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsrv.015.001.01")
	static public class Document {
		@XmlElement(name = "XtndOrPayRspn", required = true)
		public ExtendOrPayResponseV01 messageBody;
	}
}