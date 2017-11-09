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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.Resolution;
import com.tools20022.repository.entity.Vote;
import com.tools20022.repository.entity.VoteInstructionRequest;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Decision of the voting party for one resolution. Several types of decisions
 * can be indicated to allow for split vote specification.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Vote8#mmIssuerLabel
 * Vote8.mmIssuerLabel}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Vote8#mmFor Vote8.mmFor}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Vote8#mmAgainst
 * Vote8.mmAgainst}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Vote8#mmAbstain
 * Vote8.mmAbstain}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Vote8#mmWithhold
 * Vote8.mmWithhold}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Vote8#mmWithManagement
 * Vote8.mmWithManagement}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Vote8#mmAgainstManagement
 * Vote8.mmAgainstManagement}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Vote8#mmDiscretionary
 * Vote8.mmDiscretionary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Vote8#mmOneYear
 * Vote8.mmOneYear}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Vote8#mmTwoYears
 * Vote8.mmTwoYears}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Vote8#mmThreeYears
 * Vote8.mmThreeYears}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Vote8#mmNoAction
 * Vote8.mmNoAction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Vote Vote}</li>
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
 * "Vote8"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Decision of the voting party for one resolution. Several types of decisions can be indicated to allow for split vote specification."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Vote4 Vote4}</li>
 * </ul>
 */
public class Vote8 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text issuerLabel;
	/**
	 * Numbering of the resolution as specified by the issuer or its agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Resolution#mmIssuerLabel
	 * Resolution.mmIssuerLabel}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Vote8
	 * Vote8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssrLabl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerLabel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Numbering of the resolution as specified by the issuer or  its agent."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Vote4#mmIssuerLabel
	 * Vote4.mmIssuerLabel}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIssuerLabel = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Resolution.mmIssuerLabel;
			componentContext_lazy = () -> Vote8.mmObject();
			isDerived = false;
			xmlTag = "IssrLabl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerLabel";
			definition = "Numbering of the resolution as specified by the issuer or  its agent.";
			previousVersion_lazy = () -> Vote4.mmIssuerLabel;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Number for_;
	/**
	 * Number of votes in favour of one resolution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Vote#mmFor Vote.mmFor}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Vote8
	 * Vote8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "For"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "For"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of votes in favour of one resolution."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} = {@linkplain com.tools20022.repository.msg.Vote4#mmFor
	 * Vote4.mmFor}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFor = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Vote.mmFor;
			componentContext_lazy = () -> Vote8.mmObject();
			isDerived = false;
			xmlTag = "For";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "For";
			definition = "Number of votes in favour of one resolution.";
			previousVersion_lazy = () -> Vote4.mmFor;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Number against;
	/**
	 * Number of votes against one resolution
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Vote#mmAgainst
	 * Vote.mmAgainst}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Vote8
	 * Vote8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Agnst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Against"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of votes against one resolution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Vote4#mmAgainst
	 * Vote4.mmAgainst}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAgainst = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Vote.mmAgainst;
			componentContext_lazy = () -> Vote8.mmObject();
			isDerived = false;
			xmlTag = "Agnst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Against";
			definition = "Number of votes against one resolution";
			previousVersion_lazy = () -> Vote4.mmAgainst;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Number abstain;
	/**
	 * Number of votes expressed as abstain for one resolution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Vote#mmAbstain
	 * Vote.mmAbstain}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Vote8
	 * Vote8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Abstn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Abstain"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of votes expressed as abstain for one resolution."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Vote4#mmAbstain
	 * Vote4.mmAbstain}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAbstain = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Vote.mmAbstain;
			componentContext_lazy = () -> Vote8.mmObject();
			isDerived = false;
			xmlTag = "Abstn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Abstain";
			definition = "Number of votes expressed as abstain for one resolution.";
			previousVersion_lazy = () -> Vote4.mmAbstain;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Number withhold;
	/**
	 * Number of votes withheld for one resolution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Vote#mmWithhold
	 * Vote.mmWithhold}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Vote8
	 * Vote8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Wthhld"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Withhold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of votes withheld for one resolution."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Vote4#mmWithhold
	 * Vote4.mmWithhold}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmWithhold = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Vote.mmWithhold;
			componentContext_lazy = () -> Vote8.mmObject();
			isDerived = false;
			xmlTag = "Wthhld";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Withhold";
			definition = "Number of votes withheld for one resolution.";
			previousVersion_lazy = () -> Vote4.mmWithhold;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Number withManagement;
	/**
	 * Number of votes in line with the votes of the management.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Vote#mmWithManagement
	 * Vote.mmWithManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Vote8
	 * Vote8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WthMgmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithManagement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of votes in line with the votes of the management."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Vote4#mmWithManagement
	 * Vote4.mmWithManagement}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmWithManagement = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Vote.mmWithManagement;
			componentContext_lazy = () -> Vote8.mmObject();
			isDerived = false;
			xmlTag = "WthMgmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithManagement";
			definition = "Number of votes in line with the votes of the management.";
			previousVersion_lazy = () -> Vote4.mmWithManagement;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Number againstManagement;
	/**
	 * Number of votes against the voting recommendation of the management.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Vote#mmAgainstManagement
	 * Vote.mmAgainstManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Vote8
	 * Vote8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgnstMgmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgainstManagement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of votes against the voting recommendation of the management."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Vote4#mmAgainstManagement
	 * Vote4.mmAgainstManagement}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAgainstManagement = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Vote.mmAgainstManagement;
			componentContext_lazy = () -> Vote8.mmObject();
			isDerived = false;
			xmlTag = "AgnstMgmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgainstManagement";
			definition = "Number of votes against the voting recommendation of the management.";
			previousVersion_lazy = () -> Vote4.mmAgainstManagement;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Number discretionary;
	/**
	 * Number of votes for which decision is left to the party that will
	 * exercise the voting right.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest#mmDiscretionary
	 * VoteInstructionRequest.mmDiscretionary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Vote8
	 * Vote8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dscrtnry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Discretionary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of votes for which decision is left to the party that will exercise the voting right."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Vote4#mmDiscretionary
	 * Vote4.mmDiscretionary}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDiscretionary = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> VoteInstructionRequest.mmDiscretionary;
			componentContext_lazy = () -> Vote8.mmObject();
			isDerived = false;
			xmlTag = "Dscrtnry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Discretionary";
			definition = "Number of votes for which decision is left to the party that will exercise the voting right.";
			previousVersion_lazy = () -> Vote4.mmDiscretionary;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Number oneYear;
	/**
	 * Number of votes in favour for one year for "say on pay" type of
	 * resolution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Vote#mmOneYear
	 * Vote.mmOneYear}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Vote8
	 * Vote8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OneYr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OneYear"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of votes in favour for one year for \"say on pay\" type of resolution."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOneYear = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Vote.mmOneYear;
			componentContext_lazy = () -> Vote8.mmObject();
			isDerived = false;
			xmlTag = "OneYr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OneYear";
			definition = "Number of votes in favour for one year for \"say on pay\" type of resolution.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Number twoYears;
	/**
	 * Number of votes in favour of two years for "say on pay" type of
	 * resolution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Vote#mmTwoYears
	 * Vote.mmTwoYears}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Vote8
	 * Vote8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TwoYrs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoYears"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of votes in favour of two years for \"say on pay\" type of resolution."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTwoYears = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Vote.mmTwoYears;
			componentContext_lazy = () -> Vote8.mmObject();
			isDerived = false;
			xmlTag = "TwoYrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoYears";
			definition = "Number of votes in favour of two years for \"say on pay\" type of resolution.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Number threeYears;
	/**
	 * Number of votes in favour of three years for "say on pay" type of
	 * resolution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Vote#mmThreeYears
	 * Vote.mmThreeYears}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Vote8
	 * Vote8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ThreeYrs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThreeYears"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of votes in favour of three years for \"say on pay\" type of resolution."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmThreeYears = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Vote.mmThreeYears;
			componentContext_lazy = () -> Vote8.mmObject();
			isDerived = false;
			xmlTag = "ThreeYrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThreeYears";
			definition = "Number of votes in favour of three years for \"say on pay\" type of resolution.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Number noAction;
	/**
	 * Number of votes for which no action has been taken.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Vote#mmNoAction
	 * Vote.mmNoAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Vote8
	 * Vote8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NoActn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of votes for which no action has been taken."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Vote4#mmNoAction
	 * Vote4.mmNoAction}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNoAction = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Vote.mmNoAction;
			componentContext_lazy = () -> Vote8.mmObject();
			isDerived = false;
			xmlTag = "NoActn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAction";
			definition = "Number of votes for which no action has been taken.";
			previousVersion_lazy = () -> Vote4.mmNoAction;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Vote8.mmIssuerLabel, Vote8.mmFor, Vote8.mmAgainst, Vote8.mmAbstain, Vote8.mmWithhold, Vote8.mmWithManagement, Vote8.mmAgainstManagement, Vote8.mmDiscretionary, Vote8.mmOneYear,
						Vote8.mmTwoYears, Vote8.mmThreeYears, Vote8.mmNoAction);
				trace_lazy = () -> Vote.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Vote8";
				definition = "Decision of the voting party for one resolution. Several types of decisions can be indicated to allow for split vote specification.";
				previousVersion_lazy = () -> Vote4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIssuerLabel() {
		return issuerLabel;
	}

	public void setIssuerLabel(Max35Text issuerLabel) {
		this.issuerLabel = issuerLabel;
	}

	public Number getFor() {
		return for_;
	}

	public void setFor(Number for_) {
		this.for_ = for_;
	}

	public Number getAgainst() {
		return against;
	}

	public void setAgainst(Number against) {
		this.against = against;
	}

	public Number getAbstain() {
		return abstain;
	}

	public void setAbstain(Number abstain) {
		this.abstain = abstain;
	}

	public Number getWithhold() {
		return withhold;
	}

	public void setWithhold(Number withhold) {
		this.withhold = withhold;
	}

	public Number getWithManagement() {
		return withManagement;
	}

	public void setWithManagement(Number withManagement) {
		this.withManagement = withManagement;
	}

	public Number getAgainstManagement() {
		return againstManagement;
	}

	public void setAgainstManagement(Number againstManagement) {
		this.againstManagement = againstManagement;
	}

	public Number getDiscretionary() {
		return discretionary;
	}

	public void setDiscretionary(Number discretionary) {
		this.discretionary = discretionary;
	}

	public Number getOneYear() {
		return oneYear;
	}

	public void setOneYear(Number oneYear) {
		this.oneYear = oneYear;
	}

	public Number getTwoYears() {
		return twoYears;
	}

	public void setTwoYears(Number twoYears) {
		this.twoYears = twoYears;
	}

	public Number getThreeYears() {
		return threeYears;
	}

	public void setThreeYears(Number threeYears) {
		this.threeYears = threeYears;
	}

	public Number getNoAction() {
		return noAction;
	}

	public void setNoAction(Number noAction) {
		this.noAction = noAction;
	}
}