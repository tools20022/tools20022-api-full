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
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Meeting;
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IssuerMeeting#IssuerMeetingIdentification
 * IssuerMeeting.IssuerMeetingIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IssuerMeeting#NomineePowerOfAttorneyIndicator
 * IssuerMeeting.NomineePowerOfAttorneyIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IssuerMeeting#NomineeVotingIndicator
 * IssuerMeeting.NomineeVotingIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IssuerMeeting#NomineeBeneficialOwnerIndicator
 * IssuerMeeting.NomineeBeneficialOwnerIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IssuerMeeting#ProxyVotingIndicator
 * IssuerMeeting.ProxyVotingIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IssuerMeeting#ProxyBeneficialOwnerIndicator
 * IssuerMeeting.ProxyBeneficialOwnerIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IssuerMeeting#ProxyPowerOfAttorneyIndicator
 * IssuerMeeting.ProxyPowerOfAttorneyIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IssuerMeeting#ValidCreditorIndicator
 * IssuerMeeting.ValidCreditorIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.IssuerMeeting#CapitalStock
 * IssuerMeeting.CapitalStock}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Meeting Meeting}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#IssuerMeetingIdentification
	 * MeetingNotice1.IssuerMeetingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#IssuerMeetingIdentification
	 * MeetingNotice2.IssuerMeetingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice3#IssuerMeetingIdentification
	 * MeetingNotice3.IssuerMeetingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference1#IssuerMeetingIdentification
	 * MeetingReference1.IssuerMeetingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference2#IssuerMeetingIdentification
	 * MeetingReference2.IssuerMeetingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference5#IssuerMeetingIdentification
	 * MeetingReference5.IssuerMeetingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference3#IssuerMeetingIdentification
	 * MeetingReference3.IssuerMeetingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference4#IssuerMeetingIdentification
	 * MeetingReference4.IssuerMeetingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference7#IssuerMeetingIdentification
	 * MeetingReference7.IssuerMeetingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference6#IssuerMeetingIdentification
	 * MeetingReference6.IssuerMeetingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#IssuerMeetingIdentification
	 * MeetingNotice4.IssuerMeetingIdentification}</li>
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
	public static final MMBusinessAttribute IssuerMeetingIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MeetingNotice1.IssuerMeetingIdentification, com.tools20022.repository.msg.MeetingNotice2.IssuerMeetingIdentification,
					com.tools20022.repository.msg.MeetingNotice3.IssuerMeetingIdentification, com.tools20022.repository.msg.MeetingReference1.IssuerMeetingIdentification,
					com.tools20022.repository.msg.MeetingReference2.IssuerMeetingIdentification, com.tools20022.repository.msg.MeetingReference5.IssuerMeetingIdentification,
					com.tools20022.repository.msg.MeetingReference3.IssuerMeetingIdentification, com.tools20022.repository.msg.MeetingReference4.IssuerMeetingIdentification,
					com.tools20022.repository.msg.MeetingReference7.IssuerMeetingIdentification, com.tools20022.repository.msg.MeetingReference6.IssuerMeetingIdentification,
					com.tools20022.repository.msg.MeetingNotice4.IssuerMeetingIdentification);
			elementContext_lazy = () -> IssuerMeeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IssuerMeetingIdentification";
			definition = "Identification assigned to a meeting by the issuer. It must be unique for the issuer.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
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
	public static final MMBusinessAttribute NomineePowerOfAttorneyIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> IssuerMeeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NomineePowerOfAttorneyIndicator";
			definition = "Indicates that a power of attorney must be provided by the beneficial owner to the nominee in order for the nominee to vote on behalf of the beneficial owner.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
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
	public static final MMBusinessAttribute NomineeVotingIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> IssuerMeeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NomineeVotingIndicator";
			definition = "Indicates whether an agent can vote on behalf of the beneficial owners.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
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
	public static final MMBusinessAttribute NomineeBeneficialOwnerIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> IssuerMeeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NomineeBeneficialOwnerIndicator";
			definition = "Indicates whether the beneficiary details, for example, name and address, must be supplied in order to take part in the event.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
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
	public static final MMBusinessAttribute ProxyVotingIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> IssuerMeeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProxyVotingIndicator";
			definition = "Indicates that the beneficial owner may give authority to a third party to vote on his behalf.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
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
	public static final MMBusinessAttribute ProxyBeneficialOwnerIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> IssuerMeeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProxyBeneficialOwnerIndicator";
			definition = "Indicates whether the beneficiary details of the proxy, for example, name and address, must be supplied in order to take part in the event.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
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
	public static final MMBusinessAttribute ProxyPowerOfAttorneyIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> IssuerMeeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProxyPowerOfAttorneyIndicator";
			definition = "Indicates that a power of attorney must be provided by the beneficial owner to the proxy in order for the proxy to vote on behalf of the beneficial owner.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
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
	public static final MMBusinessAttribute ValidCreditorIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> IssuerMeeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValidCreditorIndicator";
			definition = "Indicates that the participant must be a creditor of the company in order to vote on the resolutions of the meeting.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
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
	public static final MMBusinessAttribute CapitalStock = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> IssuerMeeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CapitalStock";
			definition = "Total amount of stock, common or preferred, that a corporation has issued uder its certificate of incorporation or charter.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "IssuerMeeting";
				definition = "Information about the meeting, specifying the participation requirements and the voting procedures.";
				superType_lazy = () -> Meeting.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.IssuerMeeting.IssuerMeetingIdentification, com.tools20022.repository.entity.IssuerMeeting.NomineePowerOfAttorneyIndicator,
						com.tools20022.repository.entity.IssuerMeeting.NomineeVotingIndicator, com.tools20022.repository.entity.IssuerMeeting.NomineeBeneficialOwnerIndicator,
						com.tools20022.repository.entity.IssuerMeeting.ProxyVotingIndicator, com.tools20022.repository.entity.IssuerMeeting.ProxyBeneficialOwnerIndicator,
						com.tools20022.repository.entity.IssuerMeeting.ProxyPowerOfAttorneyIndicator, com.tools20022.repository.entity.IssuerMeeting.ValidCreditorIndicator, com.tools20022.repository.entity.IssuerMeeting.CapitalStock);
			}
		});
		return mmObject_lazy.get();
	}
}