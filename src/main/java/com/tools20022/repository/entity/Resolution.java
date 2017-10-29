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
import com.tools20022.repository.codeset.ResolutionTypeCode;
import com.tools20022.repository.codeset.VoteInstructionCode;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.msg.Resolution1;
import com.tools20022.repository.msg.Resolution2;
import com.tools20022.repository.msg.Resolution3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies an item in the agenda of the meeting. Some resolutions are
 * submitted to the vote of the security holders, some are presented for
 * information only.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Resolution" src="doc-files/Resolution.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Resolution#IssuerLabel
 * Resolution.IssuerLabel}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Resolution#Description
 * Resolution.Description}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Resolution#Title
 * Resolution.Title}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Resolution#Type
 * Resolution.Type}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Resolution#ForInformationOnly
 * Resolution.ForInformationOnly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Resolution#SubmittedBySecurityHolder
 * Resolution.SubmittedBySecurityHolder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Resolution#ManagementRecommendation
 * Resolution.ManagementRecommendation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Resolution#NotifyingPartyRecommendation
 * Resolution.NotifyingPartyRecommendation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Resolution#CastVotes
 * Resolution.CastVotes}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Resolution#Meeting
 * Resolution.Meeting}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Resolution#VoteOptions
 * Resolution.VoteOptions}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#AgendaItem
 * Meeting.AgendaItem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Vote#Resolution
 * Vote.Resolution}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Resolution1 Resolution1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Resolution2 Resolution2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Resolution3 Resolution3}</li>
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
 * "Resolution"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies an item in the agenda of the meeting. Some resolutions are submitted to the vote of the security holders, some are presented for information only."
 * </li>
 * </ul>
 */
public class Resolution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Numbering of the resolution as specified by the issuer or its agent.
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
	 * <li>{@linkplain com.tools20022.repository.msg.Resolution1#IssuerLabel
	 * Resolution1.IssuerLabel}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Resolution2#IssuerLabel
	 * Resolution2.IssuerLabel}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote1#IssuerLabel
	 * Vote1.IssuerLabel}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote3#IssuerLabel
	 * Vote3.IssuerLabel}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote4#IssuerLabel
	 * Vote4.IssuerLabel}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote2#IssuerLabel
	 * Vote2.IssuerLabel}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote5#IssuerLabel
	 * Vote5.IssuerLabel}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote7#IssuerLabel
	 * Vote7.IssuerLabel}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Resolution3#IssuerLabel
	 * Resolution3.IssuerLabel}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote6#IssuerLabel
	 * Vote6.IssuerLabel}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote9#IssuerLabel
	 * Vote9.IssuerLabel}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote8#IssuerLabel
	 * Vote8.IssuerLabel}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Resolution Resolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerLabel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Numbering of the resolution as specified by the issuer or  its agent."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute IssuerLabel = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Resolution1.IssuerLabel, com.tools20022.repository.msg.Resolution2.IssuerLabel, com.tools20022.repository.msg.Vote1.IssuerLabel,
					com.tools20022.repository.msg.Vote3.IssuerLabel, com.tools20022.repository.msg.Vote4.IssuerLabel, com.tools20022.repository.msg.Vote2.IssuerLabel, com.tools20022.repository.msg.Vote5.IssuerLabel,
					com.tools20022.repository.msg.Vote7.IssuerLabel, com.tools20022.repository.msg.Resolution3.IssuerLabel, com.tools20022.repository.msg.Vote6.IssuerLabel, com.tools20022.repository.msg.Vote9.IssuerLabel,
					com.tools20022.repository.msg.Vote8.IssuerLabel);
			elementContext_lazy = () -> Resolution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IssuerLabel";
			definition = "Numbering of the resolution as specified by the issuer or  its agent.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Free text description of the resolution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Resolution1#Description
	 * Resolution1.Description}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Resolution2#Description
	 * Resolution2.Description}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Resolution3#Description
	 * Resolution3.Description}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Resolution Resolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Description"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Free text description of the resolution."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Description = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Resolution1.Description, com.tools20022.repository.msg.Resolution2.Description, com.tools20022.repository.msg.Resolution3.Description);
			elementContext_lazy = () -> Resolution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Description";
			definition = "Free text description of the resolution.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Abbreviated description of the resolution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Resolution1#Title
	 * Resolution1.Title}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Resolution2#Title
	 * Resolution2.Title}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Resolution3#Title
	 * Resolution3.Title}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Resolution Resolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Title"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Abbreviated description of the resolution."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Title = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Resolution1.Title, com.tools20022.repository.msg.Resolution2.Title, com.tools20022.repository.msg.Resolution3.Title);
			elementContext_lazy = () -> Resolution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Title";
			definition = "Abbreviated description of the resolution.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Indicates whether a resolution is ordinary, extraordinary or special.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ResolutionTypeCode
	 * ResolutionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Resolution1#Type
	 * Resolution1.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Resolution2#Type
	 * Resolution2.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Resolution3#Type
	 * Resolution3.Type}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Resolution Resolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether a resolution is ordinary, extraordinary or special."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Resolution1.Type, com.tools20022.repository.msg.Resolution2.Type, com.tools20022.repository.msg.Resolution3.Type);
			elementContext_lazy = () -> Resolution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Indicates whether a resolution is ordinary, extraordinary or special.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ResolutionTypeCode.mmObject();
		}
	};
	/**
	 * Indicates whether the resolution is listed for information or for voting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Resolution1#ForInformationOnly
	 * Resolution1.ForInformationOnly}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Resolution2#ForInformationOnly
	 * Resolution2.ForInformationOnly}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Resolution3#ForInformationOnly
	 * Resolution3.ForInformationOnly}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Resolution Resolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForInformationOnly"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the resolution is listed for information or for voting."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ForInformationOnly = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Resolution1.ForInformationOnly, com.tools20022.repository.msg.Resolution2.ForInformationOnly, com.tools20022.repository.msg.Resolution3.ForInformationOnly);
			elementContext_lazy = () -> Resolution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ForInformationOnly";
			definition = "Indicates whether the resolution is listed for information or for voting.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the resolution has been submitted by the security
	 * holder.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Resolution1#SubmittedBySecurityHolder
	 * Resolution1.SubmittedBySecurityHolder}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Resolution2#SubmittedBySecurityHolder
	 * Resolution2.SubmittedBySecurityHolder}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Resolution3#SubmittedBySecurityHolder
	 * Resolution3.SubmittedBySecurityHolder}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Resolution Resolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubmittedBySecurityHolder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the resolution has been submitted by the security holder."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SubmittedBySecurityHolder = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Resolution1.SubmittedBySecurityHolder, com.tools20022.repository.msg.Resolution2.SubmittedBySecurityHolder,
					com.tools20022.repository.msg.Resolution3.SubmittedBySecurityHolder);
			elementContext_lazy = () -> Resolution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubmittedBySecurityHolder";
			definition = "Indicates whether the resolution has been submitted by the security holder.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates how the management of the issuing company wishes the security
	 * holders to vote.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.VoteInstructionCode
	 * VoteInstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Resolution1#ManagementRecommendation
	 * Resolution1.ManagementRecommendation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Resolution2#ManagementRecommendation
	 * Resolution2.ManagementRecommendation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Resolution3#ManagementRecommendation
	 * Resolution3.ManagementRecommendation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Resolution Resolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManagementRecommendation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates how the management of the issuing company wishes the security holders to vote."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ManagementRecommendation = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Resolution1.ManagementRecommendation, com.tools20022.repository.msg.Resolution2.ManagementRecommendation,
					com.tools20022.repository.msg.Resolution3.ManagementRecommendation);
			elementContext_lazy = () -> Resolution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ManagementRecommendation";
			definition = "Indicates how the management of the issuing company wishes the security holders to vote.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> VoteInstructionCode.mmObject();
		}
	};
	/**
	 * Indicates how the notifying party recommends that the security holders
	 * vote.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.VoteInstructionCode
	 * VoteInstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Resolution1#NotifyingPartyRecommendation
	 * Resolution1.NotifyingPartyRecommendation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Resolution2#NotifyingPartyRecommendation
	 * Resolution2.NotifyingPartyRecommendation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Resolution3#NotifyingPartyRecommendation
	 * Resolution3.NotifyingPartyRecommendation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Resolution Resolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotifyingPartyRecommendation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates how the notifying party recommends that the security holders vote."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute NotifyingPartyRecommendation = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Resolution1.NotifyingPartyRecommendation, com.tools20022.repository.msg.Resolution2.NotifyingPartyRecommendation,
					com.tools20022.repository.msg.Resolution3.NotifyingPartyRecommendation);
			elementContext_lazy = () -> Resolution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotifyingPartyRecommendation";
			definition = "Indicates how the notifying party recommends that the security holders vote.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> VoteInstructionCode.mmObject();
		}
	};
	/**
	 * Specifies whether a resolution is accepted or not and details the number
	 * of votes and their status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Vote#Resolution
	 * Vote.Resolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Vote Vote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Resolution Resolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CastVotes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether a resolution is accepted or not and details the number of votes and their status."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CastVotes = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Resolution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CastVotes";
			definition = "Specifies whether a resolution is accepted or not and details the number of votes and their status.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Vote.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Vote.Resolution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Meeting for which an agenda item is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#AgendaItem
	 * Meeting.AgendaItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Meeting Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Resolution Resolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Meeting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Meeting for which an agenda item is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Meeting = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Resolution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Meeting";
			definition = "Meeting for which an agenda item is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Meeting.AgendaItem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Vote options allowed at the resolution level. When specified, it
	 * supersedes the vote options given for the meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.VoteInstructionCode
	 * VoteInstructionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Resolution Resolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteOptions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Vote options allowed at the resolution level. When specified, it supersedes the vote options given for the meeting."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute VoteOptions = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Resolution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VoteOptions";
			definition = "Vote options allowed at the resolution level. When specified, it supersedes the vote options given for the meeting.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> VoteInstructionCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Resolution";
				definition = "Specifies an item in the agenda of the meeting. Some resolutions are submitted to the vote of the security holders, some are presented for information only.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Meeting.AgendaItem, com.tools20022.repository.entity.Vote.Resolution);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Resolution.IssuerLabel, com.tools20022.repository.entity.Resolution.Description, com.tools20022.repository.entity.Resolution.Title,
						com.tools20022.repository.entity.Resolution.Type, com.tools20022.repository.entity.Resolution.ForInformationOnly, com.tools20022.repository.entity.Resolution.SubmittedBySecurityHolder,
						com.tools20022.repository.entity.Resolution.ManagementRecommendation, com.tools20022.repository.entity.Resolution.NotifyingPartyRecommendation, com.tools20022.repository.entity.Resolution.CastVotes,
						com.tools20022.repository.entity.Resolution.Meeting, com.tools20022.repository.entity.Resolution.VoteOptions);
				derivationComponent_lazy = () -> Arrays.asList(Resolution1.mmObject(), Resolution2.mmObject(), Resolution3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}