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

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.Max256Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.ContactPoint;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Address which is accessed by electronic means.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ElectronicAddress" src="doc-files/ElectronicAddress.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ElectronicAddress#EmailAddress
 * ElectronicAddress.EmailAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ElectronicAddress#URLAddress
 * ElectronicAddress.URLAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ElectronicAddress#TelexAddress
 * ElectronicAddress.TelexAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ElectronicAddress#RelatedPresentation
 * ElectronicAddress.RelatedPresentation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ElectronicAddress#TeletextAddress
 * ElectronicAddress.TeletextAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ElectronicAddress#ISDNAddress
 * ElectronicAddress.ISDNAddress}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Presentation#ElectronicPresentationAddress
 * Presentation.ElectronicPresentationAddress}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson5#PrimaryCommunicationAddress
 * IndividualPerson5.PrimaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson5#SecondaryCommunicationAddress
 * IndividualPerson5.SecondaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson10#PrimaryCommunicationAddress
 * IndividualPerson10.PrimaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson10#SecondaryCommunicationAddress
 * IndividualPerson10.SecondaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Intermediary5#PrimaryCommunicationAddress
 * Intermediary5.PrimaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Intermediary5#SecondaryCommunicationAddress
 * Intermediary5.SecondaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Intermediary12#PrimaryCommunicationAddress
 * Intermediary12.PrimaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Intermediary12#SecondaryCommunicationAddress
 * Intermediary12.SecondaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation13#PrimaryCommunicationAddress
 * Organisation13.PrimaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation13#SecondaryCommunicationAddress
 * Organisation13.SecondaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson20#PrimaryCommunicationAddress
 * IndividualPerson20.PrimaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson20#SecondaryCommunicationAddress
 * IndividualPerson20.SecondaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson6#PrimaryCommunicationAddress
 * IndividualPerson6.PrimaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson6#SecondaryCommunicationAddress
 * IndividualPerson6.SecondaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Intermediary6#PrimaryCommunicationAddress
 * Intermediary6.PrimaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Intermediary6#SecondaryCommunicationAddress
 * Intermediary6.SecondaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson11#PrimaryCommunicationAddress
 * IndividualPerson11.PrimaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson11#SecondaryCommunicationAddress
 * IndividualPerson11.SecondaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Intermediary13#PrimaryCommunicationAddress
 * Intermediary13.PrimaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Intermediary13#SecondaryCommunicationAddress
 * Intermediary13.SecondaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementFrequencyAndForm1#DeliveryAddress
 * StatementFrequencyAndForm1.DeliveryAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.VoteMethods#ElectronicVote
 * VoteMethods.ElectronicVote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters#VotingBallotElectronicAddress
 * VoteParameters.VotingBallotElectronicAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters1#VotingBallotElectronicAddress
 * VoteParameters1.VotingBallotElectronicAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters2#VotingBallotElectronicAddress
 * VoteParameters2.VotingBallotElectronicAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.VoteMethods2#ElectronicVote
 * VoteMethods2.ElectronicVote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters3#VotingBallotElectronicAddress
 * VoteParameters3.VotingBallotElectronicAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TechnicalIdentification1Choice#TechnicalAddress
 * TechnicalIdentification1Choice.TechnicalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Intermediary24#PrimaryCommunicationAddress
 * Intermediary24.PrimaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Intermediary24#SecondaryCommunicationAddress
 * Intermediary24.SecondaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson21#PrimaryCommunicationAddress
 * IndividualPerson21.PrimaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson21#SecondaryCommunicationAddress
 * IndividualPerson21.SecondaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson22#PrimaryCommunicationAddress
 * IndividualPerson22.PrimaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson22#SecondaryCommunicationAddress
 * IndividualPerson22.SecondaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation15#PrimaryCommunicationAddress
 * Organisation15.PrimaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation15#SecondaryCommunicationAddress
 * Organisation15.SecondaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceLocationDetails1#ElectronicAddress
 * RemittanceLocationDetails1.ElectronicAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation16#PrimaryCommunicationAddress
 * Organisation16.PrimaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation16#SecondaryCommunicationAddress
 * Organisation16.SecondaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation17#PrimaryCommunicationAddress
 * Organisation17.PrimaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation17#SecondaryCommunicationAddress
 * Organisation17.SecondaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson23#PrimaryCommunicationAddress
 * IndividualPerson23.PrimaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson23#SecondaryCommunicationAddress
 * IndividualPerson23.SecondaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson24#PrimaryCommunicationAddress
 * IndividualPerson24.PrimaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson24#SecondaryCommunicationAddress
 * IndividualPerson24.SecondaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters4#VotingBallotElectronicAddress
 * VoteParameters4.VotingBallotElectronicAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Intermediary36#PrimaryCommunicationAddress
 * Intermediary36.PrimaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Intermediary36#SecondaryCommunicationAddress
 * Intermediary36.SecondaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#PrimaryCommunicationAddress
 * InvestmentAccountOwnershipInformation12.PrimaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#SecondaryCommunicationAddress
 * InvestmentAccountOwnershipInformation12.SecondaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#PrimaryCommunicationAddress
 * InvestmentAccountOwnershipInformation13.PrimaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#SecondaryCommunicationAddress
 * InvestmentAccountOwnershipInformation13.SecondaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#PrimaryCommunicationAddress
 * InvestmentAccountOwnershipInformation15.PrimaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#SecondaryCommunicationAddress
 * InvestmentAccountOwnershipInformation15.SecondaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#PrimaryCommunicationAddress
 * InvestmentAccountOwnershipInformation14.PrimaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#SecondaryCommunicationAddress
 * InvestmentAccountOwnershipInformation14.SecondaryCommunicationAddress}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.ContactPoint
 * ContactPoint}</li>
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
 * "ElectronicAddress"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Address which is accessed by electronic means."</li>
 * </ul>
 */
public class ElectronicAddress extends ContactPoint {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Address for electronic mail (e-mail).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactDetails1#EmailAddress
	 * ContactDetails1.EmailAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderDeskContactDetails#EmailAddress
	 * OrderDeskContactDetails.EmailAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactAttributes1#EmailAddress
	 * ContactAttributes1.EmailAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommunicationAddress3#Email
	 * CommunicationAddress3.Email}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactDetails2#EmailAddress
	 * ContactDetails2.EmailAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification2#EmailAddress
	 * ContactIdentification2.EmailAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification1#EmailAddress
	 * ContactIdentification1.EmailAddress}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Contacts3#EmailAddress
	 * Contacts3.EmailAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactInformation1#EmailAddress
	 * ContactInformation1.EmailAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommunicationAddress4#EmailAddress
	 * CommunicationAddress4.EmailAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification4#EmailAddress
	 * ContactIdentification4.EmailAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification3#EmailAddress
	 * ContactIdentification3.EmailAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommunicationAddressDetails#EmailAddress
	 * CommunicationAddressDetails.EmailAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactDetails3#EmailAddress
	 * ContactDetails3.EmailAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification7#EmailAddress
	 * PersonIdentification7.EmailAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommunicationAddress5#Email
	 * CommunicationAddress5.Email}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommunicationAddress6#Email
	 * CommunicationAddress6.Email}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification11#EmailAddress
	 * PersonIdentification11.EmailAddress}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ElectronicAddress
	 * ElectronicAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmailAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Address for electronic mail (e-mail)."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EmailAddress = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ContactDetails1.EmailAddress, com.tools20022.repository.msg.OrderDeskContactDetails.EmailAddress,
					com.tools20022.repository.msg.ContactAttributes1.EmailAddress, com.tools20022.repository.msg.CommunicationAddress3.Email, com.tools20022.repository.msg.ContactDetails2.EmailAddress,
					com.tools20022.repository.msg.ContactIdentification2.EmailAddress, com.tools20022.repository.msg.ContactIdentification1.EmailAddress, com.tools20022.repository.msg.Contacts3.EmailAddress,
					com.tools20022.repository.msg.ContactInformation1.EmailAddress, com.tools20022.repository.msg.CommunicationAddress4.EmailAddress, com.tools20022.repository.msg.ContactIdentification4.EmailAddress,
					com.tools20022.repository.msg.ContactIdentification3.EmailAddress, com.tools20022.repository.msg.CommunicationAddressDetails.EmailAddress, com.tools20022.repository.msg.ContactDetails3.EmailAddress,
					com.tools20022.repository.msg.PersonIdentification7.EmailAddress, com.tools20022.repository.msg.CommunicationAddress5.Email, com.tools20022.repository.msg.CommunicationAddress6.Email,
					com.tools20022.repository.msg.PersonIdentification11.EmailAddress);
			elementContext_lazy = () -> ElectronicAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EmailAddress";
			definition = "Address for electronic mail (e-mail).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max256Text.mmObject();
		}
	};
	/**
	 * Address for the Universal Resource Locator (URL), eg, used over the www
	 * (HTTP) service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ContactDetails1#URLAddress
	 * ContactDetails1.URLAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactAttributes1#URLAddress
	 * ContactAttributes1.URLAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommunicationAddress3#URLAddress
	 * CommunicationAddress3.URLAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative3#URLAddress
	 * CorporateActionNarrative3.URLAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative18#URLAddress
	 * CorporateActionNarrative18.URLAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#AdditionalDocumentationURLAddress
	 * MeetingNotice1.AdditionalDocumentationURLAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommunicationAddress4#URLAddress
	 * CommunicationAddress4.URLAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#AdditionalDocumentationURLAddress
	 * MeetingNotice2.AdditionalDocumentationURLAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalRights1#AdditionalRightInformationURLAddress
	 * AdditionalRights1.AdditionalRightInformationURLAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice3#AdditionalDocumentationURLAddress
	 * MeetingNotice3.AdditionalDocumentationURLAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IssuerInformation1#URLAddress
	 * IssuerInformation1.URLAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative1#URLAddress
	 * CorporateActionNarrative1.URLAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AgreementClauses1#DocumentURL
	 * AgreementClauses1.DocumentURL}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation1#URL
	 * DocumentGeneralInformation1.URL}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation2#URL
	 * DocumentGeneralInformation2.URL}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IssuerInformation2#URLAddress
	 * IssuerInformation2.URLAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#AdditionalDocumentationURLAddress
	 * MeetingNotice4.AdditionalDocumentationURLAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalRights2#AdditionalRightInformationURLAddress
	 * AdditionalRights2.AdditionalRightInformationURLAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QualifiedDocumentInformation1#URL
	 * QualifiedDocumentInformation1.URL}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommunicationAddress5#URLAddress
	 * CommunicationAddress5.URLAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation3#URL
	 * DocumentGeneralInformation3.URL}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommunicationAddress6#URLAddress
	 * CommunicationAddress6.URLAddress}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ElectronicAddress
	 * ElectronicAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "URLAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Address for the Universal Resource Locator (URL), eg, used over the www (HTTP) service."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute URLAddress = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ContactDetails1.URLAddress, com.tools20022.repository.msg.ContactAttributes1.URLAddress, com.tools20022.repository.msg.CommunicationAddress3.URLAddress,
					com.tools20022.repository.msg.CorporateActionNarrative3.URLAddress, com.tools20022.repository.msg.CorporateActionNarrative18.URLAddress, com.tools20022.repository.msg.MeetingNotice1.AdditionalDocumentationURLAddress,
					com.tools20022.repository.msg.CommunicationAddress4.URLAddress, com.tools20022.repository.msg.MeetingNotice2.AdditionalDocumentationURLAddress,
					com.tools20022.repository.msg.AdditionalRights1.AdditionalRightInformationURLAddress, com.tools20022.repository.msg.MeetingNotice3.AdditionalDocumentationURLAddress,
					com.tools20022.repository.msg.IssuerInformation1.URLAddress, com.tools20022.repository.msg.CorporateActionNarrative1.URLAddress, com.tools20022.repository.msg.AgreementClauses1.DocumentURL,
					com.tools20022.repository.msg.DocumentGeneralInformation1.URL, com.tools20022.repository.msg.DocumentGeneralInformation2.URL, com.tools20022.repository.msg.IssuerInformation2.URLAddress,
					com.tools20022.repository.msg.MeetingNotice4.AdditionalDocumentationURLAddress, com.tools20022.repository.msg.AdditionalRights2.AdditionalRightInformationURLAddress,
					com.tools20022.repository.msg.QualifiedDocumentInformation1.URL, com.tools20022.repository.msg.CommunicationAddress5.URLAddress, com.tools20022.repository.msg.DocumentGeneralInformation3.URL,
					com.tools20022.repository.msg.CommunicationAddress6.URLAddress);
			elementContext_lazy = () -> ElectronicAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "URLAddress";
			definition = "Address for the Universal Resource Locator (URL), eg, used over the www (HTTP) service.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max256Text.mmObject();
		}
	};
	/**
	 * Address for a telex machine.
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
	 * {@linkplain com.tools20022.repository.msg.CommunicationAddress3#TelexAddress
	 * CommunicationAddress3.TelexAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommunicationAddress6#TelexAddress
	 * CommunicationAddress6.TelexAddress}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ElectronicAddress
	 * ElectronicAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TelexAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Address for a telex machine."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TelexAddress = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CommunicationAddress3.TelexAddress, com.tools20022.repository.msg.CommunicationAddress6.TelexAddress);
			elementContext_lazy = () -> ElectronicAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TelexAddress";
			definition = "Address for a telex machine.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Presentation process for which an electronic presentation address is
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Presentation#ElectronicPresentationAddress
	 * Presentation.ElectronicPresentationAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Presentation
	 * Presentation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ElectronicAddress
	 * ElectronicAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPresentation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Presentation process for which an electronic presentation address is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedPresentation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ElectronicAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedPresentation";
			definition = "Presentation process for which an electronic presentation address is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Presentation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Presentation.ElectronicPresentationAddress;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Address for a teletext.
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
	 * {@linkplain com.tools20022.repository.entity.ElectronicAddress
	 * ElectronicAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TeletextAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Address for a teletext."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TeletextAddress = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> ElectronicAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TeletextAddress";
			definition = "Address for a teletext.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Address for an Integrated Services Digital Network.
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
	 * {@linkplain com.tools20022.repository.entity.ElectronicAddress
	 * ElectronicAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISDNAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Address for an Integrated Services Digital Network."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ISDNAddress = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> ElectronicAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ISDNAddress";
			definition = "Address for an Integrated Services Digital Network.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ElectronicAddress";
				definition = "Address which is accessed by electronic means.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Presentation.ElectronicPresentationAddress);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualPerson5.PrimaryCommunicationAddress, com.tools20022.repository.msg.IndividualPerson5.SecondaryCommunicationAddress,
						com.tools20022.repository.msg.IndividualPerson10.PrimaryCommunicationAddress, com.tools20022.repository.msg.IndividualPerson10.SecondaryCommunicationAddress,
						com.tools20022.repository.msg.Intermediary5.PrimaryCommunicationAddress, com.tools20022.repository.msg.Intermediary5.SecondaryCommunicationAddress,
						com.tools20022.repository.msg.Intermediary12.PrimaryCommunicationAddress, com.tools20022.repository.msg.Intermediary12.SecondaryCommunicationAddress,
						com.tools20022.repository.msg.Organisation13.PrimaryCommunicationAddress, com.tools20022.repository.msg.Organisation13.SecondaryCommunicationAddress,
						com.tools20022.repository.msg.IndividualPerson20.PrimaryCommunicationAddress, com.tools20022.repository.msg.IndividualPerson20.SecondaryCommunicationAddress,
						com.tools20022.repository.msg.IndividualPerson6.PrimaryCommunicationAddress, com.tools20022.repository.msg.IndividualPerson6.SecondaryCommunicationAddress,
						com.tools20022.repository.msg.Intermediary6.PrimaryCommunicationAddress, com.tools20022.repository.msg.Intermediary6.SecondaryCommunicationAddress,
						com.tools20022.repository.msg.IndividualPerson11.PrimaryCommunicationAddress, com.tools20022.repository.msg.IndividualPerson11.SecondaryCommunicationAddress,
						com.tools20022.repository.msg.Intermediary13.PrimaryCommunicationAddress, com.tools20022.repository.msg.Intermediary13.SecondaryCommunicationAddress,
						com.tools20022.repository.msg.StatementFrequencyAndForm1.DeliveryAddress, com.tools20022.repository.msg.VoteMethods.ElectronicVote, com.tools20022.repository.msg.VoteParameters.VotingBallotElectronicAddress,
						com.tools20022.repository.msg.VoteParameters1.VotingBallotElectronicAddress, com.tools20022.repository.msg.VoteParameters2.VotingBallotElectronicAddress, com.tools20022.repository.msg.VoteMethods2.ElectronicVote,
						com.tools20022.repository.msg.VoteParameters3.VotingBallotElectronicAddress, com.tools20022.repository.choice.TechnicalIdentification1Choice.TechnicalAddress,
						com.tools20022.repository.msg.Intermediary24.PrimaryCommunicationAddress, com.tools20022.repository.msg.Intermediary24.SecondaryCommunicationAddress,
						com.tools20022.repository.msg.IndividualPerson21.PrimaryCommunicationAddress, com.tools20022.repository.msg.IndividualPerson21.SecondaryCommunicationAddress,
						com.tools20022.repository.msg.IndividualPerson22.PrimaryCommunicationAddress, com.tools20022.repository.msg.IndividualPerson22.SecondaryCommunicationAddress,
						com.tools20022.repository.msg.Organisation15.PrimaryCommunicationAddress, com.tools20022.repository.msg.Organisation15.SecondaryCommunicationAddress,
						com.tools20022.repository.msg.RemittanceLocationDetails1.ElectronicAddress, com.tools20022.repository.msg.Organisation16.PrimaryCommunicationAddress,
						com.tools20022.repository.msg.Organisation16.SecondaryCommunicationAddress, com.tools20022.repository.msg.Organisation17.PrimaryCommunicationAddress,
						com.tools20022.repository.msg.Organisation17.SecondaryCommunicationAddress, com.tools20022.repository.msg.IndividualPerson23.PrimaryCommunicationAddress,
						com.tools20022.repository.msg.IndividualPerson23.SecondaryCommunicationAddress, com.tools20022.repository.msg.IndividualPerson24.PrimaryCommunicationAddress,
						com.tools20022.repository.msg.IndividualPerson24.SecondaryCommunicationAddress, com.tools20022.repository.msg.VoteParameters4.VotingBallotElectronicAddress,
						com.tools20022.repository.msg.Intermediary36.PrimaryCommunicationAddress, com.tools20022.repository.msg.Intermediary36.SecondaryCommunicationAddress,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.PrimaryCommunicationAddress, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.SecondaryCommunicationAddress,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13.PrimaryCommunicationAddress, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13.SecondaryCommunicationAddress,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.PrimaryCommunicationAddress, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.SecondaryCommunicationAddress,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.PrimaryCommunicationAddress, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.SecondaryCommunicationAddress);
				superType_lazy = () -> ContactPoint.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ElectronicAddress.EmailAddress, com.tools20022.repository.entity.ElectronicAddress.URLAddress,
						com.tools20022.repository.entity.ElectronicAddress.TelexAddress, com.tools20022.repository.entity.ElectronicAddress.RelatedPresentation, com.tools20022.repository.entity.ElectronicAddress.TeletextAddress,
						com.tools20022.repository.entity.ElectronicAddress.ISDNAddress);
			}
		});
		return mmObject_lazy.get();
	}
}