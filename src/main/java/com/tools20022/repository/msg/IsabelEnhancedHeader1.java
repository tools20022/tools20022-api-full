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
import com.tools20022.repository.choice.IsabelInputSource1Choice;
import com.tools20022.repository.choice.IsabelSenderTrigger1Choice;
import com.tools20022.repository.codeset.DebitType1Code;
import com.tools20022.repository.codeset.Validation1Code;
import com.tools20022.repository.codeset.Validation2Code;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.msg.IsabelEnhancedHeader1#DebitType
 * IsabelEnhancedHeader1.DebitType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelEnhancedHeader1#BankDebitType
 * IsabelEnhancedHeader1.BankDebitType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelEnhancedHeader1#AccountBasedContract
 * IsabelEnhancedHeader1.AccountBasedContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelEnhancedHeader1#ValidationResults
 * IsabelEnhancedHeader1.ValidationResults}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelEnhancedHeader1#PowerToSignValidationResults
 * IsabelEnhancedHeader1.PowerToSignValidationResults}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelEnhancedHeader1#PowerToSignValidationTimeStamp
 * IsabelEnhancedHeader1.PowerToSignValidationTimeStamp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelEnhancedHeader1#SenderTrigger
 * IsabelEnhancedHeader1.SenderTrigger}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelEnhancedHeader1#SendTimeStamp
 * IsabelEnhancedHeader1.SendTimeStamp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelEnhancedHeader1#ExtraConditionsAccepted
 * IsabelEnhancedHeader1.ExtraConditionsAccepted}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IsabelEnhancedHeader1#Source
 * IsabelEnhancedHeader1.Source}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelEnhancedHeader1#NumberOfRequiredSignatures
 * IsabelEnhancedHeader1.NumberOfRequiredSignatures}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IsabelEnhancedHeader1#Extended
 * IsabelEnhancedHeader1.Extended}</li>
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
public class IsabelEnhancedHeader1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Type of debit to be applied to the payment, as provided by the end-user.
	 * <p>
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
	public static final MMMessageAttribute DebitType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IsabelEnhancedHeader1.mmObject();
			isDerived = false;
			xmlTag = "DbtTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebitType";
			definition = "Type of debit to be applied to the payment, as provided by the end-user.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DebitType1Code.mmObject();
		}
	};
	/**
	 * Type of debit to be applied to the payment, as provided by the bank.<br>
	 * This may supersede the debit type provided by the end-user.
	 * <p>
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
	public static final MMMessageAttribute BankDebitType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IsabelEnhancedHeader1.mmObject();
			isDerived = false;
			xmlTag = "BkDbtTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankDebitType";
			definition = "Type of debit to be applied to the payment, as provided by the bank.\r\nThis may supersede the debit type provided by the end-user.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DebitType1Code.mmObject();
		}
	};
	/**
	 * Contract is defined on a specific account.
	 * <p>
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
	public static final MMMessageAttribute AccountBasedContract = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IsabelEnhancedHeader1.mmObject();
			isDerived = false;
			xmlTag = "AcctBasedCtrct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountBasedContract";
			definition = "Contract is defined on a specific account.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Results of all validations performed during the processing of a file
	 * provided in the payload.
	 * <p>
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
	public static final MMMessageAttribute ValidationResults = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IsabelEnhancedHeader1.mmObject();
			isDerived = false;
			xmlTag = "VldtnRslts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidationResults";
			definition = "Results of all validations performed during the processing of a file provided in the payload.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Validation1Code.mmObject();
		}
	};
	/**
	 * Results of the signature validation provided by the 'PowerToSign' user.
	 * <p>
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
	public static final MMMessageAttribute PowerToSignValidationResults = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IsabelEnhancedHeader1.mmObject();
			isDerived = false;
			xmlTag = "PwrToSgnVldtnRslts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PowerToSignValidationResults";
			definition = "Results of the signature validation provided by the 'PowerToSign' user.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Validation2Code.mmObject();
		}
	};
	/**
	 * Validation of the time stamp provided by the 'PowerToSign' user.
	 * <p>
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
	public static final MMMessageAttribute PowerToSignValidationTimeStamp = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IsabelEnhancedHeader1.mmObject();
			isDerived = false;
			xmlTag = "PwrToSgnVldtnTmStmp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PowerToSignValidationTimeStamp";
			definition = "Validation of the time stamp provided by the 'PowerToSign' user.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Trigger used by the sender to transfer the file.
	 * <p>
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
	public static final MMMessageAssociationEnd SenderTrigger = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> IsabelEnhancedHeader1.mmObject();
			isDerived = false;
			xmlTag = "SndrTrggr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SenderTrigger";
			definition = "Trigger used by the sender to transfer the file.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> IsabelSenderTrigger1Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Time stamp on when the file is sent.
	 * <p>
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
	public static final MMMessageAttribute SendTimeStamp = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IsabelEnhancedHeader1.mmObject();
			isDerived = false;
			xmlTag = "SndTmStmp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SendTimeStamp";
			definition = "Time stamp on when the file is sent.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Indicates whether extra conditions are applicable and accepted for this
	 * file.
	 * <p>
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
	public static final MMMessageAttribute ExtraConditionsAccepted = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IsabelEnhancedHeader1.mmObject();
			isDerived = false;
			xmlTag = "XtraCondsAccptd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtraConditionsAccepted";
			definition = "Indicates whether extra conditions are applicable and accepted for this file.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Input source for the generation of the file.
	 * <p>
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
	public static final MMMessageAssociationEnd Source = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> IsabelEnhancedHeader1.mmObject();
			isDerived = false;
			xmlTag = "Src";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Source";
			definition = "Input source for the generation of the file.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> IsabelInputSource1Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Number of signatures required to validate the payments file.
	 * <p>
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
	public static final MMMessageAttribute NumberOfRequiredSignatures = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IsabelEnhancedHeader1.mmObject();
			isDerived = false;
			xmlTag = "NbOfReqrdSgntrs";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfRequiredSignatures";
			definition = "Number of signatures required to validate the payments file.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Extended parameters for an Isabel payment initiation file.
	 * <p>
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
	public static final MMMessageAssociationEnd Extended = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> IsabelEnhancedHeader1.mmObject();
			isDerived = false;
			xmlTag = "Xtnded";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extended";
			definition = "Extended parameters for an Isabel payment initiation file.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> IsabelExtendedHeader1.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IsabelEnhancedHeader1.DebitType, com.tools20022.repository.msg.IsabelEnhancedHeader1.BankDebitType,
						com.tools20022.repository.msg.IsabelEnhancedHeader1.AccountBasedContract, com.tools20022.repository.msg.IsabelEnhancedHeader1.ValidationResults,
						com.tools20022.repository.msg.IsabelEnhancedHeader1.PowerToSignValidationResults, com.tools20022.repository.msg.IsabelEnhancedHeader1.PowerToSignValidationTimeStamp,
						com.tools20022.repository.msg.IsabelEnhancedHeader1.SenderTrigger, com.tools20022.repository.msg.IsabelEnhancedHeader1.SendTimeStamp, com.tools20022.repository.msg.IsabelEnhancedHeader1.ExtraConditionsAccepted,
						com.tools20022.repository.msg.IsabelEnhancedHeader1.Source, com.tools20022.repository.msg.IsabelEnhancedHeader1.NumberOfRequiredSignatures, com.tools20022.repository.msg.IsabelEnhancedHeader1.Extended);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "IsabelEnhancedHeader1";
				definition = "Specifies the enhanced parameters for an Isabel payment file.";
			}
		});
		return mmObject_lazy.get();
	}
}