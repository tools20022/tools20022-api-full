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

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.Channel1Choice;
import com.tools20022.repository.choice.Channel2Choice;
import com.tools20022.repository.choice.CommunicationMethod1Choice;
import com.tools20022.repository.choice.PresentationMedium1Choice;
import com.tools20022.repository.codeset.CommunicationMethodCode;
import com.tools20022.repository.codeset.ExternalChannelCode;
import com.tools20022.repository.codeset.PresentationMediumCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Presentation of documents.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Presentation" src="doc-files/Presentation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.CommunicationMethod1Choice
 * CommunicationMethod1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommunicationChannel1
 * CommunicationChannel1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PresentationMedium1Choice
 * PresentationMedium1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Channel1Choice
 * Channel1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Presentation3 Presentation3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Presentation4 Presentation4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Presentation2 Presentation2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Presentation1 Presentation1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegisteredContractCommunication1
 * RegisteredContractCommunication1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ElectronicAddress#mmRelatedPresentation
 * ElectronicAddress.mmRelatedPresentation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmPresentation
 * Document.mmPresentation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Undertaking#mmPresentation
 * Undertaking.mmPresentation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Presentation#mmCommunicationMethod
 * Presentation.mmCommunicationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Presentation#mmPresentedUndertaking
 * Presentation.mmPresentedUndertaking}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Presentation#mmMedium
 * Presentation.mmMedium}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Presentation#mmPresentedDocument
 * Presentation.mmPresentedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Presentation#mmElectronicPresentationAddress
 * Presentation.mmElectronicPresentationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Presentation#mmPresentationDate
 * Presentation.mmPresentationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Presentation#mmApplicableChannel
 * Presentation.mmApplicableChannel}</li>
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
 * "Presentation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Presentation of documents."</li>
 * </ul>
 */
public class Presentation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ExternalChannelCode communicationMethod;
	/**
	 * Method by which the document is to be delivered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalChannelCode
	 * ExternalChannelCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Presentation Presentation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.choice.Channel2Choice#mmCode
	 * Channel2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Channel2Choice#mmProprietary
	 * Channel2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CommunicationMethod1Choice#mmCode
	 * CommunicationMethod1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CommunicationMethod1Choice#mmProprietary
	 * CommunicationMethod1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NonExtension1#mmNotificationMethod
	 * NonExtension1.mmNotificationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommunicationChannel1#mmMethod
	 * CommunicationChannel1.mmMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking11#mmDeliveryChannel
	 * Undertaking11.mmDeliveryChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Amendment1#mmDeliveryChannel
	 * Amendment1.mmDeliveryChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Amendment3#mmDeliveryChannel
	 * Amendment3.mmDeliveryChannel}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Channel1Choice#mmCode
	 * Channel1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Channel1Choice#mmProprietary
	 * Channel1Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Presentation3#mmChannel
	 * Presentation3.mmChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Document10#mmPresentationChannel
	 * Document10.mmPresentationChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking1#mmDeliveryChannel
	 * Undertaking1.mmDeliveryChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking4#mmDeliveryChannel
	 * Undertaking4.mmDeliveryChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking3#mmDeliveryChannel
	 * Undertaking3.mmDeliveryChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContractCommunication1#mmMethod
	 * RegisteredContractCommunication1.mmMethod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommunicationMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Method by which the document is to be delivered."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCommunicationMethod = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Channel2Choice.mmCode, Channel2Choice.mmProprietary, CommunicationMethod1Choice.mmCode, CommunicationMethod1Choice.mmProprietary, NonExtension1.mmNotificationMethod,
					CommunicationChannel1.mmMethod, Undertaking11.mmDeliveryChannel, Amendment1.mmDeliveryChannel, Amendment3.mmDeliveryChannel, Channel1Choice.mmCode, Channel1Choice.mmProprietary, Presentation3.mmChannel,
					Document10.mmPresentationChannel, Undertaking1.mmDeliveryChannel, Undertaking4.mmDeliveryChannel, Undertaking3.mmDeliveryChannel, RegisteredContractCommunication1.mmMethod);
			elementContext_lazy = () -> Presentation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CommunicationMethod";
			definition = "Method by which the document is to be delivered.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalChannelCode.mmObject();
		}
	};
	protected Undertaking presentedUndertaking;
	/**
	 * Specifies the undertaking which is presented and its associated
	 * documents.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmPresentation
	 * Undertaking.mmPresentation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Undertaking
	 * Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Presentation Presentation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PresentedUndertaking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the undertaking which is presented and its associated documents."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPresentedUndertaking = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Presentation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PresentedUndertaking";
			definition = "Specifies the undertaking which is presented and its associated documents.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Undertaking.mmPresentation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
		}
	};
	protected PresentationMediumCode medium;
	/**
	 * Medium through which the presentation can be submitted such as paper,
	 * electronic or both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PresentationMediumCode
	 * PresentationMediumCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Presentation Presentation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PresentationMedium1Choice#mmCode
	 * PresentationMedium1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PresentationMedium1Choice#mmProprietary
	 * PresentationMedium1Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Presentation4#mmMedium
	 * Presentation4.mmMedium}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Presentation1#mmMedium
	 * Presentation1.mmMedium}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UndertakingAdvice2#mmOriginalIssuedMedium
	 * UndertakingAdvice2.mmOriginalIssuedMedium}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Medium"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Medium through which the presentation can be submitted such as paper, electronic or both."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMedium = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PresentationMedium1Choice.mmCode, PresentationMedium1Choice.mmProprietary, Presentation4.mmMedium, Presentation1.mmMedium, UndertakingAdvice2.mmOriginalIssuedMedium);
			elementContext_lazy = () -> Presentation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Medium";
			definition = "Medium through which the presentation can be submitted such as paper, electronic or both.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PresentationMediumCode.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Document> presentedDocument;
	/**
	 * Documents which are presented.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmPresentation
	 * Document.mmPresentation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Presentation Presentation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Presentation4#mmDocument
	 * Presentation4.mmDocument}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Presentation1#mmDocument
	 * Presentation1.mmDocument}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PresentedDocument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Documents which are presented."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPresentedDocument = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(Presentation4.mmDocument, Presentation1.mmDocument);
			elementContext_lazy = () -> Presentation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PresentedDocument";
			definition = "Documents which are presented.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Document.mmPresentation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
		}
	};
	protected ElectronicAddress electronicPresentationAddress;
	/**
	 * Electronic address for the presentation of documents.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ElectronicAddress#mmRelatedPresentation
	 * ElectronicAddress.mmRelatedPresentation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ElectronicAddress
	 * ElectronicAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Presentation Presentation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Presentation3#mmAddress
	 * Presentation3.mmAddress}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectronicPresentationAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Electronic address for the presentation of documents."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmElectronicPresentationAddress = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(Presentation3.mmAddress);
			elementContext_lazy = () -> Presentation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ElectronicPresentationAddress";
			definition = "Electronic address for the presentation of documents.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ElectronicAddress.mmRelatedPresentation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ElectronicAddress.mmObject();
		}
	};
	protected ISODate presentationDate;
	/**
	 * Date on which the presentation is made.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Presentation Presentation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Presentation2#mmBeneficiaryPresentationDate
	 * Presentation2.mmBeneficiaryPresentationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContractCommunication1#mmDate
	 * RegisteredContractCommunication1.mmDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PresentationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the presentation is made."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPresentationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Presentation2.mmBeneficiaryPresentationDate, RegisteredContractCommunication1.mmDate);
			elementContext_lazy = () -> Presentation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PresentationDate";
			definition = "Date on which the presentation is made.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected CommunicationMethodCode applicableChannel;
	/**
	 * Channel used for the transmission of a document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CommunicationMethodCode
	 * CommunicationMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Presentation Presentation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicableChannel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Channel used for the transmission of a document."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmApplicableChannel = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Presentation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ApplicableChannel";
			definition = "Channel used for the transmission of a document.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CommunicationMethodCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Presentation";
				definition = "Presentation of documents.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ElectronicAddress.mmRelatedPresentation, com.tools20022.repository.entity.Document.mmPresentation,
						com.tools20022.repository.entity.Undertaking.mmPresentation);
				element_lazy = () -> Arrays.asList(Presentation.mmCommunicationMethod, Presentation.mmPresentedUndertaking, Presentation.mmMedium, Presentation.mmPresentedDocument, Presentation.mmElectronicPresentationAddress,
						Presentation.mmPresentationDate, Presentation.mmApplicableChannel);
				derivationComponent_lazy = () -> Arrays.asList(CommunicationMethod1Choice.mmObject(), CommunicationChannel1.mmObject(), PresentationMedium1Choice.mmObject(), Channel1Choice.mmObject(), Presentation3.mmObject(),
						Presentation4.mmObject(), Presentation2.mmObject(), Presentation1.mmObject(), RegisteredContractCommunication1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public ExternalChannelCode getCommunicationMethod() {
		return communicationMethod;
	}

	public void setCommunicationMethod(ExternalChannelCode communicationMethod) {
		this.communicationMethod = communicationMethod;
	}

	public Undertaking getPresentedUndertaking() {
		return presentedUndertaking;
	}

	public void setPresentedUndertaking(com.tools20022.repository.entity.Undertaking presentedUndertaking) {
		this.presentedUndertaking = presentedUndertaking;
	}

	public PresentationMediumCode getMedium() {
		return medium;
	}

	public void setMedium(PresentationMediumCode medium) {
		this.medium = medium;
	}

	public List<Document> getPresentedDocument() {
		return presentedDocument;
	}

	public void setPresentedDocument(List<com.tools20022.repository.entity.Document> presentedDocument) {
		this.presentedDocument = presentedDocument;
	}

	public ElectronicAddress getElectronicPresentationAddress() {
		return electronicPresentationAddress;
	}

	public void setElectronicPresentationAddress(com.tools20022.repository.entity.ElectronicAddress electronicPresentationAddress) {
		this.electronicPresentationAddress = electronicPresentationAddress;
	}

	public ISODate getPresentationDate() {
		return presentationDate;
	}

	public void setPresentationDate(ISODate presentationDate) {
		this.presentationDate = presentationDate;
	}

	public CommunicationMethodCode getApplicableChannel() {
		return applicableChannel;
	}

	public void setApplicableChannel(CommunicationMethodCode applicableChannel) {
		this.applicableChannel = applicableChannel;
	}
}