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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Meeting;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

/**
 * Information about the meeting, specifying the participation requirements and
 * the voting procedures.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="IssuerMeeting" src="doc-files/IssuerMeeting.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Meeting Meeting}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IssuerMeeting#mmIssuerMeetingIdentification
 * IssuerMeeting.mmIssuerMeetingIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IssuerMeeting#mmNomineePowerOfAttorneyIndicator
 * IssuerMeeting.mmNomineePowerOfAttorneyIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IssuerMeeting#mmNomineeVotingIndicator
 * IssuerMeeting.mmNomineeVotingIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IssuerMeeting#mmNomineeBeneficialOwnerIndicator
 * IssuerMeeting.mmNomineeBeneficialOwnerIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IssuerMeeting#mmProxyVotingIndicator
 * IssuerMeeting.mmProxyVotingIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IssuerMeeting#mmProxyBeneficialOwnerIndicator
 * IssuerMeeting.mmProxyBeneficialOwnerIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IssuerMeeting#mmProxyPowerOfAttorneyIndicator
 * IssuerMeeting.mmProxyPowerOfAttorneyIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IssuerMeeting#mmValidCreditorIndicator
 * IssuerMeeting.mmValidCreditorIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IssuerMeeting#mmCapitalStock
 * IssuerMeeting.mmCapitalStock}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IssuerMeeting"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information about the meeting, specifying the participation requirements and the voting procedures."
 * </li>
 * </ul>
 */
public class IssuerMeeting extends Meeting {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text issuerMeetingIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#mmIssuerMeetingIdentification
	 * MeetingNotice1.mmIssuerMeetingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#mmIssuerMeetingIdentification
	 * MeetingNotice2.mmIssuerMeetingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice3#mmIssuerMeetingIdentification
	 * MeetingNotice3.mmIssuerMeetingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference1#mmIssuerMeetingIdentification
	 * MeetingReference1.mmIssuerMeetingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference2#mmIssuerMeetingIdentification
	 * MeetingReference2.mmIssuerMeetingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference5#mmIssuerMeetingIdentification
	 * MeetingReference5.mmIssuerMeetingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference3#mmIssuerMeetingIdentification
	 * MeetingReference3.mmIssuerMeetingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference4#mmIssuerMeetingIdentification
	 * MeetingReference4.mmIssuerMeetingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference7#mmIssuerMeetingIdentification
	 * MeetingReference7.mmIssuerMeetingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference6#mmIssuerMeetingIdentification
	 * MeetingReference6.mmIssuerMeetingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#mmIssuerMeetingIdentification
	 * MeetingNotice4.mmIssuerMeetingIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.IssuerMeeting IssuerMeeting}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerMeetingIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification assigned to a meeting by the issuer. It must be unique for the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<IssuerMeeting, Max35Text> mmIssuerMeetingIdentification = new MMBusinessAttribute<IssuerMeeting, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(MeetingNotice1.mmIssuerMeetingIdentification, MeetingNotice2.mmIssuerMeetingIdentification, MeetingNotice3.mmIssuerMeetingIdentification, MeetingReference1.mmIssuerMeetingIdentification,
					MeetingReference2.mmIssuerMeetingIdentification, MeetingReference5.mmIssuerMeetingIdentification, MeetingReference3.mmIssuerMeetingIdentification, MeetingReference4.mmIssuerMeetingIdentification,
					MeetingReference7.mmIssuerMeetingIdentification, MeetingReference6.mmIssuerMeetingIdentification, MeetingNotice4.mmIssuerMeetingIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.IssuerMeeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IssuerMeetingIdentification";
			definition = "Identification assigned to a meeting by the issuer. It must be unique for the issuer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(IssuerMeeting obj) {
			return obj.getIssuerMeetingIdentification();
		}

		@Override
		public void setValue(IssuerMeeting obj, Max35Text value) {
			obj.setIssuerMeetingIdentification(value);
		}
	};
	protected YesNoIndicator nomineePowerOfAttorneyIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.IssuerMeeting IssuerMeeting}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NomineePowerOfAttorneyIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that a power of attorney must be provided by the beneficial owner to the nominee in order for the nominee to vote on behalf of the beneficial owner."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<IssuerMeeting, YesNoIndicator> mmNomineePowerOfAttorneyIndicator = new MMBusinessAttribute<IssuerMeeting, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.IssuerMeeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NomineePowerOfAttorneyIndicator";
			definition = "Indicates that a power of attorney must be provided by the beneficial owner to the nominee in order for the nominee to vote on behalf of the beneficial owner.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(IssuerMeeting obj) {
			return obj.getNomineePowerOfAttorneyIndicator();
		}

		@Override
		public void setValue(IssuerMeeting obj, YesNoIndicator value) {
			obj.setNomineePowerOfAttorneyIndicator(value);
		}
	};
	protected YesNoIndicator nomineeVotingIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.IssuerMeeting IssuerMeeting}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NomineeVotingIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether an agent can vote on behalf of the beneficial owners."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<IssuerMeeting, YesNoIndicator> mmNomineeVotingIndicator = new MMBusinessAttribute<IssuerMeeting, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.IssuerMeeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NomineeVotingIndicator";
			definition = "Indicates whether an agent can vote on behalf of the beneficial owners.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(IssuerMeeting obj) {
			return obj.getNomineeVotingIndicator();
		}

		@Override
		public void setValue(IssuerMeeting obj, YesNoIndicator value) {
			obj.setNomineeVotingIndicator(value);
		}
	};
	protected YesNoIndicator nomineeBeneficialOwnerIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.IssuerMeeting IssuerMeeting}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NomineeBeneficialOwnerIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the beneficiary details, for example, name and address, must be supplied in order to take part in the event."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<IssuerMeeting, YesNoIndicator> mmNomineeBeneficialOwnerIndicator = new MMBusinessAttribute<IssuerMeeting, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.IssuerMeeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NomineeBeneficialOwnerIndicator";
			definition = "Indicates whether the beneficiary details, for example, name and address, must be supplied in order to take part in the event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(IssuerMeeting obj) {
			return obj.getNomineeBeneficialOwnerIndicator();
		}

		@Override
		public void setValue(IssuerMeeting obj, YesNoIndicator value) {
			obj.setNomineeBeneficialOwnerIndicator(value);
		}
	};
	protected YesNoIndicator proxyVotingIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.IssuerMeeting IssuerMeeting}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProxyVotingIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the beneficial owner may give authority to a third party to vote on his behalf."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<IssuerMeeting, YesNoIndicator> mmProxyVotingIndicator = new MMBusinessAttribute<IssuerMeeting, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.IssuerMeeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProxyVotingIndicator";
			definition = "Indicates that the beneficial owner may give authority to a third party to vote on his behalf.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(IssuerMeeting obj) {
			return obj.getProxyVotingIndicator();
		}

		@Override
		public void setValue(IssuerMeeting obj, YesNoIndicator value) {
			obj.setProxyVotingIndicator(value);
		}
	};
	protected YesNoIndicator proxyBeneficialOwnerIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.IssuerMeeting IssuerMeeting}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProxyBeneficialOwnerIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the beneficiary details of the proxy, for example, name and address, must be supplied in order to take part in the event."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<IssuerMeeting, YesNoIndicator> mmProxyBeneficialOwnerIndicator = new MMBusinessAttribute<IssuerMeeting, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.IssuerMeeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProxyBeneficialOwnerIndicator";
			definition = "Indicates whether the beneficiary details of the proxy, for example, name and address, must be supplied in order to take part in the event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(IssuerMeeting obj) {
			return obj.getProxyBeneficialOwnerIndicator();
		}

		@Override
		public void setValue(IssuerMeeting obj, YesNoIndicator value) {
			obj.setProxyBeneficialOwnerIndicator(value);
		}
	};
	protected YesNoIndicator proxyPowerOfAttorneyIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.IssuerMeeting IssuerMeeting}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProxyPowerOfAttorneyIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that a power of attorney must be provided by the beneficial owner to the proxy in order for the proxy to vote on behalf of the beneficial owner."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<IssuerMeeting, YesNoIndicator> mmProxyPowerOfAttorneyIndicator = new MMBusinessAttribute<IssuerMeeting, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.IssuerMeeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProxyPowerOfAttorneyIndicator";
			definition = "Indicates that a power of attorney must be provided by the beneficial owner to the proxy in order for the proxy to vote on behalf of the beneficial owner.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(IssuerMeeting obj) {
			return obj.getProxyPowerOfAttorneyIndicator();
		}

		@Override
		public void setValue(IssuerMeeting obj, YesNoIndicator value) {
			obj.setProxyPowerOfAttorneyIndicator(value);
		}
	};
	protected YesNoIndicator validCreditorIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.IssuerMeeting IssuerMeeting}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidCreditorIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the participant must be a creditor of the company in order to vote on the resolutions of the meeting."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<IssuerMeeting, YesNoIndicator> mmValidCreditorIndicator = new MMBusinessAttribute<IssuerMeeting, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.IssuerMeeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValidCreditorIndicator";
			definition = "Indicates that the participant must be a creditor of the company in order to vote on the resolutions of the meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(IssuerMeeting obj) {
			return obj.getValidCreditorIndicator();
		}

		@Override
		public void setValue(IssuerMeeting obj, YesNoIndicator value) {
			obj.setValidCreditorIndicator(value);
		}
	};
	protected CurrencyAndAmount capitalStock;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.IssuerMeeting IssuerMeeting}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalStock"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of stock, common or preferred, that a corporation has issued uder its certificate of incorporation or charter."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<IssuerMeeting, CurrencyAndAmount> mmCapitalStock = new MMBusinessAttribute<IssuerMeeting, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.IssuerMeeting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CapitalStock";
			definition = "Total amount of stock, common or preferred, that a corporation has issued uder its certificate of incorporation or charter.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(IssuerMeeting obj) {
			return obj.getCapitalStock();
		}

		@Override
		public void setValue(IssuerMeeting obj, CurrencyAndAmount value) {
			obj.setCapitalStock(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IssuerMeeting";
				definition = "Information about the meeting, specifying the participation requirements and the voting procedures.";
				superType_lazy = () -> Meeting.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.IssuerMeeting.mmIssuerMeetingIdentification, com.tools20022.repository.entity.IssuerMeeting.mmNomineePowerOfAttorneyIndicator,
						com.tools20022.repository.entity.IssuerMeeting.mmNomineeVotingIndicator, com.tools20022.repository.entity.IssuerMeeting.mmNomineeBeneficialOwnerIndicator,
						com.tools20022.repository.entity.IssuerMeeting.mmProxyVotingIndicator, com.tools20022.repository.entity.IssuerMeeting.mmProxyBeneficialOwnerIndicator,
						com.tools20022.repository.entity.IssuerMeeting.mmProxyPowerOfAttorneyIndicator, com.tools20022.repository.entity.IssuerMeeting.mmValidCreditorIndicator, com.tools20022.repository.entity.IssuerMeeting.mmCapitalStock);
			}

			@Override
			public Class<?> getInstanceClass() {
				return IssuerMeeting.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIssuerMeetingIdentification() {
		return issuerMeetingIdentification;
	}

	public IssuerMeeting setIssuerMeetingIdentification(Max35Text issuerMeetingIdentification) {
		this.issuerMeetingIdentification = Objects.requireNonNull(issuerMeetingIdentification);
		return this;
	}

	public YesNoIndicator getNomineePowerOfAttorneyIndicator() {
		return nomineePowerOfAttorneyIndicator;
	}

	public IssuerMeeting setNomineePowerOfAttorneyIndicator(YesNoIndicator nomineePowerOfAttorneyIndicator) {
		this.nomineePowerOfAttorneyIndicator = Objects.requireNonNull(nomineePowerOfAttorneyIndicator);
		return this;
	}

	public YesNoIndicator getNomineeVotingIndicator() {
		return nomineeVotingIndicator;
	}

	public IssuerMeeting setNomineeVotingIndicator(YesNoIndicator nomineeVotingIndicator) {
		this.nomineeVotingIndicator = Objects.requireNonNull(nomineeVotingIndicator);
		return this;
	}

	public YesNoIndicator getNomineeBeneficialOwnerIndicator() {
		return nomineeBeneficialOwnerIndicator;
	}

	public IssuerMeeting setNomineeBeneficialOwnerIndicator(YesNoIndicator nomineeBeneficialOwnerIndicator) {
		this.nomineeBeneficialOwnerIndicator = Objects.requireNonNull(nomineeBeneficialOwnerIndicator);
		return this;
	}

	public YesNoIndicator getProxyVotingIndicator() {
		return proxyVotingIndicator;
	}

	public IssuerMeeting setProxyVotingIndicator(YesNoIndicator proxyVotingIndicator) {
		this.proxyVotingIndicator = Objects.requireNonNull(proxyVotingIndicator);
		return this;
	}

	public YesNoIndicator getProxyBeneficialOwnerIndicator() {
		return proxyBeneficialOwnerIndicator;
	}

	public IssuerMeeting setProxyBeneficialOwnerIndicator(YesNoIndicator proxyBeneficialOwnerIndicator) {
		this.proxyBeneficialOwnerIndicator = Objects.requireNonNull(proxyBeneficialOwnerIndicator);
		return this;
	}

	public YesNoIndicator getProxyPowerOfAttorneyIndicator() {
		return proxyPowerOfAttorneyIndicator;
	}

	public IssuerMeeting setProxyPowerOfAttorneyIndicator(YesNoIndicator proxyPowerOfAttorneyIndicator) {
		this.proxyPowerOfAttorneyIndicator = Objects.requireNonNull(proxyPowerOfAttorneyIndicator);
		return this;
	}

	public YesNoIndicator getValidCreditorIndicator() {
		return validCreditorIndicator;
	}

	public IssuerMeeting setValidCreditorIndicator(YesNoIndicator validCreditorIndicator) {
		this.validCreditorIndicator = Objects.requireNonNull(validCreditorIndicator);
		return this;
	}

	public CurrencyAndAmount getCapitalStock() {
		return capitalStock;
	}

	public IssuerMeeting setCapitalStock(CurrencyAndAmount capitalStock) {
		this.capitalStock = Objects.requireNonNull(capitalStock);
		return this;
	}
}