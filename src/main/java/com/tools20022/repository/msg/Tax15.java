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
import com.tools20022.metamodel.MMXor;
import com.tools20022.repository.choice.PartyIdentification2Choice;
import com.tools20022.repository.codeset.TaxationBasis2Code;
import com.tools20022.repository.codeset.TaxExemptReason1Code;
import com.tools20022.repository.codeset.TaxType13Code;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAnd13DecimalAmount;
import com.tools20022.repository.datatype.Extended350Code;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.InvestmentFundTax;
import com.tools20022.repository.entity.Tax;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Tax related to an investment fund order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Tax15#TypeOrExtendedTypeRule
 * Tax15.TypeOrExtendedTypeRule}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax15#BasisOrExtendedBasisRule
 * Tax15.BasisOrExtendedBasisRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Tax15#ExemptionReasonOrExtendedExemptionReasonRule
 * Tax15.ExemptionReasonOrExtendedExemptionReasonRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Tax15#mmType Tax15.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax15#mmExtendedType
 * Tax15.mmExtendedType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax15#mmAmount Tax15.mmAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax15#mmBasis Tax15.mmBasis}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax15#mmExtendedBasis
 * Tax15.mmExtendedBasis}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Tax15#mmRecipientIdentification
 * Tax15.mmRecipientIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax15#mmExemptionIndicator
 * Tax15.mmExemptionIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax15#mmExemptionReason
 * Tax15.mmExemptionReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Tax15#mmExtendedExemptionReason
 * Tax15.mmExtendedExemptionReason}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestmentFundTax
 * InvestmentFundTax}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Tax15"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Tax related to an investment fund order."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Tax21 Tax21}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Tax15", propOrder = {"type", "extendedType", "amount", "basis", "extendedBasis", "recipientIdentification", "exemptionIndicator", "exemptionReason", "extendedExemptionReason"})
public class Tax15 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Tp", required = true)
	protected TaxType13Code type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TaxType13Code
	 * TaxType13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmType Tax.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Tax15
	 * Tax15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of tax applied."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Tax15.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type of tax applied.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TaxType13Code.mmObject();
		}
	};
	@XmlElement(name = "XtndedTp", required = true)
	protected Extended350Code extendedType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Extended350Code
	 * Extended350Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmType Tax.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Tax15
	 * Tax15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndedTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendedType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of tax applied."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExtendedType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Tax15.mmObject();
			isDerived = false;
			xmlTag = "XtndedTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedType";
			definition = "Type of tax applied.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Extended350Code.mmObject();
		}
	};
	@XmlElement(name = "Amt", required = true)
	protected ActiveOrHistoricCurrencyAnd13DecimalAmount amount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAnd13DecimalAmount
	 * ActiveOrHistoricCurrencyAnd13DecimalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Tax15
	 * Tax15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money resulting from the calculation of the tax."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax21#mmAmount
	 * Tax21.mmAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Tax15.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Amount of money resulting from the calculation of the tax.";
			nextVersions_lazy = () -> Arrays.asList(Tax21.mmAmount);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAnd13DecimalAmount.mmObject();
		}
	};
	@XmlElement(name = "Bsis")
	protected TaxationBasis2Code basis;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TaxationBasis2Code
	 * TaxationBasis2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmBasis Tax.mmBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Tax15
	 * Tax15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Bsis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Basis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Basis used to determine the capital gain or loss, eg, the purchase price."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBasis = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmBasis;
			componentContext_lazy = () -> com.tools20022.repository.msg.Tax15.mmObject();
			isDerived = false;
			xmlTag = "Bsis";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Basis";
			definition = "Basis used to determine the capital gain or loss, eg, the purchase price.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TaxationBasis2Code.mmObject();
		}
	};
	@XmlElement(name = "XtndedBsis")
	protected Extended350Code extendedBasis;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Extended350Code
	 * Extended350Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmBasis Tax.mmBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Tax15
	 * Tax15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndedBsis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendedBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Basis used to determine the capital gain or loss, eg, the purchase price."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExtendedBasis = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmBasis;
			componentContext_lazy = () -> com.tools20022.repository.msg.Tax15.mmObject();
			isDerived = false;
			xmlTag = "XtndedBsis";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedBasis";
			definition = "Basis used to determine the capital gain or loss, eg, the purchase price.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Extended350Code.mmObject();
		}
	};
	@XmlElement(name = "RcptId")
	protected PartyIdentification2Choice recipientIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification2Choice
	 * PartyIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Tax15
	 * Tax15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcptId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecipientIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that receives the tax. The recipient of, and the party entitled to, the tax may be two different parties."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Tax21#mmRecipientIdentification
	 * Tax21.mmRecipientIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRecipientIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Tax15.mmObject();
			isDerived = false;
			xmlTag = "RcptId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecipientIdentification";
			definition = "Party that receives the tax. The recipient of, and the party entitled to, the tax may be two different parties.";
			nextVersions_lazy = () -> Arrays.asList(Tax21.mmRecipientIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification2Choice.mmObject();
		}
	};
	@XmlElement(name = "XmptnInd", required = true)
	protected YesNoIndicator exemptionIndicator;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax#mmExemptionIndicator
	 * InvestmentFundTax.mmExemptionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Tax15
	 * Tax15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XmptnInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExemptionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether a tax exemption applies."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax21#mmExemptionIndicator
	 * Tax21.mmExemptionIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExemptionIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTax.mmExemptionIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.Tax15.mmObject();
			isDerived = false;
			xmlTag = "XmptnInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExemptionIndicator";
			definition = "Indicates whether a tax exemption applies.";
			nextVersions_lazy = () -> Arrays.asList(Tax21.mmExemptionIndicator);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "XmptnRsn")
	protected TaxExemptReason1Code exemptionReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmExemptionReason
	 * Tax.mmExemptionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Tax15
	 * Tax15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XmptnRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExemptionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for a tax exemption."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExemptionReason = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmExemptionReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.Tax15.mmObject();
			isDerived = false;
			xmlTag = "XmptnRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExemptionReason";
			definition = "Reason for a tax exemption.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TaxExemptReason1Code.mmObject();
		}
	};
	@XmlElement(name = "XtndedXmptnRsn")
	protected Extended350Code extendedExemptionReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Extended350Code
	 * Extended350Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmExemptionReason
	 * Tax.mmExemptionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Tax15
	 * Tax15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndedXmptnRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendedExemptionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for a tax exemption."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExtendedExemptionReason = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmExemptionReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.Tax15.mmObject();
			isDerived = false;
			xmlTag = "XtndedXmptnRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedExemptionReason";
			definition = "Reason for a tax exemption.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Extended350Code.mmObject();
		}
	};
	/**
	 * Either Type or ExtendedType must be present, but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} = {@linkplain com.tools20022.repository.msg.Tax15
	 * Tax15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax15#mmType Tax15.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax15#mmExtendedType
	 * Tax15.mmExtendedType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOrExtendedTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either Type or ExtendedType must be present, but not both."</li>
	 * </ul>
	 */
	public static final MMXor TypeOrExtendedTypeRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOrExtendedTypeRule";
			definition = "Either Type or ExtendedType must be present, but not both.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.Tax15.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Tax15.mmType, com.tools20022.repository.msg.Tax15.mmExtendedType);
		}
	};
	/**
	 * Either Basis or ExtendedBasis may be present, but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} = {@linkplain com.tools20022.repository.msg.Tax15
	 * Tax15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax15#mmBasis
	 * Tax15.mmBasis}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax15#mmExtendedBasis
	 * Tax15.mmExtendedBasis}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BasisOrExtendedBasisRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either Basis or ExtendedBasis may be present, but not both."</li>
	 * </ul>
	 */
	public static final MMXor BasisOrExtendedBasisRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BasisOrExtendedBasisRule";
			definition = "Either Basis or ExtendedBasis may be present, but not both.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.Tax15.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Tax15.mmBasis, com.tools20022.repository.msg.Tax15.mmExtendedBasis);
		}
	};
	/**
	 * Either ExemptionReason or ExtendedExemptionReason may be present but not
	 * both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} = {@linkplain com.tools20022.repository.msg.Tax15
	 * Tax15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax15#mmExemptionReason
	 * Tax15.mmExemptionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Tax15#mmExtendedExemptionReason
	 * Tax15.mmExtendedExemptionReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExemptionReasonOrExtendedExemptionReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either ExemptionReason or ExtendedExemptionReason may be present but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMXor ExemptionReasonOrExtendedExemptionReasonRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExemptionReasonOrExtendedExemptionReasonRule";
			definition = "Either ExemptionReason or ExtendedExemptionReason may be present but not both.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.Tax15.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Tax15.mmExemptionReason, com.tools20022.repository.msg.Tax15.mmExtendedExemptionReason);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Tax15.mmType, com.tools20022.repository.msg.Tax15.mmExtendedType, com.tools20022.repository.msg.Tax15.mmAmount,
						com.tools20022.repository.msg.Tax15.mmBasis, com.tools20022.repository.msg.Tax15.mmExtendedBasis, com.tools20022.repository.msg.Tax15.mmRecipientIdentification,
						com.tools20022.repository.msg.Tax15.mmExemptionIndicator, com.tools20022.repository.msg.Tax15.mmExemptionReason, com.tools20022.repository.msg.Tax15.mmExtendedExemptionReason);
				trace_lazy = () -> InvestmentFundTax.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "Tax15";
				definition = "Tax related to an investment fund order.";
				nextVersions_lazy = () -> Arrays.asList(Tax21.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Tax15.TypeOrExtendedTypeRule, com.tools20022.repository.msg.Tax15.BasisOrExtendedBasisRule,
						com.tools20022.repository.msg.Tax15.ExemptionReasonOrExtendedExemptionReasonRule);
			}
		});
		return mmObject_lazy.get();
	}

	public TaxType13Code getType() {
		return type;
	}

	public Tax15 setType(TaxType13Code type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public Extended350Code getExtendedType() {
		return extendedType;
	}

	public Tax15 setExtendedType(Extended350Code extendedType) {
		this.extendedType = Objects.requireNonNull(extendedType);
		return this;
	}

	public ActiveOrHistoricCurrencyAnd13DecimalAmount getAmount() {
		return amount;
	}

	public Tax15 setAmount(ActiveOrHistoricCurrencyAnd13DecimalAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public Optional<TaxationBasis2Code> getBasis() {
		return basis == null ? Optional.empty() : Optional.of(basis);
	}

	public Tax15 setBasis(TaxationBasis2Code basis) {
		this.basis = basis;
		return this;
	}

	public Optional<Extended350Code> getExtendedBasis() {
		return extendedBasis == null ? Optional.empty() : Optional.of(extendedBasis);
	}

	public Tax15 setExtendedBasis(Extended350Code extendedBasis) {
		this.extendedBasis = extendedBasis;
		return this;
	}

	public Optional<PartyIdentification2Choice> getRecipientIdentification() {
		return recipientIdentification == null ? Optional.empty() : Optional.of(recipientIdentification);
	}

	public Tax15 setRecipientIdentification(PartyIdentification2Choice recipientIdentification) {
		this.recipientIdentification = recipientIdentification;
		return this;
	}

	public YesNoIndicator getExemptionIndicator() {
		return exemptionIndicator;
	}

	public Tax15 setExemptionIndicator(YesNoIndicator exemptionIndicator) {
		this.exemptionIndicator = Objects.requireNonNull(exemptionIndicator);
		return this;
	}

	public Optional<TaxExemptReason1Code> getExemptionReason() {
		return exemptionReason == null ? Optional.empty() : Optional.of(exemptionReason);
	}

	public Tax15 setExemptionReason(TaxExemptReason1Code exemptionReason) {
		this.exemptionReason = exemptionReason;
		return this;
	}

	public Optional<Extended350Code> getExtendedExemptionReason() {
		return extendedExemptionReason == null ? Optional.empty() : Optional.of(extendedExemptionReason);
	}

	public Tax15 setExtendedExemptionReason(Extended350Code extendedExemptionReason) {
		this.extendedExemptionReason = extendedExemptionReason;
		return this;
	}
}