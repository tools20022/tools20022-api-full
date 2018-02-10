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
import com.tools20022.repository.choice.IsabelInputSource1Choice;
import com.tools20022.repository.choice.IsabelSenderTrigger1Choice;
import com.tools20022.repository.codeset.DebitType1Code;
import com.tools20022.repository.codeset.Validation1Code;
import com.tools20022.repository.codeset.Validation2Code;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.TrueFalseIndicator;
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
 * Specifies the enhanced parameters for an Isabel payment file.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelEnhancedHeader1#mmDebitType
 * IsabelEnhancedHeader1.mmDebitType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelEnhancedHeader1#mmBankDebitType
 * IsabelEnhancedHeader1.mmBankDebitType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelEnhancedHeader1#mmAccountBasedContract
 * IsabelEnhancedHeader1.mmAccountBasedContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelEnhancedHeader1#mmValidationResults
 * IsabelEnhancedHeader1.mmValidationResults}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelEnhancedHeader1#mmPowerToSignValidationResults
 * IsabelEnhancedHeader1.mmPowerToSignValidationResults}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelEnhancedHeader1#mmPowerToSignValidationTimeStamp
 * IsabelEnhancedHeader1.mmPowerToSignValidationTimeStamp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelEnhancedHeader1#mmSenderTrigger
 * IsabelEnhancedHeader1.mmSenderTrigger}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelEnhancedHeader1#mmSendTimeStamp
 * IsabelEnhancedHeader1.mmSendTimeStamp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelEnhancedHeader1#mmExtraConditionsAccepted
 * IsabelEnhancedHeader1.mmExtraConditionsAccepted}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IsabelEnhancedHeader1#mmSource
 * IsabelEnhancedHeader1.mmSource}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelEnhancedHeader1#mmNumberOfRequiredSignatures
 * IsabelEnhancedHeader1.mmNumberOfRequiredSignatures}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelEnhancedHeader1#mmExtended
 * IsabelEnhancedHeader1.mmExtended}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IsabelEnhancedHeader1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the enhanced parameters for an Isabel payment file."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IsabelEnhancedHeader1", propOrder = {"debitType", "bankDebitType", "accountBasedContract", "validationResults", "powerToSignValidationResults", "powerToSignValidationTimeStamp", "senderTrigger", "sendTimeStamp",
		"extraConditionsAccepted", "source", "numberOfRequiredSignatures", "extended"})
public class IsabelEnhancedHeader1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DbtTp", required = true)
	protected DebitType1Code debitType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DebitType1Code
	 * DebitType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelEnhancedHeader1
	 * IsabelEnhancedHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of debit to be applied to the payment, as provided by the end-user."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDebitType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelEnhancedHeader1.mmObject();
			isDerived = false;
			xmlTag = "DbtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebitType";
			definition = "Type of debit to be applied to the payment, as provided by the end-user.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DebitType1Code.mmObject();
		}
	};
	@XmlElement(name = "BkDbtTp", required = true)
	protected DebitType1Code bankDebitType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DebitType1Code
	 * DebitType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelEnhancedHeader1
	 * IsabelEnhancedHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BkDbtTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankDebitType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of debit to be applied to the payment, as provided by the bank.\r\nThis may supersede the debit type provided by the end-user."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBankDebitType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelEnhancedHeader1.mmObject();
			isDerived = false;
			xmlTag = "BkDbtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankDebitType";
			definition = "Type of debit to be applied to the payment, as provided by the bank.\r\nThis may supersede the debit type provided by the end-user.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DebitType1Code.mmObject();
		}
	};
	@XmlElement(name = "AcctBasedCtrct", required = true)
	protected TrueFalseIndicator accountBasedContract;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelEnhancedHeader1
	 * IsabelEnhancedHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctBasedCtrct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountBasedContract"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contract is defined on a specific account."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountBasedContract = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelEnhancedHeader1.mmObject();
			isDerived = false;
			xmlTag = "AcctBasedCtrct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountBasedContract";
			definition = "Contract is defined on a specific account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	@XmlElement(name = "VldtnRslts", required = true)
	protected Validation1Code validationResults;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Validation1Code
	 * Validation1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelEnhancedHeader1
	 * IsabelEnhancedHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VldtnRslts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidationResults"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Results of all validations performed during the processing of a file provided in the payload."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValidationResults = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelEnhancedHeader1.mmObject();
			isDerived = false;
			xmlTag = "VldtnRslts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidationResults";
			definition = "Results of all validations performed during the processing of a file provided in the payload.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Validation1Code.mmObject();
		}
	};
	@XmlElement(name = "PwrToSgnVldtnRslts", required = true)
	protected Validation2Code powerToSignValidationResults;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Validation2Code
	 * Validation2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelEnhancedHeader1
	 * IsabelEnhancedHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PwrToSgnVldtnRslts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PowerToSignValidationResults"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Results of the signature validation provided by the 'PowerToSign' user."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPowerToSignValidationResults = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelEnhancedHeader1.mmObject();
			isDerived = false;
			xmlTag = "PwrToSgnVldtnRslts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PowerToSignValidationResults";
			definition = "Results of the signature validation provided by the 'PowerToSign' user.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Validation2Code.mmObject();
		}
	};
	@XmlElement(name = "PwrToSgnVldtnTmStmp", required = true)
	protected ISODateTime powerToSignValidationTimeStamp;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelEnhancedHeader1
	 * IsabelEnhancedHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PwrToSgnVldtnTmStmp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PowerToSignValidationTimeStamp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Validation of the time stamp provided by the 'PowerToSign' user."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPowerToSignValidationTimeStamp = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelEnhancedHeader1.mmObject();
			isDerived = false;
			xmlTag = "PwrToSgnVldtnTmStmp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PowerToSignValidationTimeStamp";
			definition = "Validation of the time stamp provided by the 'PowerToSign' user.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "SndrTrggr", required = true)
	protected IsabelSenderTrigger1Choice senderTrigger;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.IsabelSenderTrigger1Choice
	 * IsabelSenderTrigger1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelEnhancedHeader1
	 * IsabelEnhancedHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SndrTrggr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SenderTrigger"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trigger used by the sender to transfer the file."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSenderTrigger = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelEnhancedHeader1.mmObject();
			isDerived = false;
			xmlTag = "SndrTrggr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SenderTrigger";
			definition = "Trigger used by the sender to transfer the file.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> IsabelSenderTrigger1Choice.mmObject();
		}
	};
	@XmlElement(name = "SndTmStmp", required = true)
	protected ISODateTime sendTimeStamp;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelEnhancedHeader1
	 * IsabelEnhancedHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SndTmStmp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SendTimeStamp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Time stamp on when the file is sent."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSendTimeStamp = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelEnhancedHeader1.mmObject();
			isDerived = false;
			xmlTag = "SndTmStmp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SendTimeStamp";
			definition = "Time stamp on when the file is sent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "XtraCondsAccptd", required = true)
	protected TrueFalseIndicator extraConditionsAccepted;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelEnhancedHeader1
	 * IsabelEnhancedHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtraCondsAccptd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtraConditionsAccepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether extra conditions are applicable and accepted for this file."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExtraConditionsAccepted = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelEnhancedHeader1.mmObject();
			isDerived = false;
			xmlTag = "XtraCondsAccptd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtraConditionsAccepted";
			definition = "Indicates whether extra conditions are applicable and accepted for this file.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	@XmlElement(name = "Src", required = true)
	protected IsabelInputSource1Choice source;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.IsabelInputSource1Choice
	 * IsabelInputSource1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelEnhancedHeader1
	 * IsabelEnhancedHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Src"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Source"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Input source for the generation of the file."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSource = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelEnhancedHeader1.mmObject();
			isDerived = false;
			xmlTag = "Src";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Source";
			definition = "Input source for the generation of the file.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> IsabelInputSource1Choice.mmObject();
		}
	};
	@XmlElement(name = "NbOfReqrdSgntrs")
	protected Number numberOfRequiredSignatures;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelEnhancedHeader1
	 * IsabelEnhancedHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfReqrdSgntrs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfRequiredSignatures"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of signatures required to validate the payments file."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNumberOfRequiredSignatures = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelEnhancedHeader1.mmObject();
			isDerived = false;
			xmlTag = "NbOfReqrdSgntrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfRequiredSignatures";
			definition = "Number of signatures required to validate the payments file.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "Xtnded")
	protected IsabelExtendedHeader1 extended;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.IsabelExtendedHeader1
	 * IsabelExtendedHeader1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelEnhancedHeader1
	 * IsabelEnhancedHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Xtnded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Extended"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Extended parameters for an Isabel payment initiation file."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmExtended = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelEnhancedHeader1.mmObject();
			isDerived = false;
			xmlTag = "Xtnded";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extended";
			definition = "Extended parameters for an Isabel payment initiation file.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.IsabelExtendedHeader1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IsabelEnhancedHeader1.mmDebitType, com.tools20022.repository.msg.IsabelEnhancedHeader1.mmBankDebitType,
						com.tools20022.repository.msg.IsabelEnhancedHeader1.mmAccountBasedContract, com.tools20022.repository.msg.IsabelEnhancedHeader1.mmValidationResults,
						com.tools20022.repository.msg.IsabelEnhancedHeader1.mmPowerToSignValidationResults, com.tools20022.repository.msg.IsabelEnhancedHeader1.mmPowerToSignValidationTimeStamp,
						com.tools20022.repository.msg.IsabelEnhancedHeader1.mmSenderTrigger, com.tools20022.repository.msg.IsabelEnhancedHeader1.mmSendTimeStamp,
						com.tools20022.repository.msg.IsabelEnhancedHeader1.mmExtraConditionsAccepted, com.tools20022.repository.msg.IsabelEnhancedHeader1.mmSource,
						com.tools20022.repository.msg.IsabelEnhancedHeader1.mmNumberOfRequiredSignatures, com.tools20022.repository.msg.IsabelEnhancedHeader1.mmExtended);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "IsabelEnhancedHeader1";
				definition = "Specifies the enhanced parameters for an Isabel payment file.";
			}
		});
		return mmObject_lazy.get();
	}

	public DebitType1Code getDebitType() {
		return debitType;
	}

	public IsabelEnhancedHeader1 setDebitType(DebitType1Code debitType) {
		this.debitType = Objects.requireNonNull(debitType);
		return this;
	}

	public DebitType1Code getBankDebitType() {
		return bankDebitType;
	}

	public IsabelEnhancedHeader1 setBankDebitType(DebitType1Code bankDebitType) {
		this.bankDebitType = Objects.requireNonNull(bankDebitType);
		return this;
	}

	public TrueFalseIndicator getAccountBasedContract() {
		return accountBasedContract;
	}

	public IsabelEnhancedHeader1 setAccountBasedContract(TrueFalseIndicator accountBasedContract) {
		this.accountBasedContract = Objects.requireNonNull(accountBasedContract);
		return this;
	}

	public Validation1Code getValidationResults() {
		return validationResults;
	}

	public IsabelEnhancedHeader1 setValidationResults(Validation1Code validationResults) {
		this.validationResults = Objects.requireNonNull(validationResults);
		return this;
	}

	public Validation2Code getPowerToSignValidationResults() {
		return powerToSignValidationResults;
	}

	public IsabelEnhancedHeader1 setPowerToSignValidationResults(Validation2Code powerToSignValidationResults) {
		this.powerToSignValidationResults = Objects.requireNonNull(powerToSignValidationResults);
		return this;
	}

	public ISODateTime getPowerToSignValidationTimeStamp() {
		return powerToSignValidationTimeStamp;
	}

	public IsabelEnhancedHeader1 setPowerToSignValidationTimeStamp(ISODateTime powerToSignValidationTimeStamp) {
		this.powerToSignValidationTimeStamp = Objects.requireNonNull(powerToSignValidationTimeStamp);
		return this;
	}

	public IsabelSenderTrigger1Choice getSenderTrigger() {
		return senderTrigger;
	}

	public IsabelEnhancedHeader1 setSenderTrigger(IsabelSenderTrigger1Choice senderTrigger) {
		this.senderTrigger = Objects.requireNonNull(senderTrigger);
		return this;
	}

	public ISODateTime getSendTimeStamp() {
		return sendTimeStamp;
	}

	public IsabelEnhancedHeader1 setSendTimeStamp(ISODateTime sendTimeStamp) {
		this.sendTimeStamp = Objects.requireNonNull(sendTimeStamp);
		return this;
	}

	public TrueFalseIndicator getExtraConditionsAccepted() {
		return extraConditionsAccepted;
	}

	public IsabelEnhancedHeader1 setExtraConditionsAccepted(TrueFalseIndicator extraConditionsAccepted) {
		this.extraConditionsAccepted = Objects.requireNonNull(extraConditionsAccepted);
		return this;
	}

	public IsabelInputSource1Choice getSource() {
		return source;
	}

	public IsabelEnhancedHeader1 setSource(IsabelInputSource1Choice source) {
		this.source = Objects.requireNonNull(source);
		return this;
	}

	public Optional<Number> getNumberOfRequiredSignatures() {
		return numberOfRequiredSignatures == null ? Optional.empty() : Optional.of(numberOfRequiredSignatures);
	}

	public IsabelEnhancedHeader1 setNumberOfRequiredSignatures(Number numberOfRequiredSignatures) {
		this.numberOfRequiredSignatures = numberOfRequiredSignatures;
		return this;
	}

	public Optional<IsabelExtendedHeader1> getExtended() {
		return extended == null ? Optional.empty() : Optional.of(extended);
	}

	public IsabelEnhancedHeader1 setExtended(com.tools20022.repository.msg.IsabelExtendedHeader1 extended) {
		this.extended = extended;
		return this;
	}
}