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
import com.tools20022.repository.area.colr.*;
import com.tools20022.repository.choice.AgreementFramework1Choice;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.entity.Agreement;
import com.tools20022.repository.entity.CollateralAgreement;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Agreement details for the over the counter market.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Agreement4#mmAgreementDetails
 * Agreement4.mmAgreementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Agreement4#mmAgreementIdentification
 * Agreement4.mmAgreementIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Agreement4#mmAgreementDate
 * Agreement4.mmAgreementDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Agreement4#mmBaseCurrency
 * Agreement4.mmBaseCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Agreement4#mmAgreementFramework
 * Agreement4.mmAgreementFramework}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CollateralAgreement
 * CollateralAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#mmAgreement
 * MarginCallRequestV04.mmAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentResponseV04#mmAgreement
 * InterestPaymentResponseV04.mmAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralProposalV04#mmAgreement
 * CollateralProposalV04.mmAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralSubstitutionResponseV04#mmAgreement
 * CollateralSubstitutionResponseV04.mmAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV04#mmAgreement
 * MarginCallResponseV04.mmAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentStatementV04#mmAgreement
 * InterestPaymentStatementV04.mmAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralSubstitutionConfirmationV04#mmAgreement
 * CollateralSubstitutionConfirmationV04.mmAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentRequestV04#mmAgreement
 * InterestPaymentRequestV04.mmAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralSubstitutionRequestV04#mmAgreement
 * CollateralSubstitutionRequestV04.mmAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralAndExposureReportV03#mmAgreement
 * CollateralAndExposureReportV03.mmAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralProposalV05#mmAgreement
 * CollateralProposalV05.mmAgreement}</li>
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
 * "Agreement4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Agreement details for the over the counter market."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Agreement2
 * Agreement2}</li>
 * </ul>
 */
public class Agreement4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max140Text agreementDetails;
	/**
	 * Full details of the supporting legal agreement under which the margin
	 * call can be issued and/or governed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Agreement#mmDescription
	 * Agreement.mmDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Agreement4
	 * Agreement4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgrmtDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgreementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Full details of the supporting legal agreement under which the margin call can be issued and/or governed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Agreement2#mmAgreementDetails
	 * Agreement2.mmAgreementDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAgreementDetails = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Agreement.mmDescription;
			componentContext_lazy = () -> Agreement4.mmObject();
			isDerived = false;
			xmlTag = "AgrmtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgreementDetails";
			definition = "Full details of the supporting legal agreement under which the margin call can be issued and/or governed.";
			previousVersion_lazy = () -> Agreement2.mmAgreementDetails;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	protected Max140Text agreementIdentification;
	/**
	 * Common reference to the agreement between the two counterparties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Agreement4
	 * Agreement4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgrmtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgreementIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Common reference to the agreement between the two counterparties."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Agreement2#mmAgreementIdentification
	 * Agreement2.mmAgreementIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAgreementIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> Agreement4.mmObject();
			isDerived = false;
			xmlTag = "AgrmtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgreementIdentification";
			definition = "Common reference to the agreement between the two counterparties.";
			previousVersion_lazy = () -> Agreement2.mmAgreementIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	protected ISODate agreementDate;
	/**
	 * Date on which the collateral agreement was signed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Agreement#mmDateSigned
	 * Agreement.mmDateSigned}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Agreement4
	 * Agreement4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgrmtDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgreementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the collateral agreement was signed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Agreement2#mmAgreementDate
	 * Agreement2.mmAgreementDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAgreementDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Agreement.mmDateSigned;
			componentContext_lazy = () -> Agreement4.mmObject();
			isDerived = false;
			xmlTag = "AgrmtDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgreementDate";
			definition = "Date on which the collateral agreement was signed.";
			previousVersion_lazy = () -> Agreement2.mmAgreementDate;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ActiveCurrencyCode baseCurrency;
	/**
	 * Denomination currency as specified in the collateral agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralAgreement#mmBaseCurrency
	 * CollateralAgreement.mmBaseCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Agreement4
	 * Agreement4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BaseCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BaseCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Denomination currency as specified in the collateral agreement."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Agreement2#mmBaseCurrency
	 * Agreement2.mmBaseCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBaseCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CollateralAgreement.mmBaseCurrency;
			componentContext_lazy = () -> Agreement4.mmObject();
			isDerived = false;
			xmlTag = "BaseCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BaseCurrency";
			definition = "Denomination currency as specified in the collateral agreement.";
			previousVersion_lazy = () -> Agreement2.mmBaseCurrency;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}
	};
	protected AgreementFramework1Choice agreementFramework;
	/**
	 * Specifies the underlying master agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AgreementFramework1Choice
	 * AgreementFramework1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralAgreement#mmAssociatedMasterAgreement
	 * CollateralAgreement.mmAssociatedMasterAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Agreement4
	 * Agreement4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgrmtFrmwk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgreementFramework"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the underlying master agreement."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Agreement2#mmAgreementFramework
	 * Agreement2.mmAgreementFramework}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAgreementFramework = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CollateralAgreement.mmAssociatedMasterAgreement;
			componentContext_lazy = () -> Agreement4.mmObject();
			isDerived = false;
			xmlTag = "AgrmtFrmwk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgreementFramework";
			definition = "Specifies the underlying master agreement.";
			previousVersion_lazy = () -> Agreement2.mmAgreementFramework;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AgreementFramework1Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Agreement4.mmAgreementDetails, Agreement4.mmAgreementIdentification, Agreement4.mmAgreementDate, Agreement4.mmBaseCurrency, Agreement4.mmAgreementFramework);
				messageBuildingBlock_lazy = () -> Arrays.asList(MarginCallRequestV04.mmAgreement, InterestPaymentResponseV04.mmAgreement, CollateralProposalV04.mmAgreement, CollateralSubstitutionResponseV04.mmAgreement,
						MarginCallResponseV04.mmAgreement, InterestPaymentStatementV04.mmAgreement, CollateralSubstitutionConfirmationV04.mmAgreement, InterestPaymentRequestV04.mmAgreement, CollateralSubstitutionRequestV04.mmAgreement,
						CollateralAndExposureReportV03.mmAgreement, CollateralProposalV05.mmAgreement);
				trace_lazy = () -> CollateralAgreement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Agreement4";
				definition = "Agreement details for the over the counter market.";
				previousVersion_lazy = () -> Agreement2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max140Text getAgreementDetails() {
		return agreementDetails;
	}

	public void setAgreementDetails(Max140Text agreementDetails) {
		this.agreementDetails = agreementDetails;
	}

	public Max140Text getAgreementIdentification() {
		return agreementIdentification;
	}

	public void setAgreementIdentification(Max140Text agreementIdentification) {
		this.agreementIdentification = agreementIdentification;
	}

	public ISODate getAgreementDate() {
		return agreementDate;
	}

	public void setAgreementDate(ISODate agreementDate) {
		this.agreementDate = agreementDate;
	}

	public ActiveCurrencyCode getBaseCurrency() {
		return baseCurrency;
	}

	public void setBaseCurrency(ActiveCurrencyCode baseCurrency) {
		this.baseCurrency = baseCurrency;
	}

	public AgreementFramework1Choice getAgreementFramework() {
		return agreementFramework;
	}

	public void setAgreementFramework(AgreementFramework1Choice agreementFramework) {
		this.agreementFramework = agreementFramework;
	}
}