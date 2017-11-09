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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	 * Identification assigned to a meeting by the issuer. It must be unique for
	 * the issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.IssuerMeeting IssuerMeeting}
	 * </li>
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
	public static final MMBusinessAttribute mmIssuerMeetingIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(MeetingNotice1.mmIssuerMeetingIdentification, MeetingNotice2.mmIssuerMeetingIdentification, MeetingNotice3.mmIssuerMeetingIdentification, MeetingReference1.mmIssuerMeetingIdentification,
					MeetingReference2.mmIssuerMeetingIdentification, MeetingReference5.mmIssuerMeetingIdentification, MeetingReference3.mmIssuerMeetingIdentification, MeetingReference4.mmIssuerMeetingIdentification,
					MeetingReference7.mmIssuerMeetingIdentification, MeetingReference6.mmIssuerMeetingIdentification, MeetingNotice4.mmIssuerMeetingIdentification);
			elementContext_lazy = () -> IssuerMeeting.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IssuerMeetingIdentification";
			definition = "Identification assigned to a meeting by the issuer. It must be unique for the issuer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected YesNoIndicator nomineePowerOfAttorneyIndicator;
	/**
	 * Indicates that a power of attorney must be provided by the beneficial
	 * owner to the nominee in order for the nominee to vote on behalf of the
	 * beneficial owner.
	 * <p>
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
	public static final MMBusinessAttribute mmNomineePowerOfAttorneyIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> IssuerMeeting.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NomineePowerOfAttorneyIndicator";
			definition = "Indicates that a power of attorney must be provided by the beneficial owner to the nominee in order for the nominee to vote on behalf of the beneficial owner.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator nomineeVotingIndicator;
	/**
	 * Indicates whether an agent can vote on behalf of the beneficial owners.
	 * <p>
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
	public static final MMBusinessAttribute mmNomineeVotingIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> IssuerMeeting.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NomineeVotingIndicator";
			definition = "Indicates whether an agent can vote on behalf of the beneficial owners.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator nomineeBeneficialOwnerIndicator;
	/**
	 * Indicates whether the beneficiary details, for example, name and address,
	 * must be supplied in order to take part in the event.
	 * <p>
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
	public static final MMBusinessAttribute mmNomineeBeneficialOwnerIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> IssuerMeeting.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NomineeBeneficialOwnerIndicator";
			definition = "Indicates whether the beneficiary details, for example, name and address, must be supplied in order to take part in the event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator proxyVotingIndicator;
	/**
	 * Indicates that the beneficial owner may give authority to a third party
	 * to vote on his behalf.
	 * <p>
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
	public static final MMBusinessAttribute mmProxyVotingIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> IssuerMeeting.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProxyVotingIndicator";
			definition = "Indicates that the beneficial owner may give authority to a third party to vote on his behalf.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator proxyBeneficialOwnerIndicator;
	/**
	 * Indicates whether the beneficiary details of the proxy, for example, name
	 * and address, must be supplied in order to take part in the event.
	 * <p>
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
	public static final MMBusinessAttribute mmProxyBeneficialOwnerIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> IssuerMeeting.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProxyBeneficialOwnerIndicator";
			definition = "Indicates whether the beneficiary details of the proxy, for example, name and address, must be supplied in order to take part in the event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator proxyPowerOfAttorneyIndicator;
	/**
	 * Indicates that a power of attorney must be provided by the beneficial
	 * owner to the proxy in order for the proxy to vote on behalf of the
	 * beneficial owner.
	 * <p>
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
	public static final MMBusinessAttribute mmProxyPowerOfAttorneyIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> IssuerMeeting.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProxyPowerOfAttorneyIndicator";
			definition = "Indicates that a power of attorney must be provided by the beneficial owner to the proxy in order for the proxy to vote on behalf of the beneficial owner.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator validCreditorIndicator;
	/**
	 * Indicates that the participant must be a creditor of the company in order
	 * to vote on the resolutions of the meeting.
	 * <p>
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
	public static final MMBusinessAttribute mmValidCreditorIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> IssuerMeeting.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValidCreditorIndicator";
			definition = "Indicates that the participant must be a creditor of the company in order to vote on the resolutions of the meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected CurrencyAndAmount capitalStock;
	/**
	 * Total amount of stock, common or preferred, that a corporation has issued
	 * uder its certificate of incorporation or charter.
	 * <p>
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
	public static final MMBusinessAttribute mmCapitalStock = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> IssuerMeeting.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CapitalStock";
			definition = "Total amount of stock, common or preferred, that a corporation has issued uder its certificate of incorporation or charter.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IssuerMeeting";
				definition = "Information about the meeting, specifying the participation requirements and the voting procedures.";
				superType_lazy = () -> Meeting.mmObject();
				element_lazy = () -> Arrays.asList(IssuerMeeting.mmIssuerMeetingIdentification, IssuerMeeting.mmNomineePowerOfAttorneyIndicator, IssuerMeeting.mmNomineeVotingIndicator, IssuerMeeting.mmNomineeBeneficialOwnerIndicator,
						IssuerMeeting.mmProxyVotingIndicator, IssuerMeeting.mmProxyBeneficialOwnerIndicator, IssuerMeeting.mmProxyPowerOfAttorneyIndicator, IssuerMeeting.mmValidCreditorIndicator, IssuerMeeting.mmCapitalStock);
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIssuerMeetingIdentification() {
		return issuerMeetingIdentification;
	}

	public void setIssuerMeetingIdentification(Max35Text issuerMeetingIdentification) {
		this.issuerMeetingIdentification = issuerMeetingIdentification;
	}

	public YesNoIndicator getNomineePowerOfAttorneyIndicator() {
		return nomineePowerOfAttorneyIndicator;
	}

	public void setNomineePowerOfAttorneyIndicator(YesNoIndicator nomineePowerOfAttorneyIndicator) {
		this.nomineePowerOfAttorneyIndicator = nomineePowerOfAttorneyIndicator;
	}

	public YesNoIndicator getNomineeVotingIndicator() {
		return nomineeVotingIndicator;
	}

	public void setNomineeVotingIndicator(YesNoIndicator nomineeVotingIndicator) {
		this.nomineeVotingIndicator = nomineeVotingIndicator;
	}

	public YesNoIndicator getNomineeBeneficialOwnerIndicator() {
		return nomineeBeneficialOwnerIndicator;
	}

	public void setNomineeBeneficialOwnerIndicator(YesNoIndicator nomineeBeneficialOwnerIndicator) {
		this.nomineeBeneficialOwnerIndicator = nomineeBeneficialOwnerIndicator;
	}

	public YesNoIndicator getProxyVotingIndicator() {
		return proxyVotingIndicator;
	}

	public void setProxyVotingIndicator(YesNoIndicator proxyVotingIndicator) {
		this.proxyVotingIndicator = proxyVotingIndicator;
	}

	public YesNoIndicator getProxyBeneficialOwnerIndicator() {
		return proxyBeneficialOwnerIndicator;
	}

	public void setProxyBeneficialOwnerIndicator(YesNoIndicator proxyBeneficialOwnerIndicator) {
		this.proxyBeneficialOwnerIndicator = proxyBeneficialOwnerIndicator;
	}

	public YesNoIndicator getProxyPowerOfAttorneyIndicator() {
		return proxyPowerOfAttorneyIndicator;
	}

	public void setProxyPowerOfAttorneyIndicator(YesNoIndicator proxyPowerOfAttorneyIndicator) {
		this.proxyPowerOfAttorneyIndicator = proxyPowerOfAttorneyIndicator;
	}

	public YesNoIndicator getValidCreditorIndicator() {
		return validCreditorIndicator;
	}

	public void setValidCreditorIndicator(YesNoIndicator validCreditorIndicator) {
		this.validCreditorIndicator = validCreditorIndicator;
	}

	public CurrencyAndAmount getCapitalStock() {
		return capitalStock;
	}

	public void setCapitalStock(CurrencyAndAmount capitalStock) {
		this.capitalStock = capitalStock;
	}
}